package src;

public class Products {
    String sku;
    String name;
    double price;
    String department;

    public Products(String sku, String name, double price, String department) {
        this.sku = sku;
        this.name = name;
        this.price = price;
        this.department = department;
    }

    public String getSku() {
        return sku;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDepartment() {
        return department;
    }
    @Override
    public String toString() {
        return String.format("%s  %s  $%.2f %s", sku, name, price, department);
    }
}
