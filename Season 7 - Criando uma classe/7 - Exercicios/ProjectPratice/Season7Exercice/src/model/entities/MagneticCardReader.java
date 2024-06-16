package model.entities;

import exceptions.InsufficientFunds;

import java.util.Random;

public class MagneticCardReader {
	private Game game;

	public MagneticCardReader() {
	}

	public MagneticCardReader(Game game) {
		this.game = game;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public void reduceBalance(Card card) throws InsufficientFunds {
		if (card.getBalance() < this.game.getPrice()) {
			throw new InsufficientFunds("Insufficient balance for this game - " + "Saldo do cartão: " + card.getBalance());
		}
		card.setBalance(card.getBalance() - this.game.getPrice());
		Random random = new Random();
		card.setTicketBalance(random.nextInt(1, 101));
	}

	public void moneyForCredit(Card card, Integer money) throws IllegalArgumentException {
		if (money <= 0 || card == null) {
			throw new IllegalArgumentException("Values and/or invalid card!");
		}
		card.setTicketBalance(money * 2);
	}

	public Integer checkTicketBalance(Card card) throws IllegalArgumentException {
		if (card == null) {
			throw new IllegalArgumentException("Invalid card!");
		}
		return card.getTicketBalance();
	}
}
