package model.entities;

import java.util.ArrayList;

public class Team {
	private String name;
	private ArrayList<Integer> victories;
	private ArrayList<Integer> defeats;
	private ArrayList<Integer> draws;
	private ArrayList<Integer> goalsScored;
	private ArrayList<Integer> goalsConceded;

	public Team() {
	}

	public Team(String name, ArrayList<Integer> victories, ArrayList<Integer> defeats, ArrayList<Integer> draws, ArrayList<Integer> goalsScored, ArrayList<Integer> goalsConceded) {
		this.name = name;
		this.victories = victories;
		this.defeats = defeats;
		this.draws = draws;
		this.goalsScored = goalsScored;
		this.goalsConceded = goalsConceded;
	}

	public String getName() {
		return name;
	}

	public ArrayList<Integer> getVictories() {
		return victories;
	}

	public void setVictories(ArrayList<Integer> victories) {
		this.victories = victories;
	}

	public ArrayList<Integer> getDefeats() {
		return defeats;
	}

	public void setDefeats(ArrayList<Integer> defeats) {
		this.defeats = defeats;
	}

	public ArrayList<Integer> getDraws() {
		return draws;
	}

	public void setDraws(ArrayList<Integer> draws) {
		this.draws = draws;
	}

	public ArrayList<Integer> getGoalsScored() {
		return goalsScored;
	}

	public void setGoalsScored(ArrayList<Integer> goalsScored) {
		this.goalsScored = goalsScored;
	}

	public ArrayList<Integer> getGoalsConceded() {
		return goalsConceded;
	}

	public void setGoalsConceded(ArrayList<Integer> goalsConceded) {
		this.goalsConceded = goalsConceded;
	}
}
