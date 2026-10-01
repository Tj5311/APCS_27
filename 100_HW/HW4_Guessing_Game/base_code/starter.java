/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Random;
import java.util.Scanner;

class starter {

    public static void main(String args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String Canswer = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        String userGuess = "";
        int attempts = 0;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("the computer has selected a random word, a hint has been given with the word.");
        System.out.println("good luck!");

         if (guess.equalsIgnoreCase(secretWord)) {
         System.out.print("Enter your guess: ");
         String answer = scanner.nextString();
         attempts++;

            
             System.out.println();
            System.out.println("CORRECT!");
            System.out.println("The word was: " + Canswer);
            System.out.println("Category: " + categories[category]);
            System.out.println("Attempts: " + attempts);
            System.out.println();
            System.out.println("Thanks for playing!");

            break;

            } else {

            System.out.println();
            System.out.println("Wrong guess!");

             if (attempts == 1) {
                    System.out.println("Think about the hint carefully.");
             } else if (attempts == 2) {
                    System.out.println("You're getting closer!");
             } else {
                    System.out.println("Keep trying!");
             }

            System.out.println();
            }
        }

    

    }
