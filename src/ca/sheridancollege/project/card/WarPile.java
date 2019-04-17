package ca.sheridancollege.project.card;

import java.util.ArrayList;

/**
 *
 * @author fernandofedele
 */
public class WarPile extends GroupOfCards {

    private ArrayList<WarCard> warPile;
    private int pileSize;
    
    public WarPile(int numPlayers, ArrayList<WarCard> warCards) {
        super(52 / numPlayers);
        this.pileSize = 52 / numPlayers;
        warPile = warCards;
    }
    
    public int getPileSize() {
        return pileSize;
    }
    
    public WarCard takeTopCard() {
        // takes the card at the first position, removes it from the pile 
        // and returns it. Will shift all other WarCards one index left
        return warPile.remove(0);
    }
    
    public void addCard(WarCard card) {
        // adds a card to the bottom of the pile
        warPile.add(card);
    }

}