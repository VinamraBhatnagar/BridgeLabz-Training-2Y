class Product {
    static double discount = 10.0;

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }

    private String productName;
    private double price;
    private int quantity;
    private final int productID;

    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    void displayDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            double discountedPrice = price - (price * discount / 100);
            System.out.println("Discounted Price: " + discountedPrice);
            System.out.println("---------------------------");
        } else {
            System.out.println("Not a valid Product object.");
        }
    }
}

public class ProductSystem {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", 50000, 2);
        Product p2 = new Product(102, "Mobile", 20000, 5);

        p1.displayDetails();
        p2.displayDetails();

        Product.updateDiscount(15);

        System.out.println("After updating discount:");
        p1.displayDetails();
        p2.displayDetails();
    }
}
