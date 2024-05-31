package blackjackgame;

import java.util.ArrayList;
import java.util.Collections;

public class Hand
{
    private final ArrayList<Card> cards;
    
    public Hand()
    {
        cards = new ArrayList<>();
    }
    
    public void addCard(Card card)
    {
        cards.add(card);
    }
    
    public int getTotalValue()
    {
        int total = 0;
        int aces = 0;
        
        for (Card card : cards)
        {
            total += card.getValue();
            
            if (card.getRank() == Card.Rank.ACE)
            {
                aces++;
            }
        }
        
        while (total < 12 && aces > 0)
        {
            total += 10;
            aces--;
        }
        
        return total;
    }
    
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        
        for (Card card : cards)
        {
            builder.append(card.toString()).append(", ");
        }
        
        return builder.toString().trim().substring(0, builder.length() - 2);
    }
}
