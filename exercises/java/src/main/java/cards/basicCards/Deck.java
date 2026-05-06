package cards.basicCards;

import java.util.ArrayList;
import java.util.List;
import static cards.basicCards.Card.SUITS;
import static cards.basicCards.Card.FACE_VALUES;

public class Deck {

    public List<Card> deck = new ArrayList<>();

    public void addCard(Card card){
        this.deck.add(card);
    }

    public void createUnshuffledDeck(){
        for(String suit : SUITS){
            for(String faceValue : FACE_VALUES){
                Card card = new Card(faceValue, suit);
                this.deck.add(card);
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
}
