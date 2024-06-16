package season3dukeschoice;

public class Season3DukesChoice {

  public static void main(String[] args) {
    String custName = "Alex";
    String itemDesc = "camisa";

    String message = custName + " quer comprar uma " + itemDesc + ".";
    System.out.println(message);

    double price = 11.72;
    double tax = 1.1;
    int amount = 2;

    double totalPrice = amount * price * tax;
    System.out.println("O custo total com o imposto e: $" + totalPrice);
  }

}
