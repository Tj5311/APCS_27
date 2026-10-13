/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 100;
		String play;

		System.out.println("This here is a totally legal slot machine");
		System.out.println("Here are the rules:");
		System.out.println("1. Each player starts with $100");
		System.out.println("2. Input the amount at the max of your current balance");
		System.out.println("3. If all three numbers match, you win triple your bet");
		System.out.println("4. If two numbers match, you win double your bet");
		System.out.println("5. If no numbers match, you lose your bet");
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println();

		while (balance > 0) {
			System.out.println("Your current balance is: $" + balance);
			System.out.print("Would you like to play? (yes/no): ");
			String yesorno = sc.nextLine();

			if (!yesorno.equalsIgnoreCase("yes")) {
				System.out.println("Maybe next time!");
				break;
			}

			System.out.print("How much money would you like to wager? ");
			play = sc.nextLine();
			int wager = Integer.parseInt(play);

			if (wager <= 0 || wager > balance) {
				System.out.println("Invalid wager. Please enter an amount between $1 and $" + balance + ".");
				continue;
			}

			int number1 = (int)(Math.random() * 9) + 1;
			int number2 = (int)(Math.random() * 9) + 1;
			int number3 = (int)(Math.random() * 9) + 1;

			System.out.println(number1 + " " + number2 + " " + number3);

			if (number1 == number2 && number2 == number3) {
				System.out.println("You win triple your bet!");
				balance += wager * 2;
			} else if (number1 == number2 || number1 == number3 || number2 == number3) {
				System.out.println("You win double your bet!");
				balance += wager;
			} else {
				System.out.println("You lose your bet!");
				balance -= wager;
			}

			System.out.println();
		}

		if (balance <= 0) {
			System.out.println("You are out of money. Game over.");
		}
	}
}
