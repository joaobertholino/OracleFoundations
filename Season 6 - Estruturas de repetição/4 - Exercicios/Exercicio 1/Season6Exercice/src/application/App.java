package application;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int validPin = 12345;

    System.out.print("Insira o PIN: ");
    int pin = in.nextInt();

    while (pin != validPin) {
      System.out.print("PIN incorreto, insira novamente: ");
      pin = in.nextInt();
    }
    
    System.out.println("PIN correto, acesso liberado!");
  }
}
