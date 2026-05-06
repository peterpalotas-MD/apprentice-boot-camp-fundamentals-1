package cards;

import cards.basicCards.Deck;

import java.util.Arrays;

public class Cards {

    Deck deck = new Deck();




    public static void main(String[] args) {
        Cards cards = new Cards();
        System.out.println(Arrays.toString(cards.getCards()));
    }

    public String[] getCards() {
        this.deck.createUnshuffledDeck();
        return this.deck.returnDeck();
    }
}
