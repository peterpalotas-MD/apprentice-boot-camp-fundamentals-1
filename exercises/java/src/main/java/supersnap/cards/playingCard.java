package supersnap.cards;

import supersnap.Card;

public class playingCard extends Card {

    public static final String[] SUITES = {"Hearts", "Diamonds", "Clubs", "Spades"};
    public static final String[] VALUES = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    public String cardValue;
    public String cardSuite;

    public playingCard(String suite, String value) {
        super(String.format("%s of %s", value, suite));
        this.cardValue = value;
        this.cardSuite = suite;
    }
}
