package Student;
import java.util.Scanner;
class BookshelfManager {
    Book[] books;

    public BookshelfManager(int capacity) {
        books = new Book[capacity];
    }

    public void inputBookData() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < books.length; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.print("ISBN: ");
            String isbn = scanner.nextLine();
            System.out.print("Year: ");
            int year = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            books[i] = new Book(title, author, isbn, year);
        }
    }

    public void displayBooks() {
        System.out.println("Books on the Shelf:");
        for (Book book : books) {
            System.out.println("Title: " + book.title + ", Author: " + book.author +
                    ", ISBN: " + book.isbn + ", Year: " + book.year);
        }
    }

    public void sortBooks(String sortingAlgorithm) {
        switch (sortingAlgorithm.toLowerCase()) {
            case "selection":
                // Implement Selection Sort
                break;
            case "bubble":
                // Implement Bubble Sort
                break;
            case "merge":
                // Implement Merge Sort
                break;
            default:
                System.out.println("Invalid sorting algorithm selection.");
        }
    }

    public int searchByISBN(String isbn, int low, int high) {
        if (low > high) {
            return -1; // Book not found
        }

        int mid = (low + high) / 2;
        int comparison = isbn.compareTo(books[mid].isbn);

        if (comparison == 0) {
            return mid; // Book found
        } else if (comparison < 0) {
            return searchByISBN(isbn, low, mid - 1); // Search in the left half
        } else {
            return searchByISBN(isbn, mid + 1, high); // Search in the right half
        }
    }
}
