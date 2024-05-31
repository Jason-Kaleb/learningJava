package blackjackgame;

public class Card
{

    public enum Rank
    {
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(10),
        QUEEN(10),
        KING(10),
        ACE(1);

        private final int value;

        Rank(int value)
        {
            this.value = value;
        }

        public int getValue()
        {
            return value;
        }

        public boolean isFaceCard()
        {
            return this == JACK || this == QUEEN || this == KING;
        }
    }

    public enum Suit
    {
        HEARTS,
        DIAMONDS,
        CLUBS,
        SPADES
    }

    private final Rank rank;
    private final Suit suit;

    public Card(Rank rank, Suit suit)
    {
        this.rank = rank;
        this.suit = suit;
    }

     public Card()
    {
        this.rank = null;
        this.suit = null;
    }
    
    public Rank getRank()
    {
        return rank;
    }

    public Suit getSuit()
    {
        return suit;
    }

    public int getValue()
    {
        if (rank.isFaceCard())
        {
            return 10;
        } 
        else if (rank == Rank.ACE)
        {
            return 1; // Ace can be 1 or 11, this method only returns 1
        }
        else
        {
            return rank.getValue();
        }
    }

    @Override
    public String toString()
    {
        return rank.name() + " of " + suit.name();
    }
}
