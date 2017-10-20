Exercise 1 was answered in the read me file (see code bellow), laso in the CardSoln2.java

Exercise 2 was answered in the Exercisetwo.java

Exercise 3 was answered in the Exercisethree.java

Exercise 4 was answered in the Rational.java

Exercise 5 was answered in the PokerHand.java 

I used sources on github to find the original code for CardSoln2 and changed it
(part of exercise 1 was asking us to use the original code and change all the class methods into object methods and the link on the reading won't work so I have to find the online sources)

Also I asked Hunter North some questions about how to change a class method into 
an object method and vice versa.

the source link is here:
https://github.com/AllenDowney/thinkjava5/blob/master/code/Cards/CardSoln2.java





Exercise 1 answer:
Here's what I changed
   public Deck merge() {
	// create the new deck
	Deck result = new Deck (cards.length + this.cards.length);
		
	int choice;    // records the winner (1 means d1, 2 means d2)
	int i = 0;     // traverses the first input deck
	int j = 0;     // traverses the second input deck
		
	// k traverses the new (merged) deck
	for (int k = 0; k < result.cards.length; k++) {
	    choice = 1;

	    // if d1 is empty, d2 wins; if d2 is empty, d1 wins; otherwise,
	    // compare the two cards
	    if (i == cards.length)
		choice = 2;
	    else if (j == this.cards.length)
		choice = 1;
	    else if (cards[i].compareTo(this.cards[j]) > 0)
		choice = 2;
			
	    // make the new deck refer to the winner card
	    if (choice == 1) {
		result.cards[k] = cards[i];  i++;
	    } else {
		result.cards[k] = this.cards[j];  j++;
	    }			
	}
	return result;
    }
	
    /*
     * Sort the Deck using merge sort.
     */
    public Deck mergeSort() {
	if (cards.length < 2) {
	    return this;
	}
	int mid = (cards.length-1) / 2;
	
	// divide the deck roughly in half
	Deck d1 = subdeck(0, mid);
	Deck d2 = subdeck(mid+1, cards.length-1);
	
	// sort the halves
	d1 = d1.mergeSort();
	d2 = d2.mergeSort();
	
	// merge the two halves and return the result
	// (d1 and d2 get garbage collected)
	return merge();
    }

I perfer the new one because it's easier for me to read.