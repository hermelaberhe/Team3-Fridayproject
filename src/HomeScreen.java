package src;

import java.util.Scanner;

public class HomeScreen {

    public static void HomeScreen(){
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
                DisplayProducts.displayProducts();
                break;
            case "2":
                displayCart();
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

    public static void displayProducts () {
        System.out.println("\n--- Product List ---");
        System.out.println("Product 1: JBL Bluetooth Speaker - $89.95");
        System.out.println("Product 2: Mini 1000 Lumens Projector - $149.95");
        System.out.println("Product 3: Retro Handheld Arcade - $24.45");
        System.out.println("Product 4: Solar Powered Battery Charger - $19.99");
        // Later, you can replace this with store inventory
    }

    public static void displayCart () {
        System.out.println("\n--- Your Cart ---");
        System.out.println("Cart is currently empty.");
        // Later you can actually load cart items

    }
}