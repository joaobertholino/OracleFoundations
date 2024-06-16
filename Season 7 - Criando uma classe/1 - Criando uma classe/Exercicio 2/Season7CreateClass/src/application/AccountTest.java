package application;

import exceptions.WithdrawException;
import model.entities.CheckingAccount;

public class AccountTest {

  public static void main(String[] args) {
    CheckingAccount checkingAccount = new CheckingAccount("Joao", 200000.00);
    try {
      checkingAccount.withdraw(30.00);
      System.out.println(checkingAccount.getBalance());
    } catch (WithdrawException e) {
      System.out.println(e.getMessage());
    }
    
  }
}
