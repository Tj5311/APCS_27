/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Random;
import java.util.Scanner;

class starter1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[][] words = {
            // Animals
            {"cat", "dog", "elephant", "tiger", "lion",
             "penguin", "dolphin", "giraffe", "rabbit", "monkey"},

            // Food
            {"pizza", "burger", "taco", "pasta", "sandwich",
             "pancake", "cookie", "chocolate", "popcorn", "cheese"},

            // Sports
            {"football", "basketball", "baseball", "soccer", "tennis",
             "hockey", "golf", "volleyball", "boxing", "swimming"},

            // Vehicles
            {"car", "truck", "motorcycle", "airplane", "helicopter",
             "submarine", "train", "bus", "boat", "bicycle"},

            // Technology
            {"computer", "phone", "keyboard", "mouse", "monitor",
             "internet", "robot", "tablet", "camera", "console"},

            // Places
            {"school", "hospital", "airport", "library", "museum",
             "stadium", "restaurant", "beach", "mountain", "castle"},

            // Nature
            {"tree", "flower", "forest", "river", "ocean",
             "volcano", "desert", "island", "rainbow", "thunder"},

            // Objects
            {"chair", "table", "pencil", "backpack", "clock",
             "mirror", "umbrella", "bottle", "window", "guitar"}
        };

        String[][] hints = {
            // Animals
            {
                "This animal is a common household pet that likes to chase mice.",
                "This animal is known as man's best friend and often lives with people.",
                "This animal is enormous and has a long trunk and large ears.",
                "This large striped cat is a powerful predator.",
                "This big cat is known for its mane and is often called the king of the jungle.",
                "This bird cannot fly and is famous for living in very cold places.",
                "This intelligent sea animal is known for jumping out of the water.",
                "This animal has an extremely long neck and eats leaves from tall trees.",
                "This small animal has long ears and is known for hopping.",
                "This animal is intelligent, lives in groups, and loves climbing trees."
            },

            // Food
            {
                "This food is round, usually has cheese and sauce, and is often cut into slices.",
                "This food usually has a bun around a cooked meat patty.",
                "This food is usually served in a folded or rolled tortilla with fillings inside.",
                "This Italian food is commonly made from noodles and can be served with many sauces.",
                "This food is made by putting ingredients between two pieces of bread.",
                "This breakfast food is flat, round, and often covered with syrup.",
                "This sweet baked treat is often small, round, and comes in many flavors.",
                "This sweet food melts when heated and is often made from cocoa.",
                "This snack is made from heated corn kernels that puff up.",
                "This dairy food is often yellow or white and can be melted."
            },

            // Sports
            {
                "This sport is played with an oval-shaped ball and involves running and tackling.",
                "This sport uses a hoop and a ball, and players try to score baskets.",
                "This sport uses a bat and ball and is played with bases.",
                "This sport is played by kicking a ball into a goal.",
                "This racket sport is played by hitting a ball over a net.",
                "This sport is played on ice using sticks and a small puck.",
                "This sport involves hitting a small ball into holes using clubs.",
                "This sport involves hitting a ball over a net without letting it touch the ground.",
                "This combat sport involves two people fighting with padded gloves.",
                "This sport involves moving through water using different strokes."
            },

            // Vehicles
            {
                "This common vehicle usually has four wheels and is used to travel on roads.",
                "This vehicle is larger than a car and is often used to carry heavy or large loads.",
                "This two-wheeled motor vehicle is commonly used for transportation.",
                "This large vehicle flies through the sky and carries passengers.",
                "This aircraft has spinning blades and can take off and land vertically.",
                "This vehicle travels underwater and is often used for exploration or military missions.",
                "This vehicle travels on tracks and can carry many passengers.",
                "This large road vehicle carries multiple passengers and usually follows a route.",
                "This vehicle travels across water and can be powered by an engine or sails.",
                "This two-wheeled vehicle is powered by pedals."
            },

            // Technology
            {
                "This electronic machine can run programs, browse the internet, and store files.",
                "This small device lets people make calls, send messages, and use apps.",
                "This device has many buttons and is commonly used to type on a computer.",
                "This small device is moved across a surface to control a pointer on a computer.",
                "This screen displays pictures and information from a computer.",
                "This worldwide system connects computers and devices so people can share information.",
                "This machine can be programmed to perform tasks automatically.",
                "This portable touchscreen device is larger than most phones but smaller than a laptop.",
                "This device captures photographs and videos.",
                "This electronic device is designed primarily for playing video games."
            },

            // Places
            {
                "This is a place where students go to learn and attend classes.",
                "This place has doctors and nurses who take care of sick or injured people.",
                "This place has runways and terminals where airplanes arrive and depart.",
                "This place contains books and provides a quiet place for reading and studying.",
                "This place displays objects, art, or information for people to learn about.",
                "This large venue hosts sporting events and can hold thousands of spectators.",
                "This place serves food and usually has tables where people eat.",
                "This place has sand and is located next to a body of water.",
                "This tall natural landform rises high above the surrounding area.",
                "This large historic building often has towers, thick walls, and a royal connection."
            },

            // Nature
            {
                "This plant has a trunk, branches, and leaves and can grow very tall.",
                "This colorful part of a plant often has petals and can produce a pleasant smell.",
                "This large area contains many trees and is home to many animals.",
                "This natural stream of flowing water can eventually reach a lake or ocean.",
                "This enormous body of salt water covers most of Earth's surface.",
                "This mountain can erupt and release lava, ash, and gases.",
                "This very dry region receives little rain and often has lots of sand.",
                "This piece of land is completely surrounded by water.",
                "This colorful arc can appear in the sky when sunlight passes through water droplets.",
                "This loud sound is produced during a storm and often follows lightning."
            },

            // Objects
            {
                "This piece of furniture has a seat and is used for sitting.",
                "This piece of furniture has a flat surface and is often used for eating or working.",
                "This writing tool usually has a graphite core inside a wooden body.",
                "This bag is commonly carried on someone's back and is used to hold school supplies or other items.",
                "This device tells you the current time.",
                "This object has a reflective surface that lets you see your own image.",
                "This object opens over your head to help keep you dry in the rain.",
                "This container is commonly used to hold liquids.",
                "This part of a building is usually made of glass and lets you see outside.",
                "This musical instrument has strings and is played by strumming or picking them."
            }
        };

        String[] categories = {
            "Animals",
            "Food",
            "Sports",
            "Vehicles",
            "Technology",
            "Places",
            "Nature",
            "Objects"
        };

        // Choose a random category
        int category = random.nextInt(categories.length);

        // Choose a random word from that category
        int word = random.nextInt(words[category].length);

        String secretWord = words[category][word];
        String hint = hints[category][word];

        int attempts = 0;

        System.out.println("=================================");
        System.out.println("        WORD GUESSING GAME");
        System.out.println("=================================");
        System.out.println();

        System.out.println("The computer has chosen a word! (SINGULAR form only... EX: pancake)");
        System.out.println();
        System.out.println("Category: " + categories[category]);
        System.out.println("Hint: " + hint);
        System.out.println();

        while (true) {

            System.out.print("Enter your guess: ");
            String guess = scanner.nextLine().trim();

            if (guess.isEmpty()) {
                System.out.println("Please enter a word.");
                continue;
            }

            attempts++;

            if (guess.equalsIgnoreCase(secretWord)) {

                System.out.println();
                System.out.println("CORRECT!");
                System.out.println("The word was: " + secretWord);
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

        scanner.close();
    }
}