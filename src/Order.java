import java.util.*;

public class Order {

    // Class Attributes
    protected UUID orderID;
    protected UUID userID;
    protected List<OrderDetails> orderList;

    // Class Constructor
    public Order(UUID userID) {
        this.orderID = UUID.randomUUID();
        this.userID = userID;
        this.orderList = new ArrayList<>();
    }

    // Class Getters
    public UUID getOrderID() {
        return orderID;
    }
    public UUID getUserID() {
        return userID;
    }
    public List<OrderDetails> getOrderList() {
        return orderList;
    }

    // Class Setters
    public void setUserID(UUID userID) {
        this.userID = userID;
    }
    public void setOrderList(List<OrderDetails> orderList) {
        this.orderList = orderList;
    }

    public void addOrderDetail(OrderDetails orderDetails) {
        orderList.add(orderDetails);
    }

    @Override
    public String toString() {
        return "Order ID: " + orderID +
                "\nUser ID: " + userID +
                "\nItems:\n" + orderList;
    }
}
