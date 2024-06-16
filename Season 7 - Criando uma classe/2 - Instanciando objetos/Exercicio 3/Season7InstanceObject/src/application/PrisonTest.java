package application;

import model.entities.Prisoner;

public class PrisonTest {

  public static void main(String[] args) {
    Prisoner bubba = new Prisoner("Twitch", 2.08, 4);
    Prisoner twitch = new Prisoner("Twitch", 1.73, 3);
    
    String bubbaName = bubba.getName();
    String twitchName = twitch.getName();
    
    System.out.println(bubbaName == twitchName);
  }
}
