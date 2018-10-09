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

    @Test
    public void hasAddBookToStock() {
        library.addBookToStock(book);
        assertEquals(1, library.countStock());
    }

    @Test
    public void hasCheckCapacityTrue() {
        library.checkCapacity();
        assertEquals(true, library.checkCapacity());
    }

    @Test
    public void hasCheckCapacityFalse() {
        library.addBookToStock(book);
        library.addBookToStock(book);
        library.addBookToStock(book);
        library.addBookToStock(book);
        library.addBookToStock(book);
        library.checkCapacity();
        assertEquals(false, library.checkCapacity());
    }

    @Test
    public void addBookIfThereIsNoSpace() {
        library.addBookToStock(book);
        library.addBookToStock(book);
        library.addBookToStock(book);
        library.addBookToStock(book);
        library.addBookToStock(book);
        library.addBookToStock(book);
        assertEquals(5, library.countStock());
    }



}
