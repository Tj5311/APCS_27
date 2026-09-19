/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num1 = sc.nextInt();
		System.out.println("                        ");
	System.out.print("Enter another number(BIGGER THAN THE FIRST): ");
		int num2 = sc.nextInt();
		
		int randomNum = (int)(Math.random() * (num2 - num1 + 1) + num1);
		int randomNum2 = (int)(Math.random() * (num2 - num1 + 1) + num1);
		int randomNum3 = (int)(Math.random() * (num2 - num1 + 1) + num1);
		int randomNum4 = (int)(Math.random() * (num2 - num1 + 1) + num1);
		int randomNum5 = (int)(Math.random() * (num2 - num1 + 1) + num1);
		System.out.println("Here are 5 random numbers between " + num1 + " and " + num2 + ": ");
		System.out.println(randomNum + ", " + randomNum2 + ", " + randomNum3 + ", " + randomNum4 + ", " + randomNum5);
	}
}
