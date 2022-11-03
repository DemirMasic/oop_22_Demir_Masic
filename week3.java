package mainpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class week3 {
	
	
	public static int sum(int number1, int number2, int number3, int number4) {
		int sum = number1+number2+number3+number4;
		return sum;
	}
	
	
	public static double average(int number1 , int number2, int number3, int number4) {
		double res = sum(number1,number2,number3,number4);
		double avg = res/4;
		return avg;
	}
	
	public static ArrayList<Integer> lengths(ArrayList<String> list) {
		ArrayList<Integer> lengths = new ArrayList<Integer>();
		for(int i=0;i<list.size();i++) {
			String element = list.get(i);
			int counter = element.length();
			lengths.add(counter);
		}
		return lengths;
	}
	
	public static void isPalindrome(String word) {
		String reverseOrder = "";
		
		for (int i = word.length()-1; i>=0;i--) {
			reverseOrder = reverseOrder + word.charAt(i);
		}
		if (word.equals(reverseOrder)) {
			System.out.println("The text is a palindrome!");
		}else {
			System.out.println("The text is not a palindrome!");
		}
	}
	

	public static void main(String[] args) {
		
		// TASK 1:
		
		/*
		double answer = average(4, 3, 6, 1);
		System.out.println("average: " + answer);
        */
		
		// TASK 2:
		
		/*
		Scanner reader = new Scanner(System.in);
		System.out.print("Type your name: ");
		String myName = reader.nextLine();
		System.out.println("Number of characters: "+ myName.length());
		*/
		
		// TASK 3:
		
		/*
		Scanner reader = new Scanner(System.in);
		System.out.print("Type your name: ");
		String myName = reader.nextLine();
		for(int i = 0; i<myName.length();i++) {
			System.out.println(i+1 + ". character: " + myName.charAt(i));
		}
		*/
		
		// TASK 4:
		
		/*
		Scanner reader = new Scanner(System.in);
		System.out.print("Type your name: ");
		String myName = reader.nextLine();
		String reverseOrder = "";
		
		for (int i = myName.length()-1; i>=0;i--) {
			reverseOrder = reverseOrder + myName.charAt(i);
		}
		
		System.out.println("In reverse order: " + reverseOrder);
		*/
		
		// TASK 5:
		
		/*
		Scanner reader = new Scanner(System.in);
		System.out.print("Type the first word: ");
		String word1 = reader.nextLine();
		System.out.print("Type the second word: ");
		String word2 = reader.nextLine();
		if(word1.indexOf(word2)>-1) {
			System.out.println("The word " + word2 + " is found in the word " + word1);
		}
		else {
			System.out.println("The word " + word2 + " is not found in the word " + word1);
		}
		*/
		
		// TASK 6:
		
		/*
		Scanner reader = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<String>();
		
		while(true) {
			System.out.print("Type a word: ");
			String word = reader.nextLine();
			if(words.contains(word)) {
				System.out.println("You have the word " + word + " twice");
				break;
			}else {
				words.add(word);
			}
		}
		
		Collections.sort(words);
		System.out.println(words);
	    */
	
		// TASK 7:
		
		/*
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("Moi");
		list.add("Benvenuto!");
		list.add("badger badger badger badger");
		ArrayList<Integer> lengths = lengths(list);
		
		System.out.println("The lengths of the Strings: " + lengths);
		*/
		
		// TASK 8:
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Type a word: ");
		String word = reader.nextLine();
		isPalindrome(word);
	}   
	
}
