package main.java;

public class Main {
    public static void main(String[] args) {
        // creating objects of book and library class

        Library lib = new Library();
        Book b1 = new Book("123456", "Atomic Habits", "James Clear", 2018);
        Book b2 = new Book("123457", "how to make friends and influence people", "Dale Carnegie", 1936);
        Book b3 = new Book("123458", "DSA using C++", "D.S. Malik", 2003);
        // adding book b1

        lib.addBook(b1);
        lib.addBook(b2);

        lib.borrowBook("123456");
        lib.addBook(b3);
        lib.returnBook("123456");
        lib.viewAvailableBooks();

    }
}
