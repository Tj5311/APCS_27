/*
 *	Author:  
 *  Date: 
*/

import java.util.Random;
import java.util.Scanner;
class starter {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Computer chooses a random number from 1 to 1000
        int randomNumber = random.nextInt(1000) + 1;

        System.out.println("I picked a random number between 1 and 1000.");
        System.out.println("Try to guess it!");

        System.out.print("Enter your guess: ");
        int guess = scanner.nextInt();

        if (guess == randomNumber) {
            System.out.println("Your number was the random number!");
        } else {
            System.out.println("Your number wasn't the random number.");
            System.out.println("The number was " + randomNumber + ".");
        }

        scanner.close();
    }
}