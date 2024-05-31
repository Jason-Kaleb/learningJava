package blackjackgame;

import java.util.Scanner;

public class BlackjackGame
{
    private final Deck deck;
    private final Hand playerHand;
    private final Hand dealerHand;
    private final Scanner scanner;

    public static void main(String[] args)
    {
        BlackjackGame game = new BlackjackGame();
        game.play();
    }

    public void play()
    {
        deck.shuffle();
        dealInitialCards();

        while (true)
        {
            System.out.println("Your hand: " + playerHand);
            System.out.println("Dealer's cards: " + dealerHand);

            String action = getPlayerAction();

            if (action.equalsIgnoreCase("hit"))
            {
                playerHand.addCard(deck.drawCard());

                if (playerHand.getTotalValue() > 21)
                {
                    System.out.println("Your hand: " + playerHand);
                    System.out.println("Dealer's card: " + dealerHand);
                    System.out.println("You bust!");
                    break;
                }
            }
            else
            {
                dealDealerCards();
                
                System.out.println("Dealer's hand: " + dealerHand);

                int playerTotal = playerHand.getTotalValue();
                int dealerTotal = dealerHand.getTotalValue();

                if (playerTotal > 21)
                {
                    System.out.println("You lose!");
                }
                else if (dealerTotal > 21)
                {
                    System.out.println("Dealer busts! You win!");
                }
                else if (playerTotal > dealerTotal)
                {
                    System.out.println("You win!");
                }
                else
                {
                    System.out.println("You lose!");
                }
                
                break;
            }
        }
    }
    
    public BlackjackGame()
    {
        deck = new Deck();
        playerHand = new Hand();
        dealerHand = new Hand();
        scanner = new Scanner(System.in);
    }
    
    private void dealInitialCards()
    {
        playerHand.addCard(deck.drawCard());
        playerHand.addCard(deck.drawCard());
        dealerHand.addCard(deck.drawCard());
        dealerHand.addCard(deck.drawCard());
    }

    private void dealDealerCards()
    {
        while (dealerHand.getTotalValue() < 17)
        {
            dealerHand.addCard(deck.drawCard());
        }
    }

    private String getPlayerAction()
    {
        System.out.print("Hit or Stand? ");
        return scanner.nextLine();
    }
}
