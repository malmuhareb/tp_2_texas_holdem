
public class Hand {
	Deck deck;
	
	public Hand (Deck d){
		this.deck = d;
		deck.shuffle();
	}
	
public Card[] flop(){
	Card[] flop = new Card[3];
	deck.burn();
	for(int i = 0 ; i < flop.length ; i++){
		flop[i] = deck.nextCard();
	}
	return flop;
		
}

public Card turn(){
	deck.burn();
	return deck.nextCard();
	
}

public Card river(){
	deck.burn();
	return deck.nextCard();
	
}

public void deal(Player[] p ){
	
}

}
