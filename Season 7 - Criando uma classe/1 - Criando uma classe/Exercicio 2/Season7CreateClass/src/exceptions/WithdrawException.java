package exceptions;

public class WithdrawException extends Exception {

  public WithdrawException() {
  }
  
  public WithdrawException(String message) {
    super(message);
  }
}
