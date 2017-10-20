//Question 1,2,3,5,6,8 was answered with the code bellow


// 4. In main use shuffle and deal to generate and print four PokerHands with five cards each. Did you get anything
// good?
//
// Answer:
// Jack of Diamonds, 4 of Clubs, Queen of Hearts, Queen of Clubs, 9 of Hearts
// Queen of Hearts, 4 of Clubs, 10 of Diamonds, King of Clubs, 3 of Spades
// Queen of Spades, 2 of Clubs, 6 of Clubs, Ace of Spades, King of Hearts
// 2 of Hearts, 6 of Spades, 7 of Hearts, 2 of Clubs, 9 of Diamonds
// This is nothing special
//
//
// 7. Write a loop that generates a few thousand hands and checks whether
// they contain a flush or three of a kind. Estimate the probability of
// getting one of those hands. Compare your results to the probabilities
// at http://en.wikipedia.org/wiki/List_of_poker_hands.
//
// Answer:
// The number of flushes is: 198
// The number of three of a kinds is: 2236
// The probability of a flush is: 0.198%
// The probability of a three of a kind is: 2.236%
//
//
// 9. In some poker games, players get seven cards each, and they form a
// hand with the best five of the seven. Modify your program to generate
// seven-card hands and recompute the probabilities.
//
// Answer:
// The number of flushes is: 251
// The number of three of a kinds is: 7520
// The probability of a flush is: 0.251%
// The probability of a three of a kind is: 7.5200000000000005%




import java.util.Arrays;

public class PokerHand extends Deck {
 
    public Card[] hand = new Card[7];


    public PokerHand() {}


    public static void main(String args[]) {
   
        System.out.println("Question 4");
        PokerHand[] hands = new PokerHand[4];

        for (int i = 0; i < hands.length; i++) {
            // initializing hand
            hands[i] = new PokerHand();
            hands[i].shuffle();
            for (int j = 0; j < hands[i].hand.length; j++) {
                hands[i].hand[j] = hands[i].deal().hand[j];
            }

            // printing the hand
            System.out.println(hands[i]);
        }
        System.out.println();


        System.out.println("Question 7");
        PokerHand[] newHands = new PokerHand[100000];
        int flushes = 0;
        int threeKinds = 0;

        for (int i = 0; i < newHands.length; i++) {
            // initializing hand
            newHands[i] = new PokerHand();
            newHands[i].shuffle();
            for (int j = 0; j < newHands[i].hand.length; j++) {
                newHands[i].hand[j] = newHands[i].deal().hand[j];
            }

            // calculating three of a kinds and flushes
            if (newHands[i].hasFlush()) flushes++;
            if (newHands[i].hasThreeKind()) threeKinds++;
        }

        System.out.println("The number of flushes is: " + flushes);
        System.out.println("The number of three of a kinds is: " + threeKinds);
        System.out.println("The probability of a flush is: " + (((double)flushes / (double)newHands.length) * 100) + "%");
        System.out.println("The probability of a three of a kind is: " + (((double)threeKinds / (double)newHands.length) * 100) + "%");
    }

    private void shuffle() {
		// TODO Auto-generated method stub
		
	}


	
    //prints all the cards
    public String toString() {
        String retval = "";

        for (int i = 0; i < hand.length; i++) {
            retval += hand[i].toString();
            if (i != hand.length - 1) retval += ", ";
        }

        return retval;
    }

//this take the top five cards
    public PokerHand deal() {
        PokerHand pokerHand = new PokerHand();

        for (int i = 0; i < hand.length; i++) {
            pokerHand.hand[i] = cards[i];
        }

        return pokerHand;
    }

  
     // This checks whether the cards form a straight
    public boolean hasStraight() {
        // moves the ranks of the cards to an array
        int[] ranks = new int[hand.length];
        for (int i = 0; i < ranks.length; i++) {
            ranks[i] = hand[i].rank;
        }

        // sorts the array
        Arrays.sort(ranks);

        // the number of cards in order
        int numInOrder = 0;
        for (int i = 0; i < ranks.length - 1; i++) {
            if (ranks[i] == ranks[i+1]) {
                numInOrder++;
            } else if (numInOrder < 5 && ranks[i] != ranks[i+1]) {
                numInOrder = 0;
            }
        }

        //whether there are 5 or more cards in a row
        return numInOrder >= 5;
    }


    //Use hasFlush to check if there's a flush
    public boolean hasFlush() {
        int cardsSame = 0;

        // for all cards returns false if the next card is a different suit
        for (int i = 0; i < hand.length - 1; i++) {
            if (hand[i].suit == hand[i + 1].suit) cardsSame++;
        }

        // returns true if there has been no false
        return cardsSame >= 5;
    }


    //This check if the hand has four kinds
    public boolean hasFourKind() {
        if (checkNumbers() == 4) return true;
        return false;
    }

    
    //This check if the hands has three kinds
    public boolean hasThreeKind() {
        if (checkNumbers() == 3) return true;
        return false;
    }

  
     // Checks whether the hand contains a pair
   
    public boolean hasPair() {
        if (checkNumbers() == 2) {;
        return false;}
        else {
        	return true;
        }
    }

  
     //whether the hand has a full house
  
    public boolean hasFullHouse() {
        // two variables with the number of values that are the same
        // the number of the values that are the same can be 2 and 3 or 2 and 2, so you only need 2 variables
        int same1 = 0;
        int same2 = 0;

        // fills the 2 variables with the number of values that are the same if possible
        for (int i = 0; i < hand.length; i++) {
            int current = sameNumbers(hand[i].rank);
            if (current > 2) {
                if (same1 == 0) {
                    same1 = current;
                } else if (same2 == 0) {
                    same2 = current;
                } else {
                    if (current > same1) {
                        same1 = current;
                    } else if (current > same2) {
                        same2 = current;
                    }
                }
            }
        }

        // returns if there are 3 cards that are the same and 2 cards that are the same
        return same1 + same2 >= 5;
    }

   
     // Returns the number of cards that share the same number
   
    public int checkNumbers() {
        // the number of cards that are the same
        int same = 0;

        // checks to see how many cards share each rank
        // if the number of cards that share a rank is greater than the last card, same is replaced
        for (int i = 0; i < hand.length; i++) {
            int current = sameNumbers(hand[i].rank);
            if (current > same) same = current;
        }

        // same is returned
        return same;
    }

    //Checks to see how many cards share a number

    public int sameNumbers(int number) {
        // the number of cards that are the same
        int same = 0;

        // cycles through all cards,
        for (int i = 0; i < hand.length; i++) {
            if (hand[i].rank == number) {
                same++;
            }
        }

        return same;
    }
}
