package model.entities;

public class Calculator {

  private double tax;
  private double tip;

  public Calculator() {
  }

  public Calculator(double tax, double tip) {
    this.tax = tax;
    this.tip = tip;
  }
  
  public double getTax() {
    return tax;
  }

  public void setTax(double tax) {
    this.tax = tax;
  }

  public double getTip() {
    return tip;
  }

  public void setTip(double tip) {
    this.tip = tip;
  }

  public double findTotal(double originalPrice) {
    return originalPrice + originalPrice * this.tax + originalPrice * this.tip;
  }
}
