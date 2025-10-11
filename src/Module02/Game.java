package Module02;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        // Input Object
        Scanner scanner = new Scanner(System.in);

        // Setup Game
        Deck d1 = Deck.buildStandardDeck();
        d1.shuffle();
        Deck d2 = d1.split();

        System.out.print("Player 1 Name: ");
        Player p1 = new Player(scanner.nextLine(), d1);

        System.out.print("Player 2 Name: ");
        Player p2 = new Player(scanner.nextLine(), d2);

        System.out.printf("Total Players: %d%n", Player.playerCount);

        // Game Loop
        System.out.println("Starting Game...");
        boolean finished = false;
        while (!finished) {
            // Print player information
            System.out.println(p1);
            System.out.println(p2);

            // Wait for user input
            System.out.print("Playing next round...");
            scanner.nextLine();

            // Play a round
            Card c1 = p1.playCard();
            Card c2 = p2.playCard();

            System.out.printf("%s plays the %s%n", p1.getName(), c1);
            System.out.printf("%s plays the %s%n", p2.getName(), c2);

            Player winner = null;
            if (c1.getValue() > c2.getValue()) {
                winner = p1;
            } else if (c1.getValue() < c2.getValue()) {
                winner = p2;
            }

            if (winner != null) {
                System.out.printf("%s won the round!%n", winner.getName());
            } else {
                System.out.println("Draw!");
            }

            // Check for game over
            winner = null;
            if (p1.hasCards() && !p2.hasCards()) {
                winner = p1;
            } else if (p2.hasCards() && !p1.hasCards()) {
                winner = p2;
            }

            if (winner != null) {
                System.out.printf("%s won the game!%n", winner.getName());
                break;
            }
        }
    }
}
