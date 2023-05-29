package exercise1;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022
 * @author Joshua Encinas Valador May 28, 2023
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            //card.setValue(insert call to random number generator here)
            card.setValue((int)(Math.random()*13)+1);
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
            card.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            hand[i] = card;
        }
        Card cardGuess = new Card();
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        System.out.println("Pick a card value 0-9, 10 for J, 11 for Q, 12 K, and 13 for A");
        cardGuess.setValue(input.nextInt());
        System.out.println("Pick a card suit 1 for Hearts, 2 for Diamonds, 3 for Spades, and 4 for Clubs");
        cardGuess.setSuit(Card.SUITS[(int)(input.nextInt()-1)]);
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
        for (int i = 0; i < hand.length; i++)
            if (cardGuess.getValue() == hand[i].getValue() && cardGuess.getSuit().matches(hand[i].getSuit()))
                printInfo();
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
        
        System.out.println("Im Done");
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Joshua Encinas Valador, but you can call me Joshua, Josh or Student 991710344");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- To learn more about Java and open up new career opportunities");
        System.out.println("-- Have a productive semester while maintaining a healthy work/life balance");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Watching sports and play games");
        System.out.println("-- Coding and learning new as much as I can about computer sciences");

        System.out.println("Im Done");
        
    
    }

}
