import java.util.ArrayList;
import java.util.List;

public class Customer {
    
    // Customer atributes
    private int customerId;
    private String customerName;
    private String customerAddress;
    private String customerWebsite;
    private float creditLimit;
    // private List<Contact> contacts;
    private List<Order> orders;

    // Customer constructor
    public Customer(int customerId, String customerName, String customerAddress, String customerWebsite, float creditLimit){
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerWebsite = customerWebsite;
        this.creditLimit = creditLimit;
        this.orders = new ArrayList<>();
    }

    // Getters and setters
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getcustomerWebsite(){
        return customerWebsite;
    }
    public void setCustomerWebsite(String customerWebsite){
        this.customerWebsite = customerWebsite;
    }

    public float getCreditLimit(){
        return creditLimit;
    }
    public void setCreditLimit(float creditLimit){
        this.creditLimit = creditLimit;
    }

    //Overritten the toString method
    @Override
    public String toString(){
        return "Customer id: " + customerId + ", name: " + customerName + ", address:" + customerAddress + ", website: " + customerWebsite + ", credit limit: " +creditLimit;
    }

    // Add orders to costumers
    public void addOrder(Order order) {
        orders.add(order);
    }
    // Remove orders to costumers
    public void removeOrder(Order order) {
        orders.remove(order);
    }

    
}
