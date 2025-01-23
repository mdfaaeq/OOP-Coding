class Person {
    private String firstName;
    private String lastName;
    private int age;

    // Constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Getter and Setter for firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter and Setter for lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
}

class Employee extends Person {
    private String employeeId;
    private double salary;

    // Constructor
    public Employee(String firstName, String lastName, int age, String employeeId, double salary) {
        super(firstName, lastName, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Getter and Setter for employeeId
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    // Getter and Setter for salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
    }
}

// Example usage
public class Question2 {
    public static void main(String[] args) {
        // Create a Person instance
        Person person = new Person("John", "Doe", 30);
        System.out.println("Person: " + person.getFirstName() + " " + person.getLastName() + ", Age: " + person.getAge());

        // Create an Employee instance
        Employee employee = new Employee("Jane", "Smith", 28, "E12345", 50000.0);
        System.out.println("Employee: " + employee.getFirstName() + " " + employee.getLastName() + ", Age: " + employee.getAge() + ", ID: " + employee.getEmployeeId() + ", Salary: " + employee.getSalary());

        // Update salary
        employee.setSalary(55000.0);
        System.out.println("Updated Salary: " + employee.getSalary());
    }
}
