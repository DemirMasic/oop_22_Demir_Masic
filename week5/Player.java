package week5;

public class Player {
	private String name;
	private int goals;
	
	public Player(String nameOfThePlayer) {
		this.name = nameOfThePlayer;
	}
	
	public Player(String nameOfThePlayer, int numberOfGoals) {
		this.name = nameOfThePlayer;
		this.goals = numberOfGoals;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getGoals() {
		return this.goals;
	}
	
	public String toString() {
		return this.name + ", goals " + this.goals;
	}
}
