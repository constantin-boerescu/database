import java.util.ArrayList;
import java.util.List;

public class CustomerManager {
    private List<Customer> customersList = new ArrayList<>();

    // Add a new customer
    public void addCustomer(Customer customer) {
        if (!customersList.contains(customer)){
            customersList.add(customer);
            System.out.println("Customer " + customer.getCustomerName() + " was added");
        }
    }

    // Remove customer
    public void removeCustomer(Customer customer){
        if (customersList.contains(customer)){
            customersList.remove(customer);
            System.out.println("Customer: " + customer.getCustomerName() + " was removed");
        }
    }
    
    // Show all customers
    public void printCustomers(){
        for (Customer customer : customersList){
            System.out.println(customer.getCustomerName());
        }
    }
}

