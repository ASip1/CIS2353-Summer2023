import java.util.Iterator;
import java.util.*;
import java.text.DecimalFormat;

public class ShoppingCart {
    private List<Item> cart;

    public ShoppingCart(BagInterface<Item> cart) {
        this.cart = new ArrayList<>();
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n**** Shopping Cart Menu ****");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Remove a specific item");
            System.out.println("4. Item count");
            System.out.println("5. Abandon cart");
            System.out.println("6. Print receipt");
            System.out.println("7. Exit");
            System.out.print("Make a selection: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addItemToCart(scanner);
                    break;
                case 2:
                    removeItemFromCart();
                    ItemFromCart(scanner);
                    break;
                case 3:
                    removeSpecificItemFromCart(scanner);
                    break;
                case 4:
                    System.out.println("Number of items in cart: " + getCartItemCount());
                    break;
                case 5:
                    abandonCart();
                    break;
                case 6:
                    printReceipt();
                    break;
                case 7:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Not a valid option. Please try again.");
                    break;
            }
        }
    }

    private void ItemFromCart(Scanner scanner) {
    }

    private void addItemToCart(Scanner scanner) {
        System.out.print("Enter item name: ");
        String name = scanner.nextLine();

        System.out.print("Enter item price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        Item item = new Item(name, price);
        cart.add(item);
        System.out.println("Item added to cart successfully.");
    }

    private void removeItemFromCart() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty. There are no items to remove.");
            return;
        }

        Random random = new Random();
        int randomIndex = random.nextInt(cart.size());

        Item removedItem = cart.remove(randomIndex);
        System.out.println("1 item '" + removedItem.getName() + "' removed from cart.");
    }

    private void removeSpecificItemFromCart(Scanner scanner) {
        System.out.print("Enter the name of the specific item to remove: ");
        String name = scanner.nextLine();

        System.out.print("Enter the price of the specific item to remove: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        boolean found = false;
        Item removedItem = null;

        Iterator<Item> iterator = cart.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            if (item.getName().equals(name) && item.getPrice() == price) {
                iterator.remove();
                found = true;
                removedItem = item;
                break;
            }
        }

        if (found) {
            System.out.println("Item '" + removedItem.getName() + "' with price $" + removedItem.getPrice() +
                    " removed from cart successfully.");
        } else {
            System.out.println("Item not found in the cart.");
        }
    }

    private int getCartItemCount() {
        return cart.size();
    }

    private void abandonCart() {
        cart.clear();
        System.out.println("Cart abandoned. All items removed.");
    }

    private void printReceipt() {
        System.out.println("------ Receipt ------");
        double totalCost = 0;

        for (Item item : cart) {
            System.out.println(item.getName() + " - $" + item.getPrice());
            totalCost += item.getPrice();
        }

        System.out.println("-------------------------");
        System.out.printf("Total cost: $" + totalCost);
    }
}