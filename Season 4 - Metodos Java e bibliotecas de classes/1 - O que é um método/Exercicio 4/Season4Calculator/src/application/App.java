package application;

import java.util.Locale;
import java.util.Scanner;
import model.entities.Calculator;

public class App {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner in = new Scanner(System.in);

    System.out.print("Insira o percentual do imposto: ");
    double taxValue = in.nextDouble();

    System.out.print("Insira o percentual da gorjeta: ");
    double tipValue = in.nextDouble();

    System.out.print("Insira a quantidade de valores a calcular: ");
    int amount = in.nextInt();
    in.nextLine();

    double[] value = new double[amount];
    for (int i = 1; i <= amount; i++) {
      System.out.print("Insira o valor da conta da " + i + "° pessoa: ");
      value[i - 1] = in.nextDouble();
      in.nextLine();
    }

    Calculator myCalculator = new Calculator(taxValue, tipValue);
    double totalValue = myCalculator.findTotal(value) / amount;
    System.out.printf("Valor total a ser pago por pessoa: R$%.2f%n", totalValue);
  }
}
