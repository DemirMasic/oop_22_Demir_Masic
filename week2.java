package mainpackage;

import java.util.Scanner;
import java.util.Random;

public class week2 extends Main {
	
	public static void printText() { 
		System.out.println("In the beginning there were the swamp, the hoe and Java.");
	}
	
	public static void printStars(int amount) {
		int counter = 0;
		while(counter<amount) {
			System.out.print("*");
			counter++;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TASK 1
		
		/*
		Scanner reader = new Scanner(System.in);
		String correctPassword = "carrot";
		while(true) {
			System.out.print("Type the password: ");
			String password = reader.nextLine();
			if(password.equals(correctPassword)) {
				System.out.println("Right!");
				System.out.println("The secret is jryy qbar!");
				break;
			}
			else {
				System.out.println("Wrong!");
			}
		}
		*/
		
		// TASK 2
		
		/*
		Scanner reader = new Scanner(System.in);
		int sum = 0;
		int read;
		System.out.print("Type the first number: ");	
		read = Integer.parseInt(reader.nextLine());
		sum = sum + read;
		System.out.print("Type the second number: ");	
		read = Integer.parseInt(reader.nextLine());
		sum = sum + read;
		System.out.print("Type the third number: ");	
		read = Integer.parseInt(reader.nextLine());
		sum = sum + read;
		System.out.println("Sum: "+sum);
		*/
		
		// TASK 3
		
		/*
		Scanner reader = new Scanner(System.in);
		int sum = 0;
		while(true) {
			int read = Integer.parseInt(reader.nextLine());
			if (read == 0) {
				break;
			}
			sum = sum + read;
			System.out.println("Sum now: " + sum);
		}
		System.out.println("Sum in the end: " + sum);
		*/
		
		// TASK 4
		
		/*
		Scanner reader = new Scanner(System.in);
		int a;
		int b;
		System.out.print("Enter the first number: ");
		a = Integer.parseInt(reader.nextLine());
		System.out.print("Enter the second number: ");
		b = Integer.parseInt(reader.nextLine());
		if(a>b) {
			System.out.println("First: " + a);
			System.out.println("Second: " + b);
		}
		else {
			System.out.println("First: " + a);
			System.out.println("Second: " + b);
			while(a<=b) {
				System.out.println(a);
				a++;
			}
		}
		*/
		
		
		// TASK 5
		
		/*
		Scanner reader = new Scanner(System.in);
		System.out.print("Type a number");
		int n = Integer.parseInt(reader.nextLine());
		int counter = 0;
		int result = 0;
		int sum = 0;
		while(counter <= n) {
			sum = (int)Math.pow(2, counter);
			result = result + sum;
			counter++;
		}
		System.out.println("The result is " + result);
	    */
		
		// TASK 6
		
		/*
		Scanner reader = new Scanner(System.in);
		System.out.print("How many times do you want the text to be printed: ");
		int a = Integer.parseInt(reader.nextLine());
		int counter = 0;
		while(counter<a) {
			printText();
			counter++;
		}
		*/
		
		// TASK 7
		
		/*
		printStars(10);
		printStars(15);
		printStars(10);
		*/
		
		// TASK 8
		
		/*
		Scanner reader = new Scanner(System.in);
		Random random = new Random();
		int randomNumber = random.nextInt(101);
		boolean condtion = true;
		int counter = 0;
		while(condtion) {
			System.out.print("Guess a number: ");
			int guess = Integer.parseInt(reader.nextLine());
			if(guess<randomNumber) {
				counter++;
				System.out.println("The number is greater, guesses made: " + counter);
			}
			else if(guess>randomNumber) {
				counter++;
				System.out.println("The number is lesser, guesses made: " + counter);
			}
			else {
				System.out.println("Congratulations, your guess is correct!");
				condtion = false;
			}
		}
		*/
	}		
}
