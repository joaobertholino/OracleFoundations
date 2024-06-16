package season2pratice;

public class Season2Pratice {

  public static void main(String[] args) {
    System.out.println("ASCII Simple One");
    System.out.println(asciiSimpleOne());

    System.out.println("ASCII Simple Two");
    System.out.println(asciiSimpleTwo());

    System.out.println("ASCII Original One");
    System.out.println(asciiOriginalOne());
  }

  public static String asciiSimpleOne() {
    return "  # # # #  " + "\n"
        + " #       # " + "\n"
        + "# #     # #" + "\n"
        + "#         #" + "\n"
        + "# #     # #" + "\n"
        + "#  #####  #" + "\n"
        + " #       # " + "\n"
        + "  #######  ";
  }

  public static String asciiSimpleTwo() {
    return "  X X X X  " + "\n"
        + " X       X " + "\n"
        + "X X     X X" + "\n"
        + "X         X" + "\n"
        + "X X     X X" + "\n"
        + "X  XXXXX  X" + "\n"
        + " X       X " + "\n"
        + "  XXXXXXX  ";
  }

  public static String asciiOriginalOne() {
    return "   /\\     /\\   " + "\n"
        + "  /  \\   /  \\  " + "\n"
        + " /    \\ /    \\ " + "\n"
        + "(  \\/    \\/  )" + "\n"
        + "=====   V  =====" + "\n"
        + "======(_|_)=====" + "\n"
        + "  (          )  " + "\n"
        + "   (________)   ";
  }
}
