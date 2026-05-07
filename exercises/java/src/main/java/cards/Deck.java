package cards;

public interface Deck {

    public void shuffle();
    public String[] getCards();
    public Card deal();
}
