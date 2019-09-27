// Author: Tristan Goodell
// Description: CircleArea.java calculates the area of a circle given radius. Found in Oracle Packet #2. Completed on 9/11/2019.

import java.util.Scanner;

public class CircleArea {
	public static void main (String[] args) { 
		Scanner keyboard = new Scanner(System.in);
		int radius;
		double area;
		
		System.out.println("Enter the radius of the circle:");
		radius = keyboard.nextInt();
		area = Math.PI *radius*radius;
		System.out.println("The area of a circle with a radius of " + radius + " is " + area);
	}
}
