package application;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println(showAvg(sumNote(in, 5)));
  }

  public static double[] sumNote(Scanner in, int amount) {
    double[] notes = new double[amount];

    for (int i = 0; i < notes.length; i++) {
      notes[i] = in.nextDouble();
    }
    return notes;
  }
  
  public static double showAvg(double[] notes) {
    double sum = 0.0;
    for (int i = 0; i < notes.length; i++) {
      sum += notes[i];
    }
    return sum / notes.length;
  }
}
