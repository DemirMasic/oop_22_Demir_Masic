package week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//task 1:
		/*
		int[] values = {6, 5, 8, 7, 11};
		System.out.println("smallest: " + smallest(values));
		*/
		
		//task 2:
		/*
		int[] values = {6, 5, 8, 7, 11};
		System.out.println("smallest: " + indexOfTheSmallest(values));
		*/
		
		//task 3:
		/*
		int[] values = {-1, 6, 9, 8, 12};
		System.out.println(indexOfTheSmallestStartingFrom(values, 1));
		System.out.println(indexOfTheSmallestStartingFrom(values, 2));
		System.out.println(indexOfTheSmallestStartingFrom(values, 4));
		*/
		
		//task 4:
		/*
		int[] values = {3, 2, 5, 4, 8};
		
		System.out.println(Arrays.toString(values));
		
		swap(values, 1, 0);
		System.out.println(Arrays.toString(values));
		
		swap(values, 0, 3);
		System.out.println(Arrays.toString(values));
		*/
		
		//task 5:
		/*
		int [] array = {-3, 2, 3, 4, 7, 8, 12};
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Values of the array: " + Arrays.toString(array));
		System.out.println();
		
		System.out.print("Enter searched number: ");
		String searchedValue = reader.nextLine();
		System.out.println();
		
		boolean result = BinarySearch.search(array, Integer.parseInt(searchedValue));
		if (result == true) {
			System.out.println("Value " + searchedValue + " is in the array");
		}else {
			System.out.println("Value " + searchedValue + " is not in the array");
		}
		*/
		
		//task 6:
		/*
		int[] array = {5, 1, 3, 4, 2};
		printElegantly(array);
		*/
		//task 7: NightSky
		/*
		NightSky NightSky = new NightSky(0.1, 40, 10);
		NightSky.print();
		System.out.println("Number of stars: " + NightSky.starsInLastPrint());
		System.out.println("");
		 
		NightSky = new NightSky(0.2, 15, 6);
		NightSky.print();
		System.out.println("Number of stars: " + NightSky.starsInLastPrint());
		*/
		
		//task 8: Library information system
		/*
		Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
		System.out.println(cheese.title());
		System.out.println(cheese.publisher());
		System.out.println(cheese.year());

		System.out.println(cheese);
		*/
		//task 9: Part 2: Library
		/*
		Library Library = new Library();
		Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
		Library.addBook(cheese);

		Book nhl = new Book("NHL Hockey", "Stanley Kupp", 1952);
		Library.addBook(nhl);

		Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

		Library.printBooks();
		*/
		
		//task 10: Part 3: Search functionality
		/*
		Library Library = new Library();

		Library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
		Library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
		Library.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
		Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

		ArrayList<Book> result = Library.searchByTitle("Cheese");
		for (Book book: result) {
		    System.out.println(book);
		}

		System.out.println("---");
		for (Book book: Library.searchByPublisher("Penguin Group  ")) {
		    System.out.println(book);
		}

		System.out.println("---");
		for (Book book: Library.searchByYear(1851)) {
		    System.out.println(book);
		}
		*/
		
		//task 11: Part 4: Improved search
		/*
		Library Library = new Library();

		Library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
		Library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
		Library.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
		Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

		for (Book book: Library.searchByTitle("CHEESE")) {
		    System.out.println(book);
		}

		System.out.println("---");
		for (Book book: Library.searchByPublisher("PENGUIN  ")) {
		    System.out.println(book);
		}
		*/
		
		//task 12: Birdwatchers database
		/*
		Scanner program = new Scanner(System.in);
		int i = 0;
		BirdWatcher Birds = new BirdWatcher();
		while(true) {
			System.out.print("? ");
			String commands = program.nextLine();
			commands = commands.toLowerCase();
			if (commands.equals("quit")) {
				break;
			}else if (commands.equals("add")){
				i +=1;
				System.out.print("Name: ");
				String tempName = program.nextLine();
				System.out.print("Latin Name: ");
				String tempLatinName = program.nextLine();
				Birds.addBird(new Bird(tempName, tempLatinName));
				
			}else if (commands.equals("observation")) {
				System.out.print("What was observed:? ");
				String temp = program.nextLine();
				if (Birds.doesExist(temp)) {
					Birds.gotObserved(temp);
				}else {
					System.out.println("Is not a bird");
				}
			
			}else if (commands.equals("statistics")) {
				Birds.statistics();
				
			}else if (commands.equals("show")) {
				System.out.print("What? ");
				String temp = program.nextLine();
				Birds.show(temp);
				
			}
		}
		*/
	}	
	
	public static int smallest(int[] array) {
		int smallest = array[0];
		for (int num : array) {
			if (num < smallest) {
				smallest = num;
			}
		}
		return smallest;
	}
	
	public static int indexOfTheSmallest(int[] array) {
		int smallest = array[0];
		int index = 0;
		for (int i =0;i<array.length;i++) {
			if (array[i] < smallest) {
				smallest = array[i];
				index = i;
			}
		}
		return index;
	}
	
	public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
		int smallest = array[index];
		for (int i = index;i<array.length;i++) {
			if (array[i] < smallest) {
				smallest = array[i];
				index = i;
			}
		}
		return index;
	}
	
	public static void swap(int[] array, int index1, int index2) {
		int temp1 = array[index1];
		int temp2 = array[index2];
		array[index1] = temp2;
		array[index2] = temp1;
 	}
	
	public static void printElegantly(int[] array) {
		int counter = 0;
		int stopCounter = array.length - 1;
		for (int i : array) {
			counter++;
			if (counter > stopCounter) {
				System.out.print(i);
			}else {
				System.out.print(i + ", ");
			}
			
		}
	}

}
