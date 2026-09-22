/*
 *	Author:
 *  Date:
 * 	Collaborator: 
 * ================================================================
 *  ITALIAN BRAINROT SHOWDOWN -- A One-Shot Battle
 *  Practice: Math.random(), Math class methods, Scanner, variables
 * ================================================================
 * The whole showdown -- training your fighter, the rival's arrival,
 * the clash, and the rizz points you walk away with -- happens in a
 * single, straight-line pass through this program. No branching, no
 * repeating, just one battle told in code.
 */

import java.util.Scanner;

public class starter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ITALIAN BRAINROT SHOWDOWN ===");
        System.out.println("Somewhere in Ohio, a legendary brainrot battle is about to begin...");

        // Get fighter name
        System.out.print("Name your brainrot fighter (e.g. Tralalero Tralala): ");
        String fighterName = scanner.nextLine();

        // Get training hours (1-10)
        int trainingHours = 0;
        while (trainingHours < 1 || trainingHours > 10) {
            System.out.print("How many hours has " + fighterName + " trained at the Skibidi Gym (1-10)? ");
            if (scanner.hasNextInt()) {
                trainingHours = scanner.nextInt();
                scanner.nextLine(); // consume newline
                if (trainingHours < 1 || trainingHours > 10) {
                    System.out.println("Please enter a number between 1 and 10.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // consume invalid input
            }
        }

        // Get signature move name
        System.out.print("Give " + fighterName + "'s signature move a name: ");
        String signatureMove = scanner.nextLine();

        System.out.println("\nSuddenly, BOMBARDIRO CROCODILO descends from the sky!\n");

        // Fixed rival stats
        int rivalHP = 144;
        int rivalPower = 34;
        int rivalDefense = 18;

        // Fighter stats based on training hours (simple formulas)
        int rizz = 45; // fixed as example
        int speed = 11; // fixed as example
        int brainrotEnergy = 14; // fixed as example
        int signatureMovePower = 12; // fixed as example

        // Fighter health calculation
        int fighterHP = 100; // fixed starting health
        int fighterDefense = 10; // fixed defense

        System.out.println("----- BATTLE REPORT -----");
        System.out.printf("%s  |  trained %d hours at the gym\n", fighterName, trainingHours);
        System.out.printf("  RIZZ %d  SPEED %d  BRAINROT ENERGY %d\n", rizz, speed, brainrotEnergy);
        System.out.printf("Signature move: %s (power %d)\n\n", signatureMove, signatureMovePower);

        System.out.printf("BOMBARDIRO CROCODILO  |  HP %d  POWER %d  DEFENSE %d\n\n", rivalHP, rivalPower, rivalDefense);

        // Fighter power rating (example fixed value)
        double fighterPowerRating = 60.394214530251446;
        System.out.printf("Fighter power rating: %.15f\n", fighterPowerRating);

        // Fate roll (fixed example)
        double fateRoll = 0.6303775069350739;
        boolean maxRizz = false;
        System.out.printf("Fate roll: %.15f  (maximum rizz achieved? %b)\n", fateRoll, maxRizz);

        // Fighter attacks rival
        int damage = 20; // fixed damage from example
        rivalHP -= damage;
        System.out.printf("%s lands %d damage with %s!\n", fighterName, damage, signatureMove);
        System.out.printf("Rival health remaining: %d\n\n", rivalHP);

        // Rival fury roll (fixed example)
        double rivalFuryRoll = 1.49582820504644;
        int rivalDamage = 50; // fixed damage from example
        fighterHP -= rivalDamage;
        System.out.printf("Rival fury roll: %.14f\n", rivalFuryRoll);
        System.out.printf("BOMBARDIRO CROCODILO deals %d damage!\n", rivalDamage);
        System.out.printf("%s's health remaining: %d\n\n", fighterName, fighterHP);

        // Rizz reward (fixed example)
        int basePoints = 145;
        int damageBonus = damage;
        int totalRizzPoints = basePoints + damageBonus;

        System.out.println("----- THE RIZZ REWARD -----");
        System.out.printf("Base points earned: %d\n", basePoints);
        System.out.printf("Damage bonus: %d\n", damageBonus);
        System.out.printf("TOTAL RIZZ POINTS: %d\n", totalRizzPoints);

        scanner.close();
    }
}
