/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		System.out.println("this is a program that will run a loop with what you type in the next box and counts it a random amount of times from 1-1000");
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("type something in the box below");
			String input = sc.nextLine();
			int random = (int)(Math.random() * 1000) + 1;
			for(int i = 0; i < random; i++){
				System.out.println(input);
			}
			System.out.println("this program was repeated " + random + " times");
		if (random == random) {
			break;
		}



		
	}
}
}
