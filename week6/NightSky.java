package week6;

import java.util.Random;

public class NightSky {
	private double density;
	private int width;
	private int height;
	private int starsInLastPrint;
	
	public NightSky(double density) {
		this.density = density;
		this.width = 20;
		this.height = 10;
	}
	
	public NightSky(int width, int height) {
		this.density = 0.1;
		this.width = width;
		this.height = height;
	}
	
	public NightSky(double density, int width, int height) {
		this.density = density;
		this.width = width;
		this.height = height;
	}
	
	public int printLine() {
		int i = 0;
		int counter = 0;
		Random random = new Random();
		while(i<this.width) {
			i++;
			double starChance = random.nextDouble();
			if (starChance > this.density) {
				System.out.print(" ");
			}else {
				System.out.print("*");
				counter ++;
			}
		}
		return counter;

	}
	
	public void print() {
		for (int i=0;i<this.height;i++) {
			int a = printLine();
			this.starsInLastPrint = this.starsInLastPrint + a;
			System.out.println();
		}
	}
	public int starsInLastPrint() {
		int temp = this.starsInLastPrint;
		this.starsInLastPrint = 0;
		return temp;
	}
	
	
}
