// Author: Tristan Goodell
// Description: PowerCosting.java calculates the annual cost of running an appliance. Found in Oracle Packet #2. Completed on 9/18/2019.

import java.util.Scanner;

public class PowerCosting {
	public static void main (String[] args) { 
		Scanner keyboard = new Scanner(System.in);
		float cost;
		int hours;
		float annual;
		
		System.out.println("Enter cost per kilowatt-hour in cents:");
		// keyboard.nextFloat used as a fix for "Exception in thread "main" java.util.InputMismatchException [...] with code 1.
		cost = keyboard.nextFloat();
		System.out.println("Enter kilowatt-hours used per year:");
		hours = keyboard.nextInt();
		
		annual = (cost/100) * hours;
		System.out.println("Annual cost: $" + annual);
	}
}
