package application;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner sc = new Scanner(App.class.getResourceAsStream("input04text.txt"));

    sc.nextLine();
    System.out.println(sc.nextLine());

    System.out.println(sc.findInLine("BlueBumper"));
    int xPosition = Integer.parseInt(sc.findInLine("90"));
    int yPosition = Integer.parseInt(sc.findInLine("120"));

    System.out.println("X: " + xPosition + ", Y: " + yPosition);
    sc.close();
  }
}
