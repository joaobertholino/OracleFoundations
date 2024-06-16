package application;

import java.util.Locale;
import java.util.Scanner;
import model.entities.Calculator;

public class App {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner in = new Scanner(System.in);
    Calculator myCalculator = new Calculator(0.05, 0.15);
    
    System.out.print("Insira o valor livre de impostos e valor de gorjeta: ");
    double value = in.nextDouble();
    
    Double result = myCalculator.calculateAmount(value, true);
    System.out.printf("Valor a ser pago: R$%.2f%n", result);
    
    in.close();
  }
}
