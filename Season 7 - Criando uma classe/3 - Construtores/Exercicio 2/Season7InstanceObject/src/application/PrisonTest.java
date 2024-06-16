package application;

import model.entities.Prisoner;

public class PrisonTest {

  public static void main(String[] args) {
    Prisoner bubba = new Prisoner();
    bubba.setFields("Bubba", 2.05, 4);
    
    System.out.println(bubba.getName());
  }
}
