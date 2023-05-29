import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BagInterface<Item> cart = new BagArray<>() {
            @Override
            public int getCurrentSize() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean add(Item newEntry) {
                return false;
            }

            @Override
            public boolean remove(Item anEntry) {
                return false;
            }

            @Override
            public Item remove() {
                return null;
            }

            @Override
            public void clear() {

            }

            @Override
            public int getFrequencyOf(Item anEntry) {
                return 0;
            }

            @Override
            public boolean contains(Item anEntry) {
                return false;
            }

            @Override
            public Item[] toArray() {
                return new Item[0];
            }
        };
        ShoppingCart shoppingCart = new ShoppingCart(cart);
        shoppingCart.displayMenu();
    }
}
