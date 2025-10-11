package Module02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards = new ArrayList<>();

    // Factory Method
    public static Deck buildStandardDeck() {
        Deck deck = new Deck();

        for (String suit : List.of("♣️s", "♦️s", "♥️s", "♠️s")) {
            for (int value = 2; value <= Card.ACE; value++) {
                deck.cards.add(new Card(suit, value));
            }
        }

        return deck;
    }

    public Deck split() {
        Deck other = new Deck();

        int halvedSize = cards.size() / 2;
        while (other.cards.size() < halvedSize) {
            other.cards.add(cards.remove(0));
        }

        return other;
    }

    public void shuffle() {
        Collections.shuffle(cards);
        /* Or this, if you want to cheat!
        cards.sort(Comparator.comparingInt(Card::getValue));
        */
    }

    public Card draw() {
        return (cards.size() > 0 ? cards.remove(0) : null);
    }

    public int getSize() {
        return cards.size();
    }
}
