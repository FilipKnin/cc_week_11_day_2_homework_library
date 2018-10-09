import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;
    Library library;

    @Before
    public void before() {
        book = new Book("Title1", "Author1", "sci-fi");
        library = new Library(5);
    }

    @Test
    public void hasTitle() {
        assertEquals("Title1", book.getTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("Author1", book.getAuthor());
    }

    @Test
    public void hasGenre() {
        assertEquals("sci-fi", book.getGenre());
    }

}
