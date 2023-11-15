import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private List<Order> ordersList = new ArrayList<>();

    // Add a oreder to list
    public void addOrder(Order order) {
        if (!ordersList.contains(order)){
            ordersList.add(order);
            System.out.println("Oder " + order.getOrderId() + " was added");
        }
    }
    // Remove a order from list
    public void removeOrder(Order order) {
        if (ordersList.contains(order)){
            ordersList.add(order);
            System.out.println("Order " + order.getOrderId() + " was removed");
        }
    }
    // Show all orders
    public void printOrders(){
        for (Order order : ordersList){
            System.out.println(order.getOrderId());
        }
    }
}
