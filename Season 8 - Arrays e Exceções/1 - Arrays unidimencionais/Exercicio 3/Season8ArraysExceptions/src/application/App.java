package application;

public class App {

  public static void main(String[] args) {
    String[] browsers = new String[3];
    browsers[0] = "explorer";
    browsers[1] = "chrome";
    browsers[2] = "opera";
    
    for(String str : browsers) {
      System.out.println(str);
    }
  }
}
