// Superclass
class Employee {
    public String name;  // Public instance variable
    public String dob;   // Public instance variable
    private double salary; // Private instance variable (NOT inherited)

    // Constructor
    public Employee(String name, String dob, double salary) {
        this.name = name;
        this.dob = dob;
        this.salary = salary;
    }

    // Public method to access private salary
    public double getSalary() {
        return salary;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Dob: " + dob);
        System.out.println("Salary: " + salary);
    }

}

// Subclass
class Manager extends Employee {
    public String department;

    // Constructor
    public Manager(String name, String dob, double salary, String department) {
        super(name, dob, salary); // Call superclass constructor
        this.department = department;
    }

    public void displayManager() {
        display(); // Call superclass method
        System.out.println("Department: " + department);
    }
}

// Main class
public class Example {
    public static void main(String[] args) {
        Manager manager = new Manager("Ted White", "11/12/1990", 25000, "HR");
        manager.displayManager();

        // Attempting to access private salary directly (this will cause an error)
        System.out.println(manager.getSalary()); // Uncommenting this will cause a compilation error

        // Correct way to access salary via getter method
        System.out.println("Accessing salary via getter: " + manager.getSalary());
    }
}
