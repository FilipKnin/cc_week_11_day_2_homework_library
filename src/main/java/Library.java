import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Integer> stock;

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
}
