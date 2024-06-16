package application;

import java.util.Random;

public class App {

  public static void main(String[] args) {
    Random random = new Random();
    
    int number = random.nextInt(3);
    
    switch (number) {
      case 0 -> System.out.println("Pedra");
      case 1 -> System.out.println("Papel");
      case 2 -> System.out.println("Tesoura");
      default -> System.out.println("Numero invalido!");
    }
  }
}
