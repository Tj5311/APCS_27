/*
 *	Author:
 *  Date:
 * 	Collaborator:
 */

import java.util.*;


public class starter {
    public static void main(String[] args) {
        System.out.println("WELCOME TO THE ULTIMATE GUESSING GAME MR. POOLE!");
        Scanner input = new Scanner(System.in);
        int randomNum = (int)(Math.random() * 99) + 1;
        System.out.print("guess a number between 1 and 100: ");
        int numGuess = input.nextInt();
        System.out.println("You guessed: " + numGuess);
        if (numGuess != randomNum) {
            System.out.println("Sorry, that's not the right number.");
        }else {
            System.out.println("Congratulations! You guessed correctly.");
        }
        System.out.println("the number was: " + randomNum);

        System.out.println("   ");
        System.out.println("Pick a number between 1 and 5:");
        int categoryChoice = input.nextInt();
        System.out.println("   ");
        System.out.println("next is to guess what thing or object i am thinking of!!!");
          System.out.println("You will be provided with a hint and category");
        String hint1 = "it has 4 legs and is called a mans best friend";
        String hint2 = "it is a round red fruit with a tech company named after it.";
        String hint3 = "it is an american muscle car that starts with the letter 'C'.";
        String hint4 = "it is a color that is often associated with the sky.";
        String hint5 = "it is a country that has a currency called looney toonies.";
        String category1 = "animals";
        String category2 = "fruits";
        String category3 = "vehicles";
        String category4 = "colors";
        String category5 = "countries";
        if (categoryChoice == 1) {
            System.out.println("Hint: " + hint1);
            System.out.println("Category: " + category1);
        }
        if (categoryChoice == 2) {
            System.out.println("Hint: " + hint2);
            System.out.println("Category: " + category2);
        }
        if (categoryChoice == 3) {
            System.out.println("Hint: " + hint3);
            System.out.println("Category: " + category3);
        }
        if (categoryChoice == 4) {
            System.out.println("Hint: " + hint4);
            System.out.println("Category: " + category4);
        }
        if (categoryChoice == 5) {
            System.out.println("Hint: " + hint5);
            System.out.println("Category: " + category5);
        }
        String canswer1 = "dog";
        String canswer2 = "apple";
        String canswer3 = "camaro";
        String canswer4 = "blue";
        String canswer5 = "canada";
        String userAnswer = input.next();
        if (userAnswer.equalsIgnoreCase(canswer1) || userAnswer.equalsIgnoreCase(canswer2) || userAnswer.equalsIgnoreCase(canswer3) || userAnswer.equalsIgnoreCase(canswer4) || userAnswer.equalsIgnoreCase(canswer5)) {
            System.out.println("Congratulations! You guessed correctly.");
        } else {
            System.out.println("Sorry, that's not the right answer.");
        }
        System.out.println("  ");
        System.out.println("MEME GUESSER");
        System.out.println("THERE IS HINTS THAT WILL HELP YOU GUESS THE MEME!");
        System.out.println(" GIVE A NUMBER BETWEEN 1 AND 10: ");
        int memeGuess = input.nextInt();
        String meme1 = "tung tung tung sahur";
        String meme2 = "italian brainrot";
        String meme3 = "nathan";
        String meme4 = "tiki tiki phonk";
        String meme5 = "21";
        String meme6 = "67";
        String meme7 = "tung tung god";
        String meme8 = "funkey ehh";
        String meme9 = "why you bulleh meh";
        String meme10 = "AI Rot";
       
        if (memeGuess == 1) {
            System.out.println("Hint: a popular meme from ai that is made of wood and is a part of italian brainrot");
        } else if (memeGuess == 2) {
            System.out.println("Hint: a type of meme involving ai images with italian names");
        }else if (memeGuess == 3) {
            System.out.println("Hint: a kid says that a person is playing on controller with 1 billion trillion aim assist and then i cant do ____ ");
        }else if (memeGuess == 4) {
            System.out.println("Hint: a verity of EDM music usually clipped short music");
        }else if (memeGuess == 5) {
            System.out.println("Hint: originated in 2010s with a dad asking his son whats 9+10");
        }else if (memeGuess == 6) {
            System.out.println("Hint: a number before 68");
        }else if (memeGuess == 7) {
            System.out.println("Hint: while in a game with proximity chat someone says something about the bible and jesus");
        }else if (memeGuess == 8) {
            System.out.println("Hint: i think Oliver Tree made that song");
        }else if (memeGuess == 9) {
            System.out.println("Hint: became super popular around 2016 and had to do with bullying");
        }else if (memeGuess == 10) {
            System.out.println("Hint: typically AI videos or photos");
        }
        System.out.println(" what is your guess? ");
        String userGuess = input.next();
        if (userGuess.equalsIgnoreCase(memeGuess == 1 ? meme1 : memeGuess == 2 ? meme2 : memeGuess == 3 ? meme3 : memeGuess == 4 ? meme4 : memeGuess == 5 ? meme5 : memeGuess == 6 ? meme6 : memeGuess == 7 ? meme7 : memeGuess == 8 ? meme8 : memeGuess == 9 ? meme9 : meme10)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!");
        }
      System.out.println("The correct answer was: " + (memeGuess == 1 ? meme1 : memeGuess == 2 ? meme2 : memeGuess == 3 ? meme3 : memeGuess == 4 ? meme4 : memeGuess == 5 ? meme5 : memeGuess == 6 ? meme6 : memeGuess == 7 ? meme7 : memeGuess == 8 ? meme8 : memeGuess == 9 ? meme9 : meme10));   
        System.out.println("Thanks for playing!");

    }
}
