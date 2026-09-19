/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {

		
		Scanner sc = new Scanner(System.in);
		System.out.print("a number between 0 - 9: ");
		int num1 = (int)(Math.random() * 9) + 0;
		System.out.println(num1);

		System.out.print("a number between 1 - 10: ");
		int num2 = (int)(Math.random() * 10) + 1;
		System.out.println(num2);

		System.out.print("a number between 3.5 - 2.5: ");
		double num3 = (double)(Math.random() * (3.5) + (2.5) - (2.5));
		System.out.println(num3);

		System.out.print("a double between 14 - 589: ");
		double num4 = (double)(Math.random() * 575) + 14;
		System.out.println(num4);
	}
}
