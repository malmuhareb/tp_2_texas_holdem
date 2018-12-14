import java.util.Scanner;

public class Hand {
	Scanner s = new Scanner(System.in);
	private Deck deck;
	private int pot = 0;
	private int cBid = 0;
	
	
	public Hand(){
		this.deck = new Deck();
		//deck.shuffle();
	}
	
public int getcBid() {
		return cBid;
	}

	public void setcBid(int cBid) {
		this.cBid = cBid;
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
	Card c = deck.nextCard();
	return c;
	
}

public Card river(){
	deck.burn();
	Card c = deck.nextCard();
	return c;
	
}

public void deal(Player[] p, int dealer ){
	deck.shuffle();
	
	System.out.println(dealer);
	int index = (dealer + 1) % (p.length);
	int index2 = (dealer + 1) % (p.length);
	dealer = dealer + 1;
	
	System.out.println(index);
	System.out.println(index2);
	for (int i = dealer ; i < p.length + dealer ; i++){
			p[index].setpCard1(deck.nextCard());
			index = (i + 1) % (p.length);
	}
	for (int i = dealer ; i < p.length + dealer ; i++){
		p[index2].setpCard2(deck.nextCard());
		index2 = (i + 1) % (p.length);
}
	
	//if ((dealer + 1) == p.length)
	//	dealer = 0;
	//else
	//	dealer++;
	//for (int i = 0 ; i < p.length ; i++){
	//	p[i%dealer].setpCard1(deck.nextCard());
		
	//}
	
	//for (int i = 0 ; i < p.length ; i++){
	//	p[i%dealer].setpCard2(deck.nextCard());
		
	//}
	
	
	
}
public void blindsHandler(Player[] p, int dealer ){
	for(int i = 0 ; i <p.length ; i++){
		if(p[i].getChips() == 0){
		p[i].setActive(false);
		}
		else{
			p[i].setActive(true);
		}
	}
	if ((dealer + 1) == p.length)
		dealer = 0;
	else
		dealer++;
	
	//System.out.println(dealer);
	//System.out.println(p.length);
	//System.out.println(dealer % (p.length));
	//System.out.println((dealer+1) % (p.length));
	
		p[dealer % (p.length)].setBet(1);
		p[(dealer+1) % (p.length)].setBet(2);
		p[dealer % (p.length)].payPot(1);
		p[(dealer+1) % (p.length)].payPot(2);
		this.setPot(3);
		this.setcBid(2);
		
	
	
}
public void round1(Player[] p, int dealer){
	System.out.println(dealer);
	int index = (dealer + 3) % (p.length);
	dealer = dealer + 3;
	//System.out.println(index);
	//System.out.println(dealer);
	
	for (int nn = 0 ; nn < p.length ; nn++){
		p[nn].setBet(0);
		p[nn].setLastAction(0);
	}
	
	while(p[index].getBet() < this.getcBid()){
		
		if(p[index].isActive()){
			
		
		System.out.println("Action on player:  " + p[index].getName());
		System.out.println("Chips:  " + p[index].getChips());
		System.out.println("Current Bid:  " + this.getcBid());
		System.out.println("------------------Player Hand-------------------");
		System.out.println(p[index].getpCard1().toString());
		System.out.println(p[index].getpCard2().toString());
		System.out.println("------------------------------------------------");
		System.out.println("OPTIONS:  1:Check/Fold | 2:Call | 3:Raise/Bet");
		int select = s.nextInt();
			
		if(select == 1){
			if(this.cBid == p[index].getBet()){
				System.out.println("Player Checked Thier Hand....");
			}
			else{
				System.out.println("Player Folded Thier Hand....");
				p[index].setActive(false);
				
			}
			
		}
		else if(select == 2){
			System.out.println("Player Called....");
			p[index].setBet(this.cBid);
			p[index].payPot(this.cBid);
			this.setPot(this.getPot() + this.cBid);
			
		}
		else {
			System.out.println("How Much Would you like to Raise/Bet? ");
			int amount = s.nextInt();
			if(amount > p[index].getChips()){
				System.out.println("You Don't Have Enough Chips, You Are going All in with what you got.\n GOOD LUCK ");
				this.setcBid(p[index].getChips());
				p[index].setBet(p[index].getChips());
				this.setPot(this.getPot() + p[index].getChips());
				p[index].payPot(p[index].getChips());
				
				
			}
			else{
				System.out.println("Player Raised....");
				this.setcBid(amount);
				p[index].setBet(amount);
				p[index].payPot(amount);
				this.setPot(this.getPot() + this.cBid);
			}
			
		}
		
	
	
	}
		dealer++;
		index = (dealer) % (p.length);
}
	
	
	
}

public void round2(Player[] p, int dealer){
	this.setcBid(0);
	
	for (int nn = 0 ; nn < p.length ; nn++){
		p[nn].setBet(0);
		p[nn].setLastAction(0);
	}
	
	
	//System.out.println(dealer);
	//int index = (dealer + 3) % (p.length);
	//dealer = dealer + 3;
	//System.out.println(index);
	//System.out.println(dealer);
	
	
	dealer = dealer + 1;
	int index = (dealer) % (p.length);
	//System.out.println("ROUND    2222222222222");
	//System.out.println(dealer);
	//System.out.println(index);
	while(p[index].getBet() <= this.getcBid() && p[index].getLastAction() != 1){
		if(p[index].isActive()){
			
		
		System.out.println("Action on player:  " + p[index].getName());
		System.out.println("Chips:  " + p[index].getChips());
		System.out.println("Current Bid:  " + this.getcBid());
		System.out.println("------------------Player Hand-------------------");
		System.out.println(p[index].getpCard1().toString());
		System.out.println(p[index].getpCard2().toString());
		System.out.println("------------------------------------------------");
		System.out.println("OPTIONS:  1:Check/Fold | 2:Call | 3:Raise/Bet");
		int select = s.nextInt();
			
		if(select == 1){
			if(this.cBid == p[index].getBet()){
				System.out.println("Player Checked Thier Hand....");
				p[index].setLastAction(1);
			}
			else{
				System.out.println("Player Folded Thier Hand....");
				p[index].setActive(false);
				
			}
			
		}
		else if(select == 2){
			System.out.println("Player Called....");
			p[index].setBet(this.cBid);
			p[index].payPot(this.cBid);
			this.setPot(this.getPot() + this.cBid);
			
		}
		else {
			System.out.println("How Much Would you like to Raise/Bet? ");
			int amount = s.nextInt();
			if(amount > p[index].getChips()){
				System.out.println("You Don't Have Enough Chips, You Are going All in with what you got.\n GOOD LUCK ");
				this.setcBid(p[index].getChips());
				p[index].setBet(p[index].getChips());
				this.setPot(this.getPot() + p[index].getChips());
				p[index].payPot(p[index].getChips());
				
				
			}
			else{
				System.out.println("Player Raised....");
				this.setcBid(amount);
				p[index].setBet(amount);
				p[index].payPot(amount);
				this.setPot(this.getPot() + this.cBid);
				
			}
			
		}
		
	
	
	}
		dealer++;
		index = (dealer) % (p.length);
}
	
	
	
}

public void round3(Player[] p, int dealer){
	this.setcBid(0);
	for (int nn = 0 ; nn < p.length ; nn++){
		p[nn].setBet(0);
		p[nn].setLastAction(0);
	}
	dealer = dealer + 1;
	int index = (dealer) % (p.length);
	
	while(p[index].getBet() <= this.getcBid() && p[index].getLastAction() != 1){
		if(p[index].isActive()){
			
		dealer++;
		System.out.println("Action on player:  " + p[index].getName());
		System.out.println("Chips:  " + p[index].getChips());
		System.out.println("Current Bid:  " + this.getcBid());
		System.out.println("------------------Player Hand-------------------");
		System.out.println(p[index].getpCard1().toString());
		System.out.println(p[index].getpCard2().toString());
		System.out.println("------------------------------------------------");
		System.out.println("OPTIONS:  1:Check/Fold | 2:Call | 3:Raise/Bet");
		int select = s.nextInt();
			
		if(select == 1){
			if(this.cBid == p[index].getBet()){
				System.out.println("Player Checked Thier Hand....");
				p[index].setLastAction(1);
			}
			else{
				System.out.println("Player Folded Thier Hand....");
				p[index].setActive(false);
				
			}
			
		}
		else if(select == 2){
			System.out.println("Player Called....");
			p[index].setBet(this.cBid);
			p[index].payPot(this.cBid);
			this.setPot(this.getPot() + this.cBid);
			
		}
		else {
			System.out.println("How Much Would you like to Raise/Bet? ");
			int amount = s.nextInt();
			if(amount > p[index].getChips()){
				System.out.println("You Don't Have Enough Chips, You Are going All in with what you got.\n GOOD LUCK ");
				this.setcBid(p[index].getChips());
				p[index].setBet(p[index].getChips());
				this.setPot(this.getPot() + p[index].getChips());
				p[index].payPot(p[index].getChips());
			
				
			}
			else{
				System.out.println("Player Raised....");
				this.setcBid(amount);
				p[index].setBet(amount);
				p[index].payPot(amount);
				this.setPot(this.getPot() + this.cBid);
				
			}
			
		}
		
	
	
	}
		dealer++;
		index = (dealer) % (p.length);
}
	
	
	
}
public void round4(Player[] p, int dealer){
	this.setcBid(0);
	for (int nn = 0 ; nn < p.length ; nn++){
		p[nn].setBet(0);
		p[nn].setLastAction(0);
	}
	dealer = dealer +1;
	int index = (dealer) % (p.length);
	
	while(p[index].getBet() <= this.getcBid() && p[index].getLastAction() != 1){
		if(p[index].isActive()){
			
		dealer++;
		System.out.println("Action on player:  " + p[index].getName());
		System.out.println("Chips:  " + p[index].getChips());
		System.out.println("Current Bid:  " + this.getcBid());
		System.out.println("------------------Player Hand-------------------");
		System.out.println(p[index].getpCard1().toString());
		System.out.println(p[index].getpCard2().toString());
		System.out.println("------------------------------------------------");
		System.out.println("OPTIONS:  1:Check/Fold | 2:Call | 3:Raise/Bet");
		int select = s.nextInt();
			
		if(select == 1){
			if(this.cBid == p[index].getBet()){
				System.out.println("Player Checked Thier Hand....");
				p[index].setLastAction(1);
			}
			else{
				System.out.println("Player Folded Thier Hand....");
				p[index].setActive(false);
				
			}
			
		}
		else if(select == 2){
			System.out.println("Player Called....");
			p[index].setBet(this.cBid);
			p[index].payPot(this.cBid);
			this.setPot(this.getPot() + this.cBid);
			
		}
		else {
			System.out.println("How Much Would you like to Raise/Bet? ");
			int amount = s.nextInt();
			if(amount > p[index].getChips()){
				System.out.println("You Don't Have Enough Chips, You Are going All in with what you got.\n GOOD LUCK ");
				this.setcBid(p[index].getChips());
				p[index].setBet(p[index].getChips());
				this.setPot(this.getPot() + p[index].getChips());
				p[index].payPot(p[index].getChips());
				
				
			}
			else{
				System.out.println("Player Raised....");
				this.setcBid(amount);
				p[index].setBet(amount);
				p[index].payPot(amount);
				this.setPot(this.getPot() + this.cBid);
				
			}
			
		}
		
	
	
	}
		dealer++;
		index = (dealer) % (p.length);
}
	
	
	
}

public int getPot() {
	return pot;
}

public void setPot(int pot) {
	this.pot = pot;
}
	
}


