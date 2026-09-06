import java.util.Scanner;

class Book {
    int bookId;
    String bookTitle;
    String author;
    boolean available;

    Book(int bookId, String bookTitle, String author) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.author = author;
        this.available = true;
    }

    void issueBook() {
        if (available) {
            available = false;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book is already issued.");
        }
    }

    void returnBook() {
        if (!available) {
            available = true;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book was not issued.");
        }
    }

    void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author: " + author);
        System.out.println("Availability: " +
                (available ? "Available" : "Issued"));
    }
}

public class Question5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        sc.nextLine();

        String title = sc.nextLine();
        String author = sc.nextLine();

        Book b = new Book(id, title, author);

        b.displayBook();

        b.issueBook();
        b.issueBook();

        b.returnBook();

        b.displayBook();
    }
}