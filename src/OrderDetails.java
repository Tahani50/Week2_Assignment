import java.util.*;

public class OrderDetails {

    // Class Attributes
    protected UUID orderDetailID;
    protected UUID orderID;
    protected UUID productID;
    protected int quantity;
    protected double subTotal;

    // Class Constructor
    public OrderDetails(UUID orderID, UUID productID, int quantity, double subTotal) {
        this.orderDetailID = UUID.randomUUID();
        this.orderID = orderID;
        this.productID = productID;
        this.quantity = quantity;
        this.subTotal = subTotal * quantity;
    }

    //Class Getters
    public UUID getOrderDetailID() {
        return orderDetailID;
    }
    public UUID getOrderID() {
        return orderID;
    }
    public UUID getProductID() {
        return productID;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getSubTotal() {
        return subTotal * quantity;
    }

    // Class Setters
    public void setProductID(UUID productID) {
        this.productID = productID;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal * quantity;
    }

    @Override
    public String toString() {
        return "Order Detail ID: " + orderDetailID +
                "\nOrder ID: " + orderID +
                "\nProduct ID:" + productID +
                "\nQuantity: " + quantity +
                "\nSubTotal: " + subTotal + "\n";
    }
}
