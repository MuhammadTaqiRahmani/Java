package Lab6_BSE_283;
//Muhammad Taqi Rahmani - BSE - 283 - 2022F - section F
import java.util.LinkedList;
import java.util.Scanner;

public class OperationsInPersonLinkedList {
    static class Person {
        String name;
        int age;
        double salary;

        public Person(String name, int age, double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Age: " + age + ", Salary: " + salary;
        }
    }

    public static int view(LinkedList<Person> link) {
        System.out.println("Person Records:");
        for (Person person : link) {
            System.out.println(person);
        }
        return -1;
    }

    public static void insertion(LinkedList<Person> link) {
        view(link);
        Person newPerson = new Person("Ali", 25, 40000.0);
        link.add(5, newPerson);

        System.out.println("_______");
        view(link);
    }

    public static void deletion(LinkedList<Person> link) {
        view(link);
        link.remove(3);

        System.out.println("___________");
        view(link);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Person> persons = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = input.next();
            System.out.print("Age: ");
            int age = input.nextInt();
            System.out.print("Salary: ");
            double salary = input.nextDouble();

            persons.add(new Person(name, age, salary));
        }

        System.out.println("1_view\n2_insertion\n3_deletion");
        System.out.print("Enter the decision:: ");
        int dec = input.nextInt();

        if (dec == 1) {
            System.out.println("Viewing the linked list");
            view(persons);
        } else if (dec == 2) {
            insertion(persons);
        } else if (dec == 3) {
            deletion(persons);
        }
    }
}

