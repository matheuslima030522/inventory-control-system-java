import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Sample data
        inventory.addProduct(new Product("TV", 1800.00, 10));
        inventory.addProduct(new Product("AirFryer", 300.00, 8));

        Scanner in = new Scanner(System.in);

        System.out.println("Inventory Control System - Java");
        System.out.println("1) List products");
        System.out.println("2) Search product by name");
        System.out.println("0) Exit");

        while (true) {
            System.out.print("\nChoose an option: ");
            int option = in.nextInt();
            in.nextLine(); // consume newline

            if (option == 1) {
                inventory.listProducts();
            } else if (option == 2) {
                System.out.print("Enter product name: ");
                String name = in.nextLine();
                Product found = inventory.findByName(name);

                if (found != null) {
                    System.out.println("Found: " + found);
                } else {
                    System.out.println("Product not found.");
                }
            } else if (option == 0) {
                System.out.println("Bye!");
                break;
            } else {
                System.out.println("Invalid option.");
            }
        }
    }
}