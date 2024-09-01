# Library Management System

This is a simple library management system implemented in java.

# setup
 
1.  clone the repository

2. Ensure you have Java Development Kit (JDK) 11 or later installed.

## Running Tests

This will run all tests and generate a test report :

 run  ./src/test/main/LibraryTest.java to test .

## Usage
You can use it in your Java code like this:

```java
Library library = new Library();
library.addBook(new Book("1234567890", "Sample Book", "John Doe", 2023));
library.borrowBook("1234567890");
library.returnBook("1234567890");
List<Book> availableBooks = library.getAvailableBooks();


