// Author: Tristan Goodell
// Description: CorrectChange.java calculates the correct change. Found in Oracle Packet #2. Completed on 9/18/2019.

import java.util.Scanner;

public class CorrectChange {
	public static void main (String[] args) { 
		Scanner keyboard = new Scanner(System.in);
		int change;
		int remainder;
		int dollars;
		int quarters;
		int dimes;
		int nickles;
		int pennies;
		
		System.out.println("Input the change:");
		change = keyboard.nextInt();
		dollars = change / 100;
		remainder = change % 100;
		quarters = remainder / 25; 
		remainder = remainder  % 25; 
		dimes = remainder / 10;
		remainder = remainder  % 10;
		nickles = remainder / 5;
		remainder = remainder  % 5;
		pennies = remainder / 1; 
		System.out.println("Your change is: " + dollars + " dollars, " + quarters + " quarters, " + dimes + " dimes, " + nickles + " nickles, and " + pennies + " pennies.");
	}
}
