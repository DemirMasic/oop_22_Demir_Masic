package week6;

public class Bird {
	private String name;
	private String latinName;
	private int observationCount = 0;
	
	public Bird(String name, String latinName) {
		this.name = name;
		this.latinName = latinName;
	}
	
	public void Observed() {
		this.observationCount +=1;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getLatinName() {
		return this.latinName;
	}
	
	public int getObeservations() {
		return this.observationCount;
	}
	
	
}
