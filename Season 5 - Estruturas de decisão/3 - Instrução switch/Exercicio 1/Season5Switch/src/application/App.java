package application;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Insira um numero integral entre 1 e 12 representando um mes: ");
    int number = in.nextInt();
    
    System.out.println(numberOfMounthSwitchOne(number));
    System.out.println(numberOfMounthSwitchTwo(number));
  }

  public static String numberOfMounthSwitchOne(int number) {
    switch (number) {
      case 1:
        return "Janeiro";
      case 2:
        return "Fevereiro";
      case 3:
        return "Março";
      case 4:
        return "Abril";
      case 5:
        return "Maio";
      case 6:
        return "Junho";
      case 7:
        return "Julho";
      case 8:
        return "Agosto";
      case 9:
        return "Setembro";
      case 10:
        return "Outubro";
      case 11:
        return "Novembro";
      case 12:
        return "Dezembro";
      default:
        return "Numero de mes invalido!";
    }
  }

  public static String numberOfMounthSwitchTwo(int number) {
    return switch (number) {
      case 1 -> "Janeiro";
      case 2 -> "Fevereiro";
      case 3 -> "Março";
      case 4 -> "Abril";
      case 5 -> "Maio";
      case 6 -> "Junho";
      case 7 -> "Julho";
      case 8 -> "Agosto";
      case 9 -> "Setembro";
      case 10 -> "Outubro";
      case 11 -> "Novembro";
      case 12 -> "Dezembro";
      default -> "Valor invalido";
    };
  }
}
