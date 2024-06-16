package application;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Insira sua altura (cm): ");
    double height = in.nextDouble();

    System.out.print("Insira seu peso: ");
    double weight = in.nextDouble();

    double result = Math.ceil(imc(height, weight));
    System.out.println("Seu IMC é: " + result);

  }

  public static double imc(double height, double weight) {
    return weight / Math.pow(height, 2) * 703;
  }
}
