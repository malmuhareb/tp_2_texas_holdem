
public class Deck {
	
	int index;
	
	String[] SUITS = {
            "Clubs", "Diamonds", "Hearts", "Spades"
        };

        String[] RANKS = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"
        };
        
        private Card[] deck = new Card[52];
	
	public Deck(){
		initDeck();
		shuffle();
		print();
		
		
	}
	// initialize deck
	private void initDeck(){
		
        for (int i = 0; i < RANKS.length; i++) {
            for (int j = 0; j < SUITS.length; j++) {
            	deck[SUITS.length*i + j] = new Card(i,j);
            	
            }
        }
		
	}
	// shuffle
	public void shuffle(){
		index = 0;
		
		 for (int i = 0; i < deck.length; i++) {
	            int r = i + (int) (Math.random() * (deck.length-i));
	            //System.out.println(r);
	            Card temp = deck[r];
	            deck[r] = deck[i];
	            deck[i] = temp;
	        }
		
	}

        // print shuffled deck
	public void print(){
		 for (int i = 0; i < deck.length; i++) {
            deck[i].printCard();
            System.out.println("Rank:  " + deck[i].getRank());
            System.out.println("Suit:  " + deck[i].getSuit());
            
        }
		
	}
	public Card nextCard(){
		index++;
		return deck[index - 1];
		
	}
	public void burn(){
		index++;
		
	}
       
    }


