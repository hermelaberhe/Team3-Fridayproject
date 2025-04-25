import src.Products;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DisplayProducts {

   static ArrayList<src.Products> arrProducts = new ArrayList<>();

    public static void loadProducts() throws FileNotFoundException {
        Scanner fileScanner = new Scanner(new File("Product.csv"));
        if (fileScanner.hasNextLine()) {
            fileScanner.nextLine();  // Skips the header line
        }
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            String[] splitted = line.split("\\|");

            String sku = splitted[0].trim();
            String name = splitted[1].trim();
            double price = Double.parseDouble(splitted[2].trim().replace("$", "").trim());
            String department = splitted[3].trim();

            arrProducts.add(new Products(sku, name, price, department));
        }
        //Prints the products
        for (Products product : arrProducts) {
            System.out.println(product);
        }
    }


    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("\n-- Display Products Menu --");
            loadProducts();
            System.out.println("--  --");
            System.out.println("1. Search or filter products");
            System.out.println("2. Add product to cart");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");


            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:


                    break;
                case 2:
//
                    break;
                case 3:
//
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");

            }
        }
    }
}


