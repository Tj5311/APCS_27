/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

public class starter {

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to the Fortune Cookie Generator!");
    System.out.println();
    System.out.print("Password: ");

    String password = scanner.nextLine();

    String[] goodFortunes = {
        "Big rizz energy is heading your way.",
        "No cap, your hard work is about to pay off.",
        "Main character energy: unlocked today.",
        "Touch grass — the answer you seek is outside.",
        "Your vibe today: certified immaculate.",
        "Stay delulu — it's the solulu, bestie.",
        "Plot twist incoming: it works out.",
        "You ate that, and left zero crumbs.",
        "Low-key, this is your glow-up era.",
        "High-key, the whole squad is rooting for you.",
        "Sigma grindset detected — keep going.",
        "Your aura points are through the roof today.",
        "Skibidi luck says: proceed with confidence.",
        "It's giving \"everything is about to click.\"",
        "You understood the assignment, fr fr.",
        "Chat, this is a certified W.",
        "Bet on yourself — the odds are in your favor.",
        "NPCs doubt you; main characters don't.",
        "Your era of good luck has officially begun.",
        "Slay now, overthink later.",
        "This fortune hits different — read it twice.",
        "Lowkey, you're built different.",
        "You're about to be rent-free in someone's mind.",
        "Certified banger of a day ahead.",
        "Vibe check: you passed with flying colors.",
        "Bestie, the glow-up is closer than you think.",
        "Your side quest today becomes the main quest.",
        "Not the ick — it's actually the glow.",
        "Say less: good things are loading.",
        "Your grindset today: unmatched.",
        "It's a \"W\" kind of week for you.",
        "Let them cook — you're about to.",
        "You're the moment, not the mid.",
        "Big sigma silence, bigger sigma results.",
        "Canon event: today you level up.",
        "The algorithm is rooting for you today.",
        "You're speedrunning your way to a win.",
        "Your rizzler arc starts now.",
        "Understood the assignment — now go execute.",
        "Today's forecast: 100% chance of iconic.",
        "You're unbothered, moisturized, and thriving.",
        "This is your villain-to-hero arc moment.",
        "Core memory unlocked: today's a good one.",
        "No ratio incoming — today you're the main event.",
        "Ohio moments end, rizz moments begin.",
        "Ate. No thoughts. Just wins.",
        "You're not lucky, you're built for this.",
        "Ngl, today's energy is immaculate.",
        "Ur npc arc is over — main character loading.",
        "Go touch some grass, then come back and win big."
    };

    String[] otherFortunes = {
        "A good idea will find you when you least expect it.",
        "Your creativity will open a door today.",
        "Patience will turn a small win into a big one.",
        "A surprise is on its way — keep your eyes open.",
        "The next step you take will be the right one.",
        "Someone will thank you for your kindness this week.",
        "A challenge today becomes a story worth telling tomorrow.",
        "Your curiosity will lead you somewhere great.",
        "Good things come to those who debug patiently.",
        "A fresh perspective will solve an old problem.",
        "Your effort today plants a seed for tomorrow.",
        "An unexpected friend will bring good news.",
        "Trust the process — it's working in your favor.",
        "Your next idea will be your best one yet.",
        "A small risk today leads to a big reward.",
        "The answer you need is closer than you think.",
        "Your hard work will not go unnoticed.",
        "A bit of laughter will brighten your whole day.",
        "Someone believes in you more than you know.",
        "Your persistence will pay off sooner than expected.",
        "A new skill will come easily to you soon.",
        "Good luck is heading your way — don't blink.",
        "The best is yet to come.",
        "Your kindness today returns to you tomorrow.",
        "A clever solution is closer than it seems.",
        "Today is a great day to try something new.",
        "Your determination will impress someone important.",
        "A pleasant surprise awaits you this week.",
        "Your positive energy is contagious — share it.",
        "Great things start with small steps.",
        "Your instincts are worth trusting today.",
        "A little courage today leads to a big win.",
        "Success is closer than you realize.",
        "Your smile will make someone's day better.",
        "An exciting opportunity is on the horizon.",
        "Your hard work today builds tomorrow's success.",
        "Good news travels fast — expect some soon.",
        "The path ahead is brighter than it looks.",
        "Your ideas are more valuable than you think.",
        "A helping hand will come when you need it.",
        "Today's effort becomes tomorrow's achievement.",
        "Your patience will be rewarded generously.",
        "A new friendship will bring you joy soon.",
        "Keep going — you're closer than you think.",
        "Your talents will shine when you least expect it.",
        "A great opportunity is about to knock.",
        "Your optimism will open unexpected doors.",
        "Something wonderful is about to happen.",
        "Your best work is still ahead of you.",
        "Good fortune favors the curious mind."
    };

    int random = (int) (Math.random() * goodFortunes.length);

    System.out.println();

    if (password.equals("Good Morning")) {
        System.out.println("Welcome in.");
        System.out.println();
        System.out.println("Your fortune:");
        System.out.println(goodFortunes[random]);
    } else {
        System.out.println("Incorrect password.");
        System.out.println();
        System.out.println("But here's a fortune anyway:");
        System.out.println(otherFortunes[random]);
    }

    scanner.close();
}


}