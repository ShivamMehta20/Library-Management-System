package main.java;

public class Main {
    public static void main(String[] args) {
        // creating objects of book and library class

        Library lib = new Library();
        Book b1 = new Book("123456", "Atomic Habits", "James Clear", 2018);
        // adding book b1

        lib.addBook(b1);

    }
}
