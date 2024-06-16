package application;

import model.entities.Cell;
import model.entities.Prisoner;

public class PrisonTest {

  public static void main(String[] args) {
    Prisoner bubba = new Prisoner("Bubba", 2.05, 4);
    Cell cell = new Cell("Carandiru", false, bubba);
    System.out.println(bubba.getName());
    System.out.println(bubba.getHeight());
    System.out.println(bubba.getYearsOfPrison());
    
    System.out.println(bubba);
    System.out.println("A porta da cela esta aberta ?: " + cell.openDoor());
  }
}
