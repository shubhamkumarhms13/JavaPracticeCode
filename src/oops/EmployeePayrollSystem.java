package oops;

import java.util.ArrayList;
import java.util.List;

abstract class Employee {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Employee(String name, int id) {
        this.id = id;
        this.name = name;
    }

    abstract double calculateSalary();

    public String toString() {
        return "Employee: [name: " + name + ", id: " + id + ", salary: " + calculateSalary() + "]";
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public double getSalary() {
        return monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

class PayrollSystem {
    private List<Employee> employeeList;

    public PayrollSystem() {
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(int id) {
        Employee employeeToRemove = null;
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                employeeToRemove = employee;
                break;
            }
        }
        if (employeeToRemove != null) {
            employeeList.remove(employeeToRemove);
        }
    }

    public void displayEmployee() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}

public class EmployeePayrollSystem {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee("Vikash", 1, 70000.00);
        FullTimeEmployee emp2 = new FullTimeEmployee("Rakesh", 2, 40000.00);
        FullTimeEmployee emp3 = new FullTimeEmployee("Hari", 3, 60000.00);
        PartTimeEmployee emp4 = new PartTimeEmployee("Kanu", 4, 40, 200);
        PartTimeEmployee emp5 = new PartTimeEmployee("Tom", 5, 45, 250);
        PartTimeEmployee emp6 = new PartTimeEmployee("Peter", 6, 50, 175);

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);
        payrollSystem.addEmployee(emp3);
        payrollSystem.addEmployee(emp4);
        payrollSystem.addEmployee(emp5);
        payrollSystem.addEmployee(emp6);
        System.out.println("Total Employees...");
        payrollSystem.displayEmployee();
        System.out.println("Deleting Employees...");
        payrollSystem.removeEmployee(4);
        System.out.println("Remaining Employees...");
        payrollSystem.displayEmployee();
    }
}
