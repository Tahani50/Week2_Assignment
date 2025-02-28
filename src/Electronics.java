import java.util.*;

public class Electronics extends Product{

    // Class Attributes
    private UUID electronicID;
    private String brand;
    private boolean smartDevice;

    // Class Constructor
    public Electronics(String name, String category, double price, int stockQuantity, boolean smartDevice, String brand) {
        super(name, category, price, stockQuantity);
        this.electronicID = UUID.randomUUID();
        this.brand = brand;
        this.smartDevice = smartDevice;
    }

    // Class Getters
    public UUID getElectronicID() {
        return electronicID;
    }
    public String getBrand() {
        return brand;
    }
    public boolean getSmartDevice() {
        return smartDevice;
    }

    // Class Setters
    public void setElectronicID(UUID electronicID) {
        this.electronicID = electronicID;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setSmartDevice(boolean smartDevice) {
        this.smartDevice = smartDevice;
    }

    @Override
    public double calculateDiscount(){
        return getPrice() - (getPrice() * 0.15);
    }
}
