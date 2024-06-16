package application;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Insira um numero: ");
    methodOne(in);
  }
  
  public static void methodOne(Scanner in) {
    int num = in.nextInt();
    for (int i = 1; i <= 12; i++) {
      System.out.println(num + " x " + i + " = " + (num * i));
    }
  }
}
