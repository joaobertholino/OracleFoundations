package exceptions;

public class TermException extends RuntimeException {

  public TermException() {
  }

  public TermException(String message) {
    super(message);
  }

}
