import java.util.Scanner;

public class HomeScreen {
    public static void display(Store store) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== Welcome to the Online Store ===");
            System.out.println("1. Display Products");
            System.out.println("2. Display Cart");
            System.out.println("3. Exit");
            System.out.print("Please enter your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    store.displayProducts();
                    break;
                case "2":
                    store.displayCart();
                    break;
                case "3":
                    System.out.println("Thank you for shopping with us. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid input. Please enter 1, 2, or 3.");
                    break;
            }
        }
    }
}
