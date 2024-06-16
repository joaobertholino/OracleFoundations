package application;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.println(viewMovie());
    System.out.println(ternary());
    System.out.println(tax(in));
  }

  public static String viewMovie() {
    double price = 15.65;
    int movieClassification = 4;

    if (price >= 12.00 && movieClassification == 5) {
      return "Estou interessado em assistir o filme.";
    } else {
      return "Não estou interessado em assistir o filme.";
    }
  }

  public static String ternary() {
    int x = 4;
    int y = 9;

    x = (y / x < 3) ? x + y : x * y;
    return "After if stmt, x = " + x;
  }

  public static String tax(Scanner in) {
    System.out.print("Enter the age: ");
    int age = in.nextInt();
    in.nextLine();
    
    double fare;
    if (age < 11) {
      fare = 3.5;
    } else if (age > 11 && age < 65) {
      fare = 5.0;
    } else {
      fare = 3.5;
    }
    return "Valor da tarifa: " + fare;
  }
}
