package lab10q1;

// Abstract Base Class
abstract class Employee {
    protected String name;
    protected String employeeType;

    public Employee(String name, String employeeType) {
        this.name = name;
        this.employeeType = employeeType;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Name: " + name + ", Type: " + employeeType + ", Salary: " + calculateSalary());
    }
}

// Derived Classes
class PermanentEmployee extends Employee {
    private char category;

    public PermanentEmployee(String name, char category) {
        super(name, "Permanent");
        this.category = category;
    }

    @Override
    public double calculateSalary() {
        switch (category) {
            case 'A': return 4000;
            case 'B': return 3000;
            case 'C': return 2000;
            default: throw new IllegalArgumentException("Invalid category");
        }
    }
}

class ContractStaff extends Employee {
    private double sales;

    public ContractStaff(String name, double sales) {
        super(name, "Contract");
        this.sales = sales;
    }

    @Override
    public double calculateSalary() {
        return 500 + (0.5 * sales);
    }
}

class TemporaryStaff extends Employee {
    private int hoursWorked;

    public TemporaryStaff(String name, int hoursWorked) {
        super(name, "Temporary");
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * 15;
    }
}

public class LAB10Q1 {

    public static void main(String[] args) {
         Employee[] employees = {
            new PermanentEmployee("Alice", 'A'),
            new ContractStaff("Bob", 2000),
            new TemporaryStaff("Charlie", 120)
        };

        for (Employee employee : employees) {
            employee.displayDetails();
        }
    }
}
