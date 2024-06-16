package application;

public class App {

  public static void main(String[] args) {
    System.out.println(viewMovie());
    System.out.println(ternary());
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

  public static String ternary() {
    int x = 4;
    int y = 9;
    
    x = (y / x < 3) ? x + y : x * y;
    return "After if stmt, x = " + x;
  }
}
