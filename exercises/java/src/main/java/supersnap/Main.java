package supersnap;

import supersnap.cards.AnimalCard;
import supersnap.cards.playingCard;
import supersnap.cards.superSnap;

public class Main {

    static void main() {

        Deck deck = new Deck();
        //Create a new playing card deck and add it to our deck
        deck.addToDeck(deck.playingCardDeck());
        //Create an animal card deck and add it to our deck
        deck.addToDeck(deck.animalCardDeck());

        //Shuffle the cards
        deck.shuffleCards();
        //out the deck
        System.out.println(deck);

        superSnap snap = new superSnap(deck);
        snap.play();

    }


}
