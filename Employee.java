import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Employee {
    // Employee atributes
    private int employeeId;
    private String employeeName;
    private String employeeEmail;
    private String employeePhone;
    private Date employeeHireDate;
    private Employee manager;
    private String jobTitle;
    private List<Order> orders;
    private List<Employee> subordinates;

    // Constructor
    public Employee(int employeeId, String employeeName, String employeeEmail, String employeePhone, Date employeeHireDate, Employee manager, String jobTitle) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.employeePhone = employeePhone;
        this.employeeHireDate = employeeHireDate;
        this.manager = manager;
        this.jobTitle = jobTitle;
        this.orders = new ArrayList<>();
        this.subordinates = new ArrayList<>();
    }

    // Getters and setters
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }
    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }
    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public Date getEmployeeHireDate() {
        return employeeHireDate;
    }
    public void setEmployeeHireDate(Date employeeHireDate) {
        this.employeeHireDate = employeeHireDate;
    }

    public Employee getManager() {
        return manager;
    }
    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }


    // Add order to an employee
    public void addOrder(Order order){
        if (!orders.contains(order)){
            this.orders.add(order);
        }
        System.out.println("Order no: " + order.getOrderId() + " has been added to: " + employeeName);
    }
    // Remove orders from employee
    public void removeOrder(Order order) {
        if (orders.contains(order)){
            this.orders.remove(order);
        }
        System.out.println("Order no: " + order.getOrderId() + " has been removed from: " + employeeName);
    }
    // Display all orders of an employee
    public void printEmployeeOrders() {
        if (orders != null && !orders.isEmpty()){
            for (Order ord : orders) {
                System.out.println("Order: " + ord);
            }
        }
    }

    // Add subordinates to an employye
    public void addSubordinates(Employee subordinate) {
        if (!subordinates.contains(subordinate)) {
            this.subordinates.add(subordinate);
        }
    }
    // Remove subordinates to an employye
    public void removeSubordinates(Employee subordinate) {
        if (subordinates.contains(subordinate)) {
            this.subordinates.remove(subordinate);
        }
    }
    // Display all subordinates
    public void printSubordinates() {
        if(subordinates != null && !subordinates.isEmpty()){
            for (Employee sub : subordinates) {
                System.out.println(sub);
            }
        }
    }
    
    //Overritten the toString method
    @Override
    public String toString() {
        String managerInfo = (manager != null) ? manager.getEmployeeName() : "No manager";
        return "Employee: " + employeeName + " id: " + employeeId + " phone: " + employeePhone + " emai: " + employeeEmail + " hired at: " + employeeHireDate + " job title: " + jobTitle + " manager: " +managerInfo;
    }

}
