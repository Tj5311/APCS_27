/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		String name;
		int age;
		int month;
		int day;
		int year;
		double total;

		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("what is your name?");
		name = sc.nextLine();
		System.out.println("how old are you?");
		age = sc.nextInt();
		System.out.println("what month were you born? (1-12)");
		month = sc.nextInt();
		System.out.println("what day were you born?");
		day = sc.nextInt();
		System.out.println("what year were you born?");
		year = sc.nextInt();
		System.out.println("if i have a dollar and two quarters, how much money do i have?");
		total = sc.nextDouble();
		System.out.println("your name is " + name + " you were born on " + month + "/" + day + "/" + year );
		System.out.println("you are " + age + " years old!!!");
		System.out.println("you have " + total + " dollars!!!");

	}
}
