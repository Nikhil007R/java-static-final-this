class Product {
    // Static variable shared by all products
    static double discount = 10.0; // Default discount in percentage

    // Final variable to ensure unique product ID
    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    // Constructor using 'this' keyword
    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update discount
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }

    // Method to calculate the final price after discount
    public double getFinalPrice() {
        return price - (price * discount / 100);
    }

    // Method to display product details (checks instanceof)
    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("======= Product Details =======");
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Original Price: $" + price);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Final Price: $" + getFinalPrice());
            System.out.println("Quantity Available: " + quantity);
        }
    }

    public static void main(String[] args) {
        // Creating Product objects
        Product p1 = new Product(11, "Iron", 1100.00, 5);
        Product p2 = new Product(12, "Watch", 2500.00, 10);

        // Displaying product details
        p1.displayProductDetails();
        p2.displayProductDetails();

        // Updating discount for all products
        Product.updateDiscount(15.0);

        // Displaying updated product details
        p1.displayProductDetails();
        p2.displayProductDetails();
    }
}
