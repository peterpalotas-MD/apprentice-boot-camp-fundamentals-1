package cards.basicCards;

import cards.Animal;
import cards.AnimalCard;

import java.util.ArrayList;
import java.util.List;
import static cards.basicCards.playingCard.SUITS;
import static cards.basicCards.playingCard.FACE_VALUES;

public class cardDeck implements cards.Deck {

    public List<playingCard> deck = new ArrayList<>();

    public void addCard(playingCard playingCard){
        this.deck.add(playingCard);
    }

    public void createUnshuffledDeck(){
        for(String suit : SUITS){
            for(String faceValue : FACE_VALUES){
                playingCard playingCard = new playingCard(faceValue, suit);
                this.deck.add(playingCard);
            }
        }
    }

    public String[] returnDeck(){

        String[] outDeck = new String[this.deck.size()];
        for(int cardNumber = 0; cardNumber < this.deck.size(); cardNumber++){
            String cardString = this.deck.get(cardNumber).toString();
            outDeck[cardNumber] = cardString;
        }

        return outDeck;
    }

    public void shuffle(){

    }
    public String[] getCards(){
        return new String[] {};
    }

    public cards.Card deal(){
        return new AnimalCard(Animal.AARDVARK);
    }
}
