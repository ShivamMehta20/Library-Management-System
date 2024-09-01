import main.java.*;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;

public class LibraryTest {
    private Library library;
    private Book book;

    @BeforeClass
    public void setup() {
        library = new Library();
        book = new Book("123456","sample book","me",2009);
    }

    @Test
    public void testAddBook() {
        library.addBook(book);
        assertEquals(1, library.getAvailableBooks().size());

    }
}