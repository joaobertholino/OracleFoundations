package model.entities;

import model.services.Operations;

public class Calculator implements Operations {

  private Double tax;
  private Double tip;

  public Calculator() {
  }
  
  public Calculator(Double tax, Double tip) {
    this.tax = tax;
    this.tip = tip;
  }

  public Double getTax() {
    return tax;
  }

  public void setTax(Double tax) {
    this.tax = tax;
  }

  public Double getTip() {
    return tip;
  }

  public void setTip(Double tip) {
    this.tip = tip;
  }

  @Override
  public Double calculateAmount(Double cost, boolean tip) {
    if (cost == null) {
      throw new IllegalArgumentException("Valor invalido!");
    }
    if (tip && cost > 0) {
      return cost + cost * this.tax + cost * this.tip;
    } else if (!tip && cost > 0) {
      return cost + cost * this.tax;
    } else {
      return this.tax;
    }
  }
}
