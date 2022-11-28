package week5;

import java.util.ArrayList;

public class Team {
	private String name;
	private ArrayList<Player> players = new ArrayList<Player>();
	private int maxSize = 16;
	
	public Team(String nameOfTheTeam) {
		this.name = nameOfTheTeam;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addPlayer(Player player) {
		if (players.size() < maxSize) {
			players.add(player);
		}
	}
	
	public void printPlayers() {
		for (Player num : players) {
			System.out.println(num);
		}	
	}
	
	public int setMaxSize(int newSize) {
		 return this.maxSize = newSize;
	}
	
	public int size() {
		return players.size();
	}
	
	public int goals() {
		int sum = 0;
		for (Player num : players) {
			sum = sum + num.getGoals();
		}
		return sum;
	}
}
