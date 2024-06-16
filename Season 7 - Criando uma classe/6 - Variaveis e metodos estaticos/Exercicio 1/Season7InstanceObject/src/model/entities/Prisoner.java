package model.entities;

public class Prisoner {

  private String name;
  private Double height;
  private Integer yearsOfPrison;
  private String nameOfCell;
  private static Integer prisonerCount = 0;
  private static Integer bookingNumber = prisonerCount;

  public Prisoner() {
    prisonerCount++;
    bookingNumber = prisonerCount;
  }

  public Prisoner(String name, Double height, Integer yearsOfPrison) {
    this.name = name;
    this.height = height;
    this.yearsOfPrison = yearsOfPrison;
    prisonerCount++;
    bookingNumber = prisonerCount;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public Integer getYearsOfPrison() {
    return yearsOfPrison;
  }

  public void setYearsOfPrison(Integer yearsOfPrison) {
    this.yearsOfPrison = yearsOfPrison;
  }

  public String getNameOfCell() {
    return nameOfCell;
  }

  public void setNameOfCell(String nameOfCell) {
    this.nameOfCell = nameOfCell;
  }

  public String displayStaticInfo() {
    return "Prisoner Count: " + prisonerCount + " - " + "Booking Number: " + bookingNumber;
  }

  @Override
  public String toString() {
    return "Prisoner{" + "name=" + name + ", height=" + height + ", yearsOfPrison=" + yearsOfPrison + ", nameOfCell=" + nameOfCell + '}';
  }
}
