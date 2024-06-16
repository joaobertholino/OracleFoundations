package application;

public class App {

  public static void main(String[] args) {
    String shirtPrice = "15";
    String taxRate = "0.05";
    String gibberish = "887ds7nds87dsfs";

    int gibberishToInteger = Integer.parseInt(gibberish);
    System.out.println(gibberishToInteger);

    double taxValue = Integer.parseInt(shirtPrice) * Double.parseDouble(taxRate);
    System.out.println(taxValue);
  }
}
