package main.java;

public class Book {

    // declaring each property of book class

    private final String isbn;
    private final String title;
    private final String author;
    private final int publicationYear;
    private boolean isAvailable;

    // initializing property of book class by using constructor
    public Book(String isbn, String title, String author, int publicationYear) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isAvailable = true;
    }

    // function will return Isbn
    public String getIsbn() {
        return isbn;
    }

    // function will return Title
    public String getTitle() {
        return title;
    }

    // function will return Author
    public String getAuthor() {
        return author;
    }

    // function will return Publication year
    public int getPublicationYear() {
        return publicationYear;
    }

    // function will return book is available or not
    public boolean isAvailable() {
        return isAvailable;
    }

    // function will set isAvailable or not
    public void setAvailable(boolean available) {
        isAvailable = available;
    }

}
