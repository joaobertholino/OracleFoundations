package model.entities;

public class Calculator {

  private double tax;
  private double tip;
  private double originalPrice;

  public Calculator() {
  }

  public Calculator(double tax, double tip, double originalPrice) {
    this.tax = tax;
    this.tip = tip;
    this.originalPrice = originalPrice;
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

  public double getOriginalPrice() {
    return originalPrice;
  }

  public void setOriginalPrice(double originalPrice) {
    this.originalPrice = originalPrice;
  }
  
  public double findTotal() {
    return originalPrice + originalPrice * tax + originalPrice * tip;
  }
}
