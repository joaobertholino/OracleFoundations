package application;

public class App {

  public static void main(String[] args) {
    System.out.println(switchOne());
  }

  public static String switchOne() {
    char option = 'A';
    int aCount = 0;
    int bCount = 0;
    int cCount = 0;

    switch (option) {
      case 'A':
        aCount++;
        return "Count of A  " + aCount;
      case 'B':
        bCount++;
        return "Count of B  " + bCount;
      case 'C':
        cCount++;
        return "Count of C  " + cCount;
      default:
        return "Char invalid!";
    }
  }
}
