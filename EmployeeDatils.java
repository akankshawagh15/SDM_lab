// Employee class representing employee details
class Employee {
    // Fields
    private int employeeId;
    private String employeeName;
    private double salary;

    // Constructor
    public Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    // Getter methods
    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        return salary;
    }

    // Display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: $" + salary);
    }
}

// Main class to demonstrate the Employee class
public class EmployeeDatils {
    public static void main(String[] args) {
        // Create an employee object
        Employee employee1 = new Employee(101, "John Doe", 50000.0);

        // Display employee details
        System.out.println("Employee Details:");
        employee1.displayDetails();
    }
}
