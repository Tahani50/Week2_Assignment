import java.util.*;

class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);  // Call the parent constructor with the error message
    }
}

public class Product {

    // Class Attributes
    protected UUID productID;
    protected String name;
    protected String category;
    protected double price;
    protected int stockQuantity;

    // Class Constructor
    public Product(String name, String category, double price, int stockQuantity) {
        this.productID = UUID.randomUUID();
        this.name = name;
        this.category = category;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    // Class Getters
    public UUID getProductID() {
        return productID;
    }
    public String getName() {
        return name;
    }
    public String getCategory() {
        return category;
    }
    public double getPrice() {
        return price;
    }
    public int getStockQuantity() {
        return stockQuantity;
    }

    // Class Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public double calculateDiscount() {
        return getPrice() - (getPrice()  * 0.5);
    }

    public void reduceStock(int quantity) throws OutOfStockException {

        //Check stock availability
        if (quantity > stockQuantity) {
            throw new OutOfStockException("Not enough stock for " + name);
        }else {
            stockQuantity -= quantity;
            System.out.println("Successful Purchase!");
        }
    }

    @Override
    public String toString() {
        return name + " (" + category + ") - $" + price + " | Stock: " + stockQuantity;
    }
}
