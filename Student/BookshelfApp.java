package Student;
// shafin-252-f-BSE
import java.util.Scanner;
public class BookshelfApp {
    public static void main(String[] args) {
        BookshelfManager bookshelf = new BookshelfManager(5);

        // Input book data
        bookshelf.inputBookData();

        // Display the original books
        bookshelf.displayBooks();

        // Sort the books (let's say, using Selection Sort for this example)
        bookshelf.sortBooks("selection");

        // Display the sorted books
        bookshelf.displayBooks();

        // Search for a book by ISBN using recursion
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ISBN to search: ");
        String searchISBN = scanner.nextLine();
        int result = bookshelf.searchByISBN(searchISBN, 0, bookshelf.books.length - 1);

        if (result != -1) {
            System.out.println("Book found at index: " + result);
        } else {
            System.out.println("Book not found.");
        }
    }
}