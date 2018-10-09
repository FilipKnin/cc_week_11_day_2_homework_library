import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Book> stock;

    public Library(int capacity) {
        this.capacity = capacity;
        this.stock = new ArrayList<>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int countStock() {
        return this.stock.size();
    }

    public void addBookToStock(Book book) {
        if (checkCapacity() == true) {
            this.stock.add(book);
        }
    }

    public boolean checkCapacity() {
        if (countStock() < getCapacity() ) {
            return true;
        } else {

            return false;
        }
    }


}
