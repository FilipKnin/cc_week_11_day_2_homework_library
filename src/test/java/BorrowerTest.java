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
}
