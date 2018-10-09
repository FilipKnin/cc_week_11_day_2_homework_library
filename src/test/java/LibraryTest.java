import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Book book;
    Library library;

    @Before
    public void before() {
        book = new Book("Title1", "Author1", "sci-fi");
        library = new Library(5);
    }

    @Test
    public void hasCapacity() {
        assertEquals(5, library.getCapacity());
    }

    @Test
    public void hasCountStock() {
        assertEquals(0, library.countStock());
    }


}
