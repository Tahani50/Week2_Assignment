import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<>();
        HashMap<UUID, List<Order>> orderHistory = new HashMap<>();

        // Samples
        Product laptop = new Electronics("Laptop", "Electronics", 2000.00, 20, true ,"Huawei");
        Product t_shirt = new Clothing("T-shirt", "Clothing", 30.00, 70, "ZARA","L","Pink");

        UUID UserId1 = UUID.randomUUID();
        UUID UserId2 = UUID.randomUUID();

        try {
            // Order 1: Laptop
            laptop.reduceStock(1);
            Order order1 = new Order(UserId1);
            OrderDetails orderDetails1 = new OrderDetails(order1.getOrderID(),laptop.getProductID(),1,laptop.calculateDiscount());
            orders.add(order1);
            order1.addOrderDetail(orderDetails1);

            // Order 2: T-shirts
            t_shirt.reduceStock(2);
            Order order2 = new Order(UserId2);
            OrderDetails orderDetails2 = new OrderDetails(order2.getOrderID(), t_shirt.getProductID(),2, t_shirt.calculateDiscount());
            orders.add(order2);
            order2.addOrderDetail(orderDetails2);

        } catch (OutOfStockException e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (Order order : orders) {
            orderHistory.putIfAbsent(order.getUserID(), new ArrayList<>());
            orderHistory.get(order.getUserID()).add(order);
        }

        for (UUID userId : orderHistory.keySet()) {
            System.out.println("\nUserID: " + userId);
            List<Order> userOrders = orderHistory.get(userId);
            for (Order userOrder : userOrders) {
                for (OrderDetails details : userOrder.getOrderList()) {
                    System.out.println("\n" + details.toString());
                }
            }
            System.out.println("---------------------------");
        }
    }
}
