package exceptions;

public class RemainingMonthsException extends RuntimeException {

  public RemainingMonthsException() {
  }

  public RemainingMonthsException(String message) {
    super(message);
  }

}
