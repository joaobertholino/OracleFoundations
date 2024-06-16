package model.entities;

import exceptions.InsufficientFunds;
import exceptions.InsufficientTickets;

import java.util.List;

public class Terminal {
	private List<Award> award;
	private MagneticCardReader magneticCardReader;

	public Terminal() {
	}

	public Terminal(List<Award> award, MagneticCardReader magneticCardReader) {
		this.award = award;
		this.magneticCardReader = magneticCardReader;
	}

	public List<Award> getAward() {
		return award;
	}

	public void setAward(List<Award> award) {
		this.award = award;
	}

	public MagneticCardReader getMagneticCardReader() {
		return magneticCardReader;
	}

	public void setMagneticCardReader(MagneticCardReader magneticCardReader) {
		this.magneticCardReader = magneticCardReader;
	}

	public void moneyForCredit(Card card, Integer moneyValue) {
		this.magneticCardReader.moneyForCredit(card, moneyValue);
	}

	public Integer checkTicketBalance(Card card) {
		return this.magneticCardReader.checkTicketBalance(card);
	}

	public void creditTransfer(Card cardPrimary, Card cardSecond, Integer value) throws InsufficientFunds {
		if (value <= 0) {
			throw new IllegalArgumentException("Invalid value!");
		} else if (cardPrimary.getTicketBalance() < value) {
			throw new InsufficientFunds("Insufficient funds!");
		}
		cardPrimary.setTicketBalance(cardPrimary.getTicketBalance() - value);
		cardSecond.setTicketBalance(cardSecond.getTicketBalance() + value);
	}

	public void exchangeForPrizes(Card card, int indexAward) throws InsufficientTickets {
		for(Award awards : this.award) {
			if (card.getTicketBalance() < awards.getMinimumTickets()) {
				throw new InsufficientTickets("Insufficient tickets!");
			}
			card.setTicketBalance(card.getTicketBalance() - this.award.get(indexAward).getMinimumTickets());
		}
	}
}
