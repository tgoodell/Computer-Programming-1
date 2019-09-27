// Author: Tristan Goodell
// Description: Dollars.java coverts cents to US Dollars. Found in Oracle Packet #2. Completed on 9/11/2019.

import java.util.Scanner;

public class Dollars {
	public static void main (String[] args) { 
		Scanner keyboard = new Scanner(System.in);
		int initial;
		int cents;
		int dollars;
		
		System.out.println("Input the cents:");
		initial = keyboard.nextInt();
		dollars = initial / 100;
		cents = initial % 100;
		System.out.println("That is " + dollars + " dollars and " + cents + " cents.");
	}
}
