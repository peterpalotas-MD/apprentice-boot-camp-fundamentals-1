package cards;

import cards.basicCards.cardDeck;

import java.util.Arrays;

public class Cards {

    cardDeck cardDeck = new cardDeck();




    public static void main(String[] args) {
        Cards cards = new Cards();
        System.out.println(Arrays.toString(cards.getCards()));
    }

    public String[] getCards() {
        this.cardDeck.createUnshuffledDeck();
        return this.cardDeck.returnDeck();
    }
}
