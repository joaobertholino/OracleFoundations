package application;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    int number = 0;
    do {
    System.out.print("Type a non-negative integer: ");
    number = in.nextInt();
    } while (number <= 0);
    
    System.out.println("The suare root of " + number + " is: " + Math.sqrt(number));
  }
}
