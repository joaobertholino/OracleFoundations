package application;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Insira a quantidade de valores a serem somados: ");
    int amount = in.nextInt();
    
    int sum = 0;
    for (int i = 1; i <= amount; i++) {
      System.out.print("Insira o " + i + "° valor: ");
      sum += Integer.parseInt(in.next());
    }
    System.out.println("O resultado da soma é: " + sum);
    
    in.close();
  }
}
