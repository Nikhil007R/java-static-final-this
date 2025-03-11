class Book {
    private static String libraryName = "City Library"; // Static variable
    private final String isbn; // Final variable (cannot be changed)
    private String title;
    private String author;

    // Constructor using 'this' to resolve ambiguity
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public void displayBookDetails() {
        if (this instanceof Book) { // Using instanceof
            System.out.println("Library: " + libraryName);
            System.out.println("ISBN: " + isbn);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
        }
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
}

// Main class
public class LibrarySystem {
    public static void main(String[] args) {
        Book book1 = new Book("978-81-933904-8-1", "ACCIDENTS DO NOT HAPPEN", "Dr Sankar Rajeev");
        Book book2 = new Book("978-93-87769-21-2", "FEMINISM From Existentialism to Liberation", "Dominic Joseph P");

        book1.displayBookDetails();
        book2.displayBookDetails();
        Book.displayLibraryName();
    }
}