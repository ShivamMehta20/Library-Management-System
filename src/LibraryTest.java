import main.java.*;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

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
    public void testBorrowBook() {

        library.addBook(samplebook);
        library.borrowBook("123456");
        // if all available book is 0 then book is borrowed
        assertEquals(0, library.getAvailableBooks().size());
    }

    // testing return book feature
    @Test
    public void testReturnBook() {
        library.addBook(samplebook);
        library.borrowBook("123456");
        library.returnBook("123456");
        assertEquals(1, library.getAvailableBooks().size());

    }
    // testing available book feature
@Test
public void testAvailableBook()
{
    library.addBook(samplebook);
    library.addBook(new Book("123457", "how to make friends ", " Dale Carnegie", 1936));
    library.borrowBook("123456");
    List<Book> books = library.getAvailableBooks();
    // test that list book returned by getAvailableBooks true value
    assertEquals( 1, books.size());
    assertEquals("123457", books.get(0).getIsbn());
}
}