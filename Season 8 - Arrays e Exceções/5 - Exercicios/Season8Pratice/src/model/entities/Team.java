package model.entities;

public class Team {
	private String name;
	private Integer wins;
	private Integer defeats;
	private Integer draws;
	private Integer goalsScored;
	private Integer goalsConceded;

	public Team() {
	}

	public Team(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getWins() {
		return wins;
	}

	public void setWins(Integer wins) {
		this.wins = wins;
	}

	public Integer getDefeats() {
		return defeats;
	}

	public void setDefeats(Integer defeats) {
		this.defeats = defeats;
	}

	public Integer getDraws() {
		return draws;
	}

	public void setDraws(Integer draws) {
		this.draws = draws;
	}

	public Integer getGoalsScored() {
		return goalsScored;
	}

	public void setGoalsScored(Integer goalsScored) {
		this.goalsScored = goalsScored;
	}

	public Integer getGoalsConceded() {
		return goalsConceded;
	}

	public void setGoalsConceded(Integer goalsConceded) {
		this.goalsConceded = goalsConceded;
	}

	@Override
	public String toString() {
		return "Team{" +
				"name='" + name + '\'' +
				", wins=" + wins +
				", defeats=" + defeats +
				", draws=" + draws +
				'}';
	}
}
