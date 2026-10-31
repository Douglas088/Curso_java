package application;

import entities.Retangulo;

import java.util.Scanner;

public class Main {

 public static void main(String[] args) {


     double b, h;

     Scanner input = new Scanner(System.in);
     System.out.println("= Coloque os dados do Retângulo =");
     System.out.println("==Base==");
     b = input.nextDouble();
     System.out.println("==Altura==");
     h = input.nextDouble();

     input.close();

     Retangulo retangulo = new Retangulo(b, h);
     System.out.println("Dados do retângulo:");
     System.out.println("Área: " + retangulo.area());
     System.out.println("Perímetro: " + retangulo.perimetro());
     System.out.printf("Diagonal: %.2f", retangulo.diagonal());

 }
}
