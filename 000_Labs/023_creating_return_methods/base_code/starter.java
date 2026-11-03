/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;



class starter {

public static int calculatePower(int base , int exponent) {
	return (int) Math.pow(base, exponent);
}
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your base number?");
		int base = sc.nextInt();
		System.out.println("What is your exponent number?");
		int exponent = sc.nextInt();
		System.out.println("");
		System.out.println(calculatePower(base , exponent));
	}
}
