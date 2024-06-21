package model.entities;

import java.util.ArrayList;
import java.util.Random;

public class Game {
	private Integer id;
	private static ArrayList<Team> teams;
	private Integer temperature;
	private static ArrayList<Game> gameList;

	public Game() {
	}

	public Game(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public static ArrayList<Team> getTeams() {
		return teams;
	}

	public static void setTeams(ArrayList<Team> teams) {
		Game.teams = teams;
	}

	public Integer getTemperature() {
		return temperature;
	}

	public void setTemperature(Integer temperature) {
		this.temperature = temperature;
	}

	public static ArrayList<Game> getGameList() {
		return gameList;
	}

	public static void setGameList(ArrayList<Game> gameList) {
		Game.gameList = gameList;
	}

	public boolean goalCounter() {
		if (this.temperature <= 0) {
			return false;
		} else if (this.temperature <= 10) {
			goalsGenerate(1, 3);
			return true;
		} else if (this.temperature <= 15) {
			goalsGenerate(3, 5);
			return true;
		} else {
			goalsGenerate(5, 7);
			return true;
		}
	}

	private void goalsGenerate(int origin, int bound) {
		Random random = new Random();
		for (int i = 0; i < Game.teams.size() / 2; i++) {
			int teamOne;
			int teamTwo;
			do {
				teamOne = random.nextInt(0, Game.teams.size());
				teamTwo = random.nextInt(0, Game.teams.size());
			} while (teamOne == teamTwo);

			int goalsTeamOne = random.nextInt(origin, bound);
			Game.teams.get(teamOne).setGoalsScored(goalsTeamOne);
			Game.teams.get(teamTwo).setGoalsConceded(goalsTeamOne);

			int goalsTeamTwo = random.nextInt(origin, bound);
			Game.teams.get(teamTwo).setGoalsScored(goalsTeamTwo);
			Game.teams.get(teamOne).setGoalsConceded(goalsTeamTwo);
		}
	}
}
