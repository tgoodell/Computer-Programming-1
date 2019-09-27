// Author: Tristan Goodell
// Description: HarmonicMean.java calculates the velocity and distance traveled for a brick given time. Found in Oracle Packet #2. Completed on 9/18/2019.

import java.util.Scanner;

public class HarmonicMean {
	public static void main (String[] args) { 
		Scanner keyboard = new Scanner(System.in);
		double x, y, mean, harmonic;
		
		System.out.println("Enter X:");
		x = keyboard.nextFloat();
		System.out.println("Enter Y:");
		y = keyboard.nextFloat();
		
		mean = .5 * (x + y);
		harmonic = 2 / (1/x + 1/y);
		
		System.out.println("Arithmetic mean: " + mean);
		System.out.println("Harmonic mean: " + harmonic);
	}
}
