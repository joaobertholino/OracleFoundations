package model.entities;

public class Cell {
  private String name;
  private Boolean isOpenDoor;
  private Prisoner prisoner;

  public Cell() {
  }

  public Cell(String name, Boolean isOpenDoor, Prisoner prisoner) {
    this.name = name;
    this.isOpenDoor = isOpenDoor;
    this.prisoner = prisoner;
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

  public void setIsOpenDoor(Boolean isOpenDoor) {
    this.isOpenDoor = isOpenDoor;
  }

  public Prisoner getPrisoner() {
    return prisoner;
  }

  public void setPrisoner(Prisoner prisoner) {
    this.prisoner = prisoner;
  }
  
  public Boolean openDoor() {
    this.isOpenDoor = !this.isOpenDoor;
    return this.isOpenDoor;
  }
}
