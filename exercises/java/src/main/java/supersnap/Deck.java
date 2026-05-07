package supersnap;

import supersnap.cards.AnimalCard;
import supersnap.cards.playingCard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//super class for a deck. contains functions youd expect frrom the deck
public class Deck {
    //A deck is a list of cards
    final List<Card> cards = new ArrayList<>();


    //Can either pass a deck, or a card to the fuction.
    public void addToDeck(Card card) {
        cards.add(card);
    }
    public void addToDeck(List<Card> deck) {
        cards.addAll(deck);
    }

    public List<Card> playingCardDeck(){

        List<Card> cards = new ArrayList<>();
        for(String suite : playingCard.SUITES)
        {
            for(String rank : playingCard.VALUES)
            {
                cards.add(new playingCard(suite, rank));
            }
        }
        return cards;
    }

    public List<Card> animalCardDeck(){

        List<Card> cards = new ArrayList<>();
        for(Animal a : Animal.values())
        {
            cards.add(new AnimalCard(a));
        }
        return cards;
    }

    public void shuffleCards(){
        Collections.shuffle(cards);
    }

    public String[] getCards() {
        String[] result = new String[cards.size()];
        for (int i = 0; i < cards.size(); i++) {
            Card card = cards.get(i);
            result[i] = card.toString();
        }
        return result;
    }

    public Card deal() {
        return cards.removeFirst();
    }


    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + cards +
                '}';
    }


}
