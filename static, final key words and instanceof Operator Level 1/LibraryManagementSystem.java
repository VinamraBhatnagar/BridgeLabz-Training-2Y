class Book {
    static String libraryName = "City Central Library";

    String title;
    String author;
    final String isbn;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("Not a valid book object.");
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book.displayLibraryName();

        Book b1 = new Book("Java Programming", "James Gosling", "ISBN12345");
        Book b2 = new Book("Effective Java", "Joshua Bloch", "ISBN67890");

        b1.displayBookDetails();
        System.out.println();
        b2.displayBookDetails();
    }
}
