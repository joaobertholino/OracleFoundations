package application;

import java.util.Scanner;

public class App {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a color code: ");
    int colorCode = in.nextInt();
    
    try {
      System.out.println(trafficLightChecker(colorCode));
    } catch (IllegalArgumentException e) {
      System.err.println(e.getMessage());
    }
  }
  
  public static String trafficLightChecker(int currentColor) {
    if (currentColor == 1) {
      return "Next Traffic Light is green.";
    } else if (currentColor == 2) {
      return "Next Traffic Light is yellow.";
    } else if (currentColor == 3) {
      return "Next Traffic Light is red.";
    } else {
      throw new IllegalArgumentException("Invalid Color.");
    }
  }
}
