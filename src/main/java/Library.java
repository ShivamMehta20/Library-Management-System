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
        System.out.println("book is added with isbn: " + book.getIsbn());
    }

    // function for borrow Book
    public void borrowBook(String isbn) {

        Book book = findBook(isbn);
        // checking if book is not available then throw exception
        if (!book.isAvailable()) {
            throw new IllegalArgumentException("Book with " + book.getIsbn() + "is not available");
        }

        book.setAvailable(false);
        System.out.println("book is borrowed with isbn :" + isbn);

    }

    // function will return book with isbn equals to argument isbn
    private Book findBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        throw new IllegalArgumentException();
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

    // function will return book which was borrowed with given isbn
    public void returnBook(String isbn) {
        Book book = findBook(isbn);

        if (book.isAvailable()) {
            throw new IllegalArgumentException("Book with" + book.getIsbn() + "is not borrowed");
        }
        book.setAvailable(true);
        System.out.println("book is returned with isbn:" + isbn);
    }

    // function will iterate through available books and print each book information
    public void viewAvailableBooks() {
        List<Book> availablBook = getAvailableBooks();
        if (availablBook.size() == 0) {
            throw new IllegalArgumentException("0 book available");
        }
        System.err.println(" Available books are ::\n");
        for (Book book : availablBook) {
            System.err
                    .println(" isbn:" + book.getIsbn() + "\n title:" + book.getTitle() + "\n author:" + book.getAuthor()
                            + "\n publication Year:" + book.getPublicationYear() + "\n \n");
        }
    }
}
