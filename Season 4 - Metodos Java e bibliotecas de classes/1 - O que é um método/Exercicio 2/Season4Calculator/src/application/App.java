package application;

import java.util.Scanner;
import model.entities.Calculator;

public class App {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Insira o valor da conta: ");
    double value = in.nextDouble();
    
    System.out.print("Insira o percentual do imposto: ");
    double taxValue = in.nextDouble();
    
    System.out.print("Insira o percentual da gorjeta: ");
    double tipValue = in.nextDouble();
    
    Calculator myCalculator = new Calculator(taxValue, tipValue, value);
    double totalValue = myCalculator.findTotal();
    System.out.println("Valor total a ser pago: " + totalValue);
    
  }
}
