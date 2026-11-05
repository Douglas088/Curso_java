package aplication;

import entities.Estudante;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String name;
        double n1;
        double n2;
        double n3;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do aluno, e as notas de cada trimestre");
        name = input.nextLine();
        n1 = input.nextDouble();
        n2 = input.nextDouble();
        n3 = input.nextDouble();

        input.close();

        Estudante estudante = new Estudante(name, n1, n2, n3);

        if (estudante.NotaFinal() < 60) {
            System.out.println("Nota final: " + estudante.NotaFinal() + " -- " + estudante.Resultado() + " -------------- Falta: " + estudante.Faltante());
        } else {
            System.out.println("Nota final: " + estudante.NotaFinal() + " -- " + estudante.Resultado());
        }

    }
}
