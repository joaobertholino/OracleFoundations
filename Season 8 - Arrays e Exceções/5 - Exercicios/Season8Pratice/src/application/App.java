package application;

import model.entities.Game;
import model.entities.Team;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Insira a quantidade de times: ");
		ArrayList<Team> teams = createTeam(in, in.nextInt());

		Game gameOne = new Game(1);
		Game.setGameList(new ArrayList<>());
		Game.getGameList().add(gameOne);
		Game.setTeams(teams);

		boolean status;
		int count = 1;
		do {
			System.out.print("Insira a temperatura: ");
			gameOne.setTemperature(in.nextInt());
			in.nextLine();

			if (count == 3) {
				System.out.println("Final de temporada!");
			}
			status = gameOne.goalCounter();
			count++;
		} while (!status);

		getResult(Game.getTeams());
	}

	public static ArrayList<Team> createTeam(Scanner in, int amount) {
		ArrayList<Team> teams = new ArrayList<>();
		in.nextLine();

		for (int i = 1; i <= amount; i++) {
			System.out.println("Insira o nome do " + i + "° time: ");
			String teamName = in.nextLine();

			teams.add(new Team(teamName));
		}
		return teams;
	}

	public static void getResult(ArrayList<Team> teams) {
		for (Team team : teams) {
			System.out.println(team.getName());
			System.out.println(team.getGoalsScored());
			System.out.println(team.getGoalsConceded());
		}
	}
}