package Module02;

public class Player {
    public static int playerCount = 0;

    private String name;
    private Deck deck;
    private int wins; // Defaults to 0

    public Player(String name, Deck deck) {
        this.name = name;
        this.deck = deck;
        playerCount++;
    }

    public boolean hasCards() {
        return deck.getSize() > 0;
    }

    public Card playCard() {
        return deck.draw();
    }

    public String getName() {
        return name;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getWins() {
        return wins;
    }

    @Override
    public String toString() {
        return String.format("%s (%02d Cards)", name, deck.getSize());
    }
}