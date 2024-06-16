package application;

import java.util.Locale;
import java.util.Scanner;
import model.entities.Calculator;
import model.entities.Client;

public class App {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner in = new Scanner(System.in);
    
    System.out.print("Insira o seu nome: ");
    String yourName = in.nextLine();
    Client myClient = new Client(yourName);

    System.out.print("Insira o valor da conta: ");
    double value = in.nextDouble();

    System.out.print("Insira o percentual do imposto: ");
    double taxValue = in.nextDouble();

    System.out.print("Insira o percentual da gorjeta: ");
    double tipValue = in.nextDouble();

    Calculator myCalculator = new Calculator(taxValue, tipValue);
    double totalValue = myCalculator.findTotal(value);
    System.out.printf("Valor total a ser pago por %s: R$%.2f%n", myClient.getName(), totalValue);

  }
}
