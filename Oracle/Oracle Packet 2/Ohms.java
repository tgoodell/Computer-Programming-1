// Author: Tristan Goodell
// Description: Ohms.java calculates the current flowing through a device. Found in Oracle Packet #2. Completed on 9/18/2019.

import java.util.Scanner;

public class Ohms {
	public static void main (String[] args) { 
		Scanner keyboard = new Scanner(System.in);
		int voltage;
		int resistance;
		double current;
		
		System.out.println("Input the voltage:");
		voltage = keyboard.nextInt();
		System.out.println("Input the resistance:");
		resistance = keyboard.nextInt();
		
		current = (voltage + 0.0) / resistance;
		System.out.println("The current is " + current + " .");
	}
}
