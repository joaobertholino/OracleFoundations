package application;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a color code: ");
    double colorCode = in.nextInt();

    try {
      System.out.println(colorSpectrum(colorCode));
    } catch (IllegalArgumentException e) {
      System.err.println(e.getMessage());
    }
  }

  public static String colorSpectrum(double valueWave) {
    if (valueWave >= 380 && valueWave < 450) {
      return "The color is Violet.";
    } else if (valueWave >= 450 && valueWave < 495) {
      return "The color is Blue.";
    } else if (valueWave >= 495 && valueWave < 570) {
      return "The color is Green.";
    } else if (valueWave >= 570 && valueWave < 590) {
      return "The color is Yellow.";
    } else if (valueWave >= 590 && valueWave < 620) {
      return "The color is Orange.";
    } else if (valueWave >= 620 && valueWave < 750) {
      return "The color is Red.";
    } else {
      throw new IllegalArgumentException("The entered wavelength is not a part of the visible spectrum.");
    }
  }
}
