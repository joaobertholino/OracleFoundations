package model.entities;

public class Card implements Comparable<Card> {
	private Integer cardCode;
	private Integer balance;
	private Integer ticketBalance;

	public Card() {
	}

	public Card(Integer cardCode, Integer balance, Integer ticketBalance) {
		this.cardCode = cardCode;
		this.balance = balance;
		this.ticketBalance = ticketBalance;
	}

	public Integer getCardCode() {
		return cardCode;
	}

	public void setCardCode(Integer cardCode) {
		this.cardCode = cardCode;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public Integer getTicketBalance() {
		return ticketBalance;
	}

	public void setTicketBalance(Integer ticketBalance) {
		this.ticketBalance = ticketBalance;
	}

	@Override
	public int compareTo(Card other) {
		return this.cardCode.compareTo(other.cardCode);
	}

	@Override
	public String toString() {
		return "Card {" +
				"cardCode = " + cardCode +
				", balance = " + balance +
				", ticketBalance = " + ticketBalance +
				'}';
	}
}
