package model.entities;

public class Game {
	private Integer price;
	private MagneticCardReader magneticCardReader;

	public Game() {
	}

	public Game(Integer price, MagneticCardReader magneticCardReader) {
		this.price = price;
		this.magneticCardReader = magneticCardReader;
	}

	public Game(Integer price) {
		this.price = price;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public MagneticCardReader getMagneticCardReader() {
		return magneticCardReader;
	}

	public void setMagneticCardReader(MagneticCardReader magneticCardReader) {
		this.magneticCardReader = magneticCardReader;
	}
}
