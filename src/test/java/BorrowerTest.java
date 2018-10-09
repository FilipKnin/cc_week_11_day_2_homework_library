import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void before() {
        borrower = new Borrower("name1");
        book = new Book("Title1", "Author1", "sci-fi");
        library = new Library(5);
    }

    @Test
    public void hasName() {
        assertEquals("name1", borrower.getName());
    }

    @Test
    public void hasCountCollection() {
        assertEquals(0, borrower.countCollection());
    }

    @Test
    public void hasBorrowBook() {
        library.addBookToStock(book);
        library.addBookToStock(book);
        borrower.borrowBook(library);
        assertEquals(1, library.countStock());
        assertEquals(1, borrower.countCollection());
    }
}
