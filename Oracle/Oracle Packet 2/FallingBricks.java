// Author: Tristan Goodell
// Description: FallingBricks.java calculates the velocity and distance traveled for a brick given time. Found in Oracle Packet #2. Completed on 9/18/2019.

import java.util.Scanner;

public class FallingBricks {
	public static void main (String[] args) { 
		Scanner keyboard = new Scanner(System.in);
		double time;
		double velocity;
		double gravity = 32.174;
		double distance;
		
		System.out.println("Enter the number of seconds:");
		time = keyboard.nextFloat();
		
		velocity = gravity * time;
		distance = .5 * gravity * time * time;
		
		System.out.println("Speed of the brick: " + velocity + " feet per second");
		System.out.println("Distance fallen: " + distance + " feet");
	}
}
