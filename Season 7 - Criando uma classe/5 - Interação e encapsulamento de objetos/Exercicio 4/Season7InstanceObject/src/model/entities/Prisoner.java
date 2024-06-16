package model.entities;

public class Prisoner {

  private String name;
  private Double height;
  private Integer yearsOfPrison;
  private String nameOfCell;

  public Prisoner() {
  }

  public Prisoner(String name, Double height, Integer yearsOfPrison) {
    this.name = name;
    this.height = height;
    this.yearsOfPrison = yearsOfPrison;
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

  @Override
  public String toString() {
    return "Prisoner{" + "name=" + name + ", height=" + height + ", yearsOfPrison=" + yearsOfPrison + ", nameOfCell=" + nameOfCell + '}';
  }
}
