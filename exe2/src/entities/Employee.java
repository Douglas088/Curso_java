<<<<<<< HEAD
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
=======
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
>>>>>>> 0c5a89f30f4776927c92394c7c0e6de1e2863ae7
