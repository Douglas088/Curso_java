package entities;


public class Employee {
    String name;
    double grossSalary;
    double tax;


    public Employee(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public double netSalary() {
        double salary = grossSalary - tax;
        return salary;
    }

    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * percentage / 100;
    }
}
