package main.java;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books;

    // initializing 'books' list
    public Library() {
        this.books = new ArrayList<>();
    }

    // function will add new book in books list
    public void addBook(Book book) {
        // check for already book is exist or not
        for (Book b : books) {
            if (b.getIsbn().equals(book.getIsbn())) {
                // throw exception if already exist
                throw new IllegalArgumentException("Book with ISBN " + book.getIsbn() + " already exists");
            }
        }
        books.add(book);
    }

    // function will return list of Book object which is available
    public List<Book> getAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.isAvailable()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }

}
