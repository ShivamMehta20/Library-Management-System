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

    // testing addBook feature
    @Test
    public void testAddBook() {
        library.addBook(samplebook);
        // asserts that book is added
        assertEquals(1, library.getAvailableBooks().size());

    }
}