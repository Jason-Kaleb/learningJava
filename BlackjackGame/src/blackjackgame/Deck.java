package blackjackgame;

import java.util.ArrayList;
import java.util.Collections;

public class Deck
{
    private final ArrayList<Card> cards;
    
    public Deck()
    {
        cards = new ArrayList<>();
        
        for (Card.Suit suit : Card.Suit.values())
        {
            for (Card.Rank rank : Card.Rank.values())
            {
                cards.add(new Card(rank, suit));
            }
        }
    }
    
    public void shuffle()
    {
        Collections.shuffle(cards);
    }
    
    public Card drawCard()
    {
        if (cards.isEmpty())
        {
            throw new IllegalStateException("Deck is Empty");
        }
        return cards.remove(0);
    }
}
