package cards;

public interface Card {

    Animal getAnimal();
    public boolean snap(Card otherCard );
    String getFaceValue();
}
