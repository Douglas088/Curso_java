<<<<<<< HEAD
package aplication;

import entities.Employee;

import java.util.Scanner;

public class Main {

    public static void main(String[] arg) {
        String name;
        double grossSalary;
        double tax;
        double percentage;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome, salário bruto e imposto:");
        name = input.nextLine();
        grossSalary = input.nextDouble();
        tax = input.nextDouble();

        Employee employee = new Employee(name, grossSalary, tax);
        System.out.println("Employee: " + name + ", "+ employee.netSalary());

        System.out.println("Qual é a porcentagem de aumento salarial?");
        percentage = input.nextDouble();
        employee.increaseSalary(percentage);
        input.close();
        System.out.println("Atualização: " + name + " " + employee.netSalary());

    }
}


=======
package aplication;

import entities.Employee;

import java.util.Scanner;

public class Main {

    public static void main(String[] arg) {
        String name;
        double grossSalary;
        double tax;
        double percentage;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome, salário bruto e imposto:");
        name = input.nextLine();
        grossSalary = input.nextDouble();
        tax = input.nextDouble();

        Employee employee = new Employee(name, grossSalary, tax);
        System.out.println("Employee: " + name + ", "+ employee.netSalary());

        System.out.println("Qual é a porcentagem de aumento salarial?");
        percentage = input.nextDouble();
        employee.increaseSalary(percentage);
        input.close();
        System.out.println("Atualização: " + name + " " + employee.netSalary());

    }
}


>>>>>>> 0c5a89f30f4776927c92394c7c0e6de1e2863ae7
