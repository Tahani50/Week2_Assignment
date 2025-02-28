import java.util.*;

public class Clothing extends Product{

    // Class Attributes
    protected UUID clothingID;
    protected String brand;
    protected String size;
    protected String color;

    // Class Constructor
    public Clothing(String name, String category, double price, int stockQuantity, String brand, String size, String color) {
        super(name, category, price, stockQuantity);
        this.clothingID = UUID.randomUUID();
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    // Class Getters
    public UUID getClothingID() {
        return clothingID;
    }
    public String getBrand() {
        return brand;
    }
    public String getSize() {
        return size;
    }
    public String getColor() {
        return color;
    }

    //Class Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double calculateDiscount(){
        return getPrice() - (getPrice() * 0.10);
    }
}