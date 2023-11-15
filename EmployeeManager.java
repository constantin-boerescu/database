import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employeesList = new ArrayList<>();

    // Add a employee to list
    public void addEmployee(Employee employee) {
        if (!employeesList.contains(employee)){
            employeesList.add(employee);
            System.out.println("Employee " + employee.getEmployeeName() + " was added");
        }
    }
    // Remove a employee from list
    public void removeEmployee(Employee employee) {
        if (employeesList.contains(employee)){
            employeesList.remove(employee);
            System.out.println("Employee " + employee.getEmployeeName() + " was added");
        }
    }
    // Show all products
    public void printEmployees(){
        for (Employee employee : employeesList){
            System.out.println(employee.getEmployeeName());
        }
    }
}
