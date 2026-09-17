import java.util.Scanner;

public class starter {
    public static final void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- WELCOME & INITIAL SETUP ---
        System.out.println("=================================================");
        System.out.println("=========== WELCOME RESTAURANT OWNER! ===========");
        System.out.println("=================================================");
        
        System.out.print("What's the name of your restaurant? ");
        String restaurantName = scanner.nextLine();
        
        System.out.print("What's your name? ");
        String ownerName = scanner.nextLine();
        
        System.out.println("\nGreat to see you, " + ownerName + "!");
        System.out.println("Let's set up a menu for " + restaurantName + "!");
        System.out.println("Tonight's menu has room for exactly 3 items. Let's go!");

        // --- ITEM VARIABLES ---
        String item1, item2, item3;
        double price1, price2, price3;
        int qty1, qty2, qty3;

        // --- ITEM #1 ---
        System.out.println("\n--- Item #1 ---");
        System.out.print("Item name: ");
        item1 = scanner.nextLine();
        System.out.print("Price of " + item1 + " ($): ");
        price1 = scanner.nextDouble();
        System.out.print("How many would you like? ");
        qty1 = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer
        System.out.printf("Added %dx %s to your order! ($%.1f)%n", qty1, item1, (price1 * qty1));

        // --- ITEM #2 ---
        System.out.println("\n--- Item #2 ---");
        System.out.print("Item name: ");
        item2 = scanner.nextLine();
        System.out.print("Price of " + item2 + " ($): ");
        price2 = scanner.nextDouble();
        System.out.print("How many would you like? ");
        qty2 = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer
        System.out.printf("Added %dx %s to your order! ($%.1f)%n", qty2, item2, (price2 * qty2));

        // --- ITEM #3 ---
        System.out.println("\n--- Item #3 ---");
        System.out.print("Item name: ");
        item3 = scanner.nextLine();
        System.out.print("Price of " + item3 + " ($): ");
        price3 = scanner.nextDouble();
        System.out.print("How many would you like? ");
        qty3 = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer
        System.out.printf("Added %dx %s to your order! ($%.1f)%n", qty3, item3, (price3 * qty3));

        // --- TIP ---
        System.out.println("\nNice choices!");
        System.out.print("What tip percentage would you like to leave? (ex: 15, 18, 20): ");
        double tipPercent = scanner.nextDouble();

        // --- CALCULATIONS ---
        double subtotal = (price1 * qty1) + (price2 * qty2) + (price3 * qty3);
        double tax = subtotal * 0.0975;
        double tipAmount = subtotal * (tipPercent / 100.0);
        double total = subtotal + tax + tipAmount;

        // --- RECEIPT OUTPUT ---
        System.out.println("\n=================================================");
        System.out.println("- Menu For Today - " + restaurantName);
        System.out.println("=================================================");
        System.out.println("Owner: " + ownerName);
        System.out.println("-------------------------------------------------");
        System.out.printf("%-20s %-5s %-10s%n", "Item", "Qty", "Price");
        System.out.println("-------------------------------------------------");
        System.out.printf("%-20s %-5d $%.1f%n", item1, qty1, (price1 * qty1));
        System.out.printf("%-20s %-5d $%.1f%n", item2, qty2, (price2 * qty2));
        System.out.printf("%-20s %-5d $%.1f%n", item3, qty3, (price3 * qty3));
        System.out.println("-------------------------------------------------");
        System.out.printf("Subtotal: %.1f%n", subtotal);
        System.out.printf("Tax (9.75%%): %.4f%n", tax);
        System.out.printf("Tip: %.1f%%%n", tipPercent);
        System.out.printf("Tip Amount: %.2f%n", tipAmount);
        System.out.println("=================================================");
        System.out.printf("TOTAL: $%.4f%n", total);
        System.out.println("=================================================");
        System.out.println("Thanks for eating at " + restaurantName + "!");
        System.out.println("Come back soon -- we'll always have a byte for you!");
        
        scanner.close();
    }
}
