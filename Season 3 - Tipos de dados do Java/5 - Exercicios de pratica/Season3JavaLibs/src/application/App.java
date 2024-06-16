package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Iremos coletar algumas informações suas para criar a historia, ok? (true ou false)");
    boolean confirmation = in.nextBoolean();
    in.nextLine();

    while (confirmation) {
      System.out.print("Insira seu nome: ");
      String name = getStringInfo(in);

      System.out.print("Nomeie um animal: ");
      String animalName = getStringInfo(in);

      System.out.print("Insira uma parte do corpo deste animal: ");
      String animalBody = getStringInfo(in);

      System.out.print("Insira uma palavra que represente uma ideia de encontro romantico: ");
      String dateRomantic = getStringInfo(in);

      System.out.print("Insira seu numero favorito: ");
      String favoriteNumber = getIntegerInfo(in);
      in.nextLine();

      System.out.print("Insira o nome de uma fruta: ");
      String nameFruit = getStringInfo(in);

      System.out.print("Insira um verbo conjugado no passado: ");
      String pastVerb = getStringInfo(in);

      System.out.println("Tenho muito para contar sobre meu encontro com " + name
              + "! Primeiro jantamos. Convenci " + name + " de que deve compartilhar"
              + "o " + animalName + " " + animalBody + " torrado. " + name + " continuou"
              + "falando sobre " + dateRomantic + " e o número seu " + favoriteNumber
              + " ou alguma coisa. A refeição estava muito " + animalBody + " e eu"
              + "insisti em deixar uma gorjeta de US$" + getTaxInfo(favoriteNumber, 30.8)
              + "! " + name + " disse que era apenas " + getTaxInfo(favoriteNumber, 15.8)
              + "% em uma refeição de $ " + getTaxInfo(favoriteNumber, 20.0) + "."
              + "\n"
              + "Encerramos a noite com um filme chamado “Attack of the " + nameFruit
              + "”. Eu " + pastVerb + " com " + name + ", e isso é quando eu"
              + "realmente comecei a apreciar como " + name + " era."
              + "Estou apaixonado e quero que " + name + " se case comigo!\n");
      
      System.out.print("Insira \"true\" caso queira inserir novos dados ou \"false\" caso contrario: ");
      confirmation = in.nextBoolean();
      in.nextLine();
    }
  }

  public static String getStringInfo(Scanner in) {
    try {
      return in.nextLine();
    } catch (InputMismatchException e) {
      return e.getMessage();
    }
  }

  public static String getIntegerInfo(Scanner in) {
    try {
      int number = in.nextInt();
      if (number == 0 || number == 1) {
        return Integer.toString(number);
      } else {
        throw new InputMismatchException("Valor insirido pode ser maior que 1 e menor que 0!");
      }
    } catch (InputMismatchException e) {
      return e.getMessage();
    }
  }

  public static String getTaxInfo(String favoriteNumber, double value) {
    try {
      return Double.toString(Integer.parseInt(favoriteNumber) * value);
    } catch (NumberFormatException e) {
      return e.getMessage();
    }
  }

}
