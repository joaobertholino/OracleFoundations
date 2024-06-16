package model.entities;

public class Cell {

  private String name;
  private Boolean isOpenDoor;
  private Prisoner prisoner;
  private Integer securityCode;

  public Cell() {
  }

  public Cell(String name, Boolean isOpenDoor, Prisoner prisoner, Integer securityCode) {
    this.name = name;
    this.isOpenDoor = isOpenDoor;
    this.prisoner = prisoner;
    this.securityCode = securityCode;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Boolean getIsOpenDoor() {
    return isOpenDoor;
  }

  public void setIsOpenDoor(Integer securityCode) {
    if (securityCode.equals(this.securityCode) && this.isOpenDoor == false) {
      this.isOpenDoor = true;
    } else if (securityCode.equals(this.securityCode) && this.isOpenDoor == true) {
      this.isOpenDoor = false;
    } else {
      throw new IllegalArgumentException("Codigo invalido!");
    }
  }

  public Prisoner getPrisoner() {
    return prisoner;
  }

  public void setPrisoner(Prisoner prisoner) {
    this.prisoner = prisoner;
  }
}
