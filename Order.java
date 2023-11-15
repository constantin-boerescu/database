import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Order {
    // Orders atributes
    private int orderId;
    private Customer customer;
    private String orderStatus;
    private Employee salesman;
    private Date orderDate;
    private List<OrderItem> orderItems;

    // Constructor
    public Order(int orderId, Customer customer, String orderStatus, Employee salesman, Date orderDate){
        this.orderId = orderId;
        this.customer = customer;
        this.salesman = salesman;
        this.orderDate = orderDate;
        this.orderItems = new ArrayList<>();
    }

    // getters and setters
    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }
    public void SetCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getSalesman() {
        return salesman;
    }
    public void setSalesman(Employee salesman) {
        this.salesman = salesman;
    }
    
    public String getOrderStatus() {
        return orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }


    // Add items to orders
    public void addOrderItem(OrderItem item){
        orderItems.add(item);
    }
    // Remove items from orders
    public void removeOrderItem(OrderItem item){
        orderItems.remove(item);
    }    

    //Overritten the toString method
    @Override
    public String toString() {
        return "Order no: " + orderId + " customer " + customer.getCustomerName() + " status: "+ orderStatus + " sold by: " + salesman.getEmployeeName() + " on date: " + orderDate ;
    }

    // Display all the items from an order
    public void printOrderItems() {
        if( orderItems != null && !orderItems.isEmpty()){
            for (OrderItem item : orderItems){
                System.out.println("Item: " + (item.getProduct()).getProductName() + " pices: " + item.getQuantity());
            }
        }
    }
}
