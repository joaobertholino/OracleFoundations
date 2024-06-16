package application;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a color code: ");
    int colorCode = in.nextInt();
    
    System.out.println(trafficLightChecker(colorCode));
  }
  
  public static String trafficLightChecker(int currentColor) {
    return switch (currentColor) {
      case 1 -> "Next Traffic Light is green.";
      case 2 -> "Next Traffic Light is yellow.";
      case 3 -> "Next Traffic Light is red.";
      default -> throw new IllegalArgumentException("Invalid color.");
    };
  }
}
