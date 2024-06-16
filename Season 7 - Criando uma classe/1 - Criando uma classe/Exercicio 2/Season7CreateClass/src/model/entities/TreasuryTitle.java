package model.entities;

import exceptions.DataException;
import exceptions.InterestException;
import exceptions.NameException;
import exceptions.RemainingMonthsException;
import exceptions.TermException;

public class TreasuryTitle {
  private String name;
  private Double balance;
  private Integer term;
  private Integer remainingMonths;
  private Double interestRate;

  public TreasuryTitle() {
  }

  public TreasuryTitle(String name, Double balance, Integer term) throws DataException {
    if (name == null || balance == null || term == null) {
      throw new DataException("Dados invalidos.");
    }
    this.name = name;
    this.balance = balance;
    this.term = term;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if (name == null) {
      throw new NameException("Nome invalido.");
    }
    this.name = name;
  }

  public Double getBalance() {
    return balance;
  }

  public Integer getTerm() {
    return term;
  }

  public void setTerm(Integer term) {
    if (term == null) {
      throw new TermException("Prazo invalido.");
    }
    this.term = term;
  }

  public Integer getRemainingMonths() {
    return remainingMonths;
  }

  public Double getInterestRate() {
    return interestRate;
  }

  public void setInterestRate() throws InterestException {
    if (this.term >= 0 && this.term <= 11) {
      this.interestRate = 0.05;
    } else if (this.term >= 12 && this.term <= 23) {
      this.interestRate = 0.10;
    } else if (this.term >= 24 && this.term <= 35) {
      this.interestRate = 0.15;
    } else if (this.term >= 36 && this.term <= 47) {
      this.interestRate = 0.20;
    } else if (this.term >= 48 && this.term <= 60) {
      this.interestRate = 0.25;
    } else {
      throw new InterestException("Prazo invalido.");
    }
    this.remainingMonths = this.term;
  }

  public void receiveInterest() throws InterestException {
    if (this.interestRate == null) {
      throw new InterestException("Juros invalidos.");
    } else if (this.remainingMonths == null) {
      throw new RemainingMonthsException("Meses restantes invalidos.");
    } else if (this.remainingMonths <= 0) {
      throw new RemainingMonthsException("Prazo vencido.");
    } else {
      this.balance += this.balance * this.interestRate / 12;
      this.remainingMonths--;
    }
  }
}
