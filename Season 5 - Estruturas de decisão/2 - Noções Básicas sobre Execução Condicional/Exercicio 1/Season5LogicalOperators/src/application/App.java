package application;

public class App {

  public static void main(String[] args) {
    System.out.println(viewMovie());
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
}
