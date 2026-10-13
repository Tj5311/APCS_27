/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String input;
		// Your code goes below here
		System.out.println("Welcome to the number guessing game!");
		System.out.println("The goal of this game is to guess the number that the computer has randomly generated, but it will not tell you after one guess, you will have to guess from a range of 1-1000.");
		int correct = (int)(Math.random() * 1000) + 1;
		int num = 0;
		while(num != correct){
			System.out.println("Enter a number: ");
			input = sc.nextLine();
			if (input.equalsIgnoreCase("give up")) {
				System.out.println("The correct number was " + correct);
				break;
			}
			num = sc.nextInt();
			if(num != correct){
				System.out.println("incorrect try again");
			
			}
			if(num == correct){
				System.out.println("You guessed the correct number!");
			}
			if(num < correct){
				System.out.println("The number is too low, try again");
			}	
			if(num > correct){
				System.out.println("The number is too high, try again");
			}
		}



		
	}
}
