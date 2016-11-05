package main;

import java.util.Scanner;

import player.Inventory;
import player.Player;

public class Main{

	static Player player = new Player();
	static String inputText = "";
	Inventory inventory = new Inventory();

	public static void main(String[] args) {
		doIntro();
	}

	

	private Main() {
		

	
	
				
	
}


	private static void doIntro() { //The part where the story gets explained and the player gets his name comes here.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello adventurer and welcome to the RRPG!\nWhat is your name?");
		player.setName(scanner.next());
		System.out.println("Hello " + player.getName() + " are you ready for your adventure?\nDon't answer that, it was a retorical question, you have no choice.");
		
		for(int i=0; i<10; i++){	
			System.out.println("\n");
		}
	}


}


