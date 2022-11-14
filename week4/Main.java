package week4;

import java.util.ArrayList;

public class Main {
	

	public static void main(String[] args) {
		
		//TASK 1:
		/*
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		list1.add(4);
		list1.add(3);

		list2.add(5);
		list2.add(10);
		list2.add(7);

		combine(list1, list2);

		System.out.println(list1); 
		System.out.println(list2); 
		*/
		
		//TASK 2:
		/*
		Dice dice = new Dice(6);
		System.out.println(dice.roll());
		int i = 0;
        while ( i < 10 ) {
            System.out.println( dice.roll() );
            i++;
        }
        */
		
		//TASK 3.1:
		/*
		LyyraCard card = new LyyraCard(50);
        System.out.println(card);
		*/
		
		//TASK 3.2:
		/*
		LyyraCard card = new LyyraCard(50);
        System.out.println(card);

        card.payEconomical();
        System.out.println(card);

        card.payGourmet();
        card.payEconomical();
        System.out.println(card);
        */
		
		//TASK 3.3:
		/*
		LyyraCard card = new LyyraCard(5);
        System.out.println(card);

        card.payGourmet();
        System.out.println(card);

        card.payGourmet();
        System.out.println(card);
        */
		
		//TASK 3.4:
		/*
		LyyraCard card = new LyyraCard(10);
        System.out.println(card);

        card.loadMoney(15);
        System.out.println(card);

        card.loadMoney(10);
        System.out.println(card);

        card.loadMoney(200);
        System.out.println(card);
		*/
		
		//TASK 3.5:
		/*
		LyyraCard card = new LyyraCard(10);
        System.out.println("Pekka: " + card);
        card.loadMoney(-15);
        System.out.println("Pekka: " + card);
        */
		
		//TASK 3.6:
		LyyraCard cardPekka = new LyyraCard(20);
        LyyraCard cardBrian = new LyyraCard(30);
        
        cardPekka.payGourmet();
        cardBrian.payEconomical();
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
        cardPekka.loadMoney(20);
        cardBrian.payGourmet();
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
        cardPekka.payEconomical();
        cardPekka.payEconomical();
        cardBrian.loadMoney(50);
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
	}
	
	public static void combine(ArrayList<Integer> first, ArrayList<Integer> second) {
		first.addAll(second);
	}

}
