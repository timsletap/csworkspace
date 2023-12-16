import java.util.Random;
import java.util.Scanner;
public class Marbles {
	static 	Scanner input = new Scanner(System.in);
	static Random r = new Random();
	public static void main(String[] args) {
		int initPile = r.nextInt(100)+10;
		int mode = r.nextInt(2)+1;
		System.out.println("Welcome to Marbles! The amount of marbles in the pile is "+initPile);
		if(mode == 2) {
			System.out.println("You are playing smart mode!");
			smartMode(initPile);
		} else if(mode == 1) {
			System.out.println("You are playing dumb mode!");
			dumbMode(initPile);
		} else { 
			System.out.println("Error! Try Again");
		}
	}
	public static void dumbMode(int x) {
		int pile = x;
		int userGuess;
		Boolean turn;
	do {
		int computerGuess = r.nextInt(pile/2)+1;
		System.out.println("The computer takes away " +computerGuess+" marbles.");
		pile-=computerGuess;
		System.out.println("There is "+pile+" marbles left in the pile.");
		turn = true;
		do {
		System.out.println("How many marbles would you like to take --> ");
		userGuess = input.nextInt();
		if(pile <= 1) {
			break;
		}
		} while(!(userGuess <= pile/2.0 && userGuess >= 1));
		pile-=userGuess;
		System.out.println("There is "+pile+" marbles left in the pile.");
		turn = false;
	} while(pile > 1);
	if(turn == false) {
		System.out.println("You beat the computer because the computer would've took the last marble!!");
	} else {
		System.out.println("The computer beat you because you took the last marble!!");
	}
		
	}
	public static void smartMode(int y) {
		int pile  = y;
		int userGuess;
		int computerGuess;
		Boolean turn;
	
	do {
		turn = true;
		
		if(pile > 63) {
			computerGuess = pile - 63;
		} else if(pile > 31) {
			computerGuess = pile - 31;
		} else if(pile > 15) {
			computerGuess = pile - 15;
		} else if(pile > 7) {
			computerGuess = pile - 7;
		} else if(pile > 3) {
			computerGuess = pile - 3;
		} else {
			computerGuess = 1;
		}
		
		
		System.out.println("The computer takes away " +computerGuess+" marbles.");
		pile-=computerGuess;
		System.out.println("There is "+pile+" marbles left in the pile.");
		
		do {
		System.out.println("How many marbles would you like to take --> ");
		userGuess = input.nextInt();
		if(pile <= 1) {
			break;
		}
		} while(!(userGuess <= pile/2.0 && userGuess >= 1));
		
		pile-=userGuess;
		System.out.println("There is "+pile+" marbles left in the pile.");
		turn = false;
	
	
	
	} while(pile > 1);
	
	if(turn == true) {
		System.out.println("You beat the computer because the computer would've took the last marble!!");
	} else {
		System.out.println("The computer beat you because you took the last marble!!");
	}
		
	}
	
	
	
}

	
		



