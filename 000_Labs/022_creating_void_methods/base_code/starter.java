/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
class starter {
public static void Sentence(String sentence1 , String sentence2){
System.out.println("this is using the methods");
System.out.println(sentence1);
System.out.println(sentence1 + " " + sentence2 );

}

	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("type a sentence");
		String sentence1 = sc.nextLine();

		System.out.println("type a sentence");
		String sentence2 = sc.nextLine();

		 Sentence(sentence1 , sentence2);


		
	}
}
