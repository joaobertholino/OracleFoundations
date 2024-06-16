package application;

import exceptions.InsufficientFunds;
import exceptions.InsufficientTickets;
import model.entities.*;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) throws InsufficientFunds, InsufficientTickets {
		Card cardOne = new Card(1258, 154, 1);
		Card cardTwo = new Card(5858, 784, 56);

		Game game = new Game(5);
		MagneticCardReader magneticCardReader = new MagneticCardReader(game);
		game.setMagneticCardReader(magneticCardReader);

		List<Award> awardList = new ArrayList<>();
		awardList.add(new Award("Plush", 5, 20));
		awardList.add(new Award("Keychain", 10, 15));

		Terminal terminal = new Terminal(awardList, magneticCardReader);
//		Consulta de saldo.
		System.out.println("Card balance one: " + terminal.checkTicketBalance(cardOne));
		System.out.println("Card balance two: " + terminal.checkTicketBalance(cardTwo));

//		Transferencia de credito.
		terminal.creditTransfer(cardOne, cardTwo, 5);
		System.out.println("Credit transfer from card one: " + terminal.checkTicketBalance(cardOne));
		System.out.println("Credit transfer from card two: " + terminal.checkTicketBalance(cardTwo));

//		Troca por premios.
		terminal.exchangeForPrizes(cardOne, 1);
	}
}
