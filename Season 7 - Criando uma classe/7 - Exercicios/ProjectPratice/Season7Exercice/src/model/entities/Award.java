package model.entities;

public class Award {
	private String categoryName;
	private Integer minimumTickets;
	private Integer amount;

	public Award() {
	}

	public Award(String categoryName, Integer minimumTickets, Integer amount) {
		this.categoryName = categoryName;
		this.minimumTickets = minimumTickets;
		this.amount = amount;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Integer getMinimumTickets() {
		return minimumTickets;
	}

	public void setMinimumTickets(Integer minimumTickets) {
		this.minimumTickets = minimumTickets;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}
}
