
public class Card {
	int rank;
	int suit;
	String desc;

	public Card(int r, int s) {
		this.rank = r;
		this.suit = s;
		this.toString();

	}
	public String toString(){
		int temp;
		if(rank < 9){
			temp = rank+2;
			desc = new String(String.valueOf(temp));
		}
		else if ( rank == 10) desc = new String("Jack");
		else if ( rank == 11) desc = new String("Queen");
		else if ( rank == 12) desc = new String("King");
		else desc = new String("Ace");
		
		if (suit == 0) desc = desc.concat(" of Clubs");
		else if (suit == 1) desc = desc.concat(" of Diamonds");
		else if (suit == 2) desc = desc.concat(" of Hearts");
		else  desc = desc.concat(" of Spades");
		return desc;
		// "Clubs", "Diamonds", "Hearts", "Spades"
		
	}

	public void printCard() {
		System.out.println(this.desc);
		
	}

}
