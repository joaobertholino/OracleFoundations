package application;

import model.entities.Prisoner;

public class PrisonTest {

  public static void main(String[] args) {
    Prisoner bubba = new Prisoner("Bubba", 2.08, 4);
    Prisoner twitch = new Prisoner("Twitch", 1.73, 3);
    
    boolean prisionerTest = bubba == twitch;
    System.out.println(prisionerTest);
    
    bubba = twitch;
    
    prisionerTest = bubba == twitch;
    System.out.println(prisionerTest);
  }
}
