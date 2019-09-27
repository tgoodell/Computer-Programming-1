// Author: Tristan Goodell
// Description: calculates the mean of two numbers. Found in MOOC 5a. Completed on 9/26/2019.


import java.util.Scanner;

class Average {
	public static void main (String str[]) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("First number:");
		int num1 = keyboard.nextInt();
		System.out.println("Second Number:");
		int num2 = keyboard.nextInt();
		
		System.out.println("Average: " + (1.0 * (num1 + num2) / 2));
	}
}
