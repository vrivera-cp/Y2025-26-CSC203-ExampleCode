package Module02;

public class Card {
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;
    public static final int ACE = 14;

    private String suit;
    private int value;

    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    private String getValueString() {
        switch (value) {
            case JACK:
                return "Jack";
            case QUEEN:
                return "Queen";
            case KING:
                return "King";
            case ACE:
                return "Ace";
            default:
                return Integer.toString(value);
        }
    }

    @Override
    public String toString() {
        return getValueString() + " of " + suit;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Card card) {
            return (suit == null ? card.suit == null : suit.equals(card.suit))
                    && value == card.value;
                    /* Or
                    return Objects.equal(suit, card.suit) && value == card.value;
                     */
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 1;

        hash = hash * 31 + (suit == null ? 0 : suit.hashCode());
        hash = hash * 31 + value;

        return hash;
    }
}
