package application;

public class App {
  public static void main(String[] args) {
    System.out.println("Countdown to Launch: ");

    for (int i = 0; i <= 20; i++) {
      if (i % 2 == 0) {
      System.out.print(i + " ");
      }
    }
    System.out.println("Blast Off!");
  }
}
