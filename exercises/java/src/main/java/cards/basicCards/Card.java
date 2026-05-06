package cards.basicCards;

public class Card {

    public String faceValue;
    public String suit;


    public static final String[] SUITS = {"clubs", "diamonds","hearts", "spades"};
    public static final String[] FACE_VALUES = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};



    public Card(String faceValue, String suit) {
        this.faceValue = faceValue;
        this.suit = suit;
    }

    public String toString(){
        return faceValue + " of " + suit;
    }
}
