package model.entities;

import exceptions.WithdrawException;

public class CheckingAccount {
  private String name;
  private Double balance;

  public CheckingAccount() {
  }

  public CheckingAccount(String name, Double balance) {
    this.name = name;
    this.balance = balance;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }
  
  public void withdraw(Double value) throws WithdrawException {
    if (value == null || value <= 0) {
      throw new WithdrawException("Valor invalido.");
    } else if (this.balance < value) {
      throw new WithdrawException("Saldo insuficiente.");
    } else {
      this.balance -= value;
    }
  }
}
