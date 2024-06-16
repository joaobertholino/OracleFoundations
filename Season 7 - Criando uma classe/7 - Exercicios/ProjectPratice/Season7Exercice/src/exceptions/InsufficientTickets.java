package exceptions;

public class InsufficientTickets extends Exception {
	public InsufficientTickets() {
		super();
	}

	public InsufficientTickets(String message) {
		super(message);
	}
}
