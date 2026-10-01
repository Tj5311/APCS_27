/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;
class starter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        checkNumber(num1);
        System.out.println();
        checkNumber(num2);

        scanner.close();
    }

    public static void checkNumber(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is divisible by 2!");
        }

        if (num % 3 != 0 && num % 4 != 0 && num % 5 != 0) {
            System.out.println(num + " is not divisible by 3, 4, or 5!");
        } else {
            if (num % 3 == 0) {
                System.out.println(num + " is divisible by 3!");
            }
            if (num % 4 == 0) {
                System.out.println(num + " is divisible by 4!");
            }
            if (num % 5 == 0) {
                System.out.println(num + " is divisible by 5!");
            }
        }
    }
}
