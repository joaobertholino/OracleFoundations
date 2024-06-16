package application;

import model.entities.Cell;
import model.entities.Prisoner;

public class PrisonTest {

  public static void main(String[] args) {
    Prisoner bubba = new Prisoner("Bubba", 2.05, 4);
    Cell cell = new Cell("Carandiru", false, bubba, 12345);
    bubba.setNameOfCell(cell.getName());
    
    System.out.println(bubba.displayStaticInfo());

    System.out.println(bubba);
    cell.setIsOpenDoor(12345);
    System.out.println("A porta da cela esta aberta ?: " + cell.getIsOpenDoor());
  }
}
