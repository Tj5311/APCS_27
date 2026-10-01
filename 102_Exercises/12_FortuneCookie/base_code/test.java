import java.util.Scanner;

public class test {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number (x): ");
    int x = scanner.nextInt();
    System.out.print("Enter another number: ");
    int Num1 = scanner.nextInt(); // Example value, replace with actual input

    if (x > Num1) {
        System.out.println("x is greater than " + Num1);
    } else if (x < Num1) {
        System.out.println("x is less than " + Num1);
    } else {
        System.out.println("x is equal to " + Num1);
    }
}

}