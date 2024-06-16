package application;

import model.entities.Prisoner;

public class PrisonTest {

  public static void main(String[] args) {
    Prisoner bubba = new Prisoner("Bubba", 2.08, 4);
    Prisoner twitch = new Prisoner("Twitch", 1.73, 3);
    
    boolean prisionerTest = bubba == twitch;
    System.out.println(prisionerTest);
    
    twitch.setName("Bubba");
    twitch.setHeight(2.08);
    twitch.setYearsOfPrison(4);
    
    prisionerTest = bubba == twitch;
    System.out.println(prisionerTest);
  }
}
