package cards.basicCards;

import cards.Animal;
import cards.Card;

public class playingCard implements Card {

    public String faceValue;
    public String suit;

    public Animal getAnimal(){return Animal.BABOON;}
    @Override
    public boolean snap(Card otherCard ){
        return otherCard != null && this.faceValue.equals(otherCard.getFaceValue());
    }

    public String getFaceValue(){
        return faceValue;
    }
    public static final String[] SUITS = {"clubs", "diamonds","hearts", "spades"};
    public static final String[] FACE_VALUES = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};



    public playingCard(String faceValue, String suit) {
        this.faceValue = faceValue;
        this.suit = suit;
    }

    public String toString(){
        return faceValue + " of " + suit;
    }
}
