import main.java.*;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;

public class LibraryTest {
    private Library library;
    private Book samplebook;

    // doing setup for each test
    @Before
    public void setup() {
        library = new Library();
        samplebook = new Book("123456", "sample book", "me", 2009);
    }

    // testing that book is added or not
    @Test
    public void testAddBook() {
        library.addBook(samplebook);
        // asserts that book is added
        assertEquals(1, library.getAvailableBooks().size());

    }
// testing Book is borrowed or not  
    @Test
    public void testBorrowBook()
    {

        library.addBook(samplebook);
        library.borrowBook("123456");
        // if all available book is 0 then book is borrowed
        assertEquals(0, library.getAvailableBooks().size());
    }

    // testing return book feature
    @Test 
    public void testReturnBook()
    {
            library.addBook(samplebook);
            library.borrowBook("123456");
            library.returnBook("123456");
            assertEquals(1, library.getAvailableBooks().size());

        }
}