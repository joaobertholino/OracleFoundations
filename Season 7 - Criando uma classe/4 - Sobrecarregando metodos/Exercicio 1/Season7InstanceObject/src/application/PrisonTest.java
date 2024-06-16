package application;

import model.entities.Prisoner;

public class PrisonTest {

  public static void main(String[] args) {
    Prisoner bubba = new Prisoner();
    System.out.println(bubba.getName());
    System.out.println(bubba.getHeight());
    System.out.println(bubba.getYearsOfPrison());
  }
}
