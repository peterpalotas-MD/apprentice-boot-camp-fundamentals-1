package supersnap;


//this will be my super class that both types of cards will inherit
public class Card {


    //either "ace of spades" or "COW" are acceptable values
    final String cardValue;

    //Call constructor with card value
    public Card(String cardValue) {
        this.cardValue = cardValue;
    }
    @Override
    public String toString() {
        return cardValue;
    }

    public String getValue(){
        return cardValue;
    }

    public boolean snap(Card otherCard ){
        return otherCard != null && this.cardValue.equals(otherCard.getValue());
    }
}
