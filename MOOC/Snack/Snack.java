// Author: Tristan Goodell
// Program Description: Snack.java program from MOOC 3a using the Scanner utility. Completed on 9/11/2019

import java.util.Scanner;
class Snack {
	public static void main (String str[]) {
		Scanner scan = new Scanner (System.in);
		String favSnack;
		System.out.println("What is your favourite snack?");
		favSnack = scan.nextLine();
		System.out.println(favSnack + " sounds delicious");
	}
}
