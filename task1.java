package week1;

import java.util.Scanner;

public class task1 {
	public static void main(String[] args) {
		//System.out.println("Demir Masic");
		
		//System.out.println("Hello world \n(And all the people of the world)");
		
		/*
		int seconds = 365*24*60*60;
		System.out.println("There are "+ seconds +" seconds in a year");
		*/
		
		/*
		Scanner reader = new Scanner(System.in);
		System.out.println("Type first integer: ");
		int number1 = Integer.parseInt(reader.nextLine());
		System.out.println("Type second integer");
		int number2 = Integer.parseInt(reader.nextLine());
		System.out.println("Sum of the numbers is "+(number1+number2));
		*/
		
		/*
		Scanner ispositive = new Scanner(System.in);
		System.out.println("Type a number");
		int positive = Integer.parseInt(ispositive.nextLine());
		if (positive > 0) {
			System.out.println("Your number is positive.");
			
		}
		else {
			System.out.println("Your number is not positive.");
		}
		*/
		
		Scanner whichgreater = new Scanner(System.in);
		System.out.println("Type the first number");
		int num1 = Integer.parseInt(whichgreater.nextLine());
		System.out.println("Type your second number");
		int num2 = Integer.parseInt(whichgreater.nextLine());
		if (num1>num2) {
			System.out.println("Greater number: "+num1);
		}
		else if(num2>num1) {
			System.out.println("Greater number: "+num2);
		}
		else {
			System.out.println("The numbers are equal");
		}
			
	}
}
