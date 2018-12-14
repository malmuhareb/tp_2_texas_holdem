
public class Player {
	
	private String name;
	private boolean active;
	//private Card[] pHand = new Card[2];
	private Card pCard1;
	private Card pCard2;
	private int handRank = 0;
	private int handMiniRank = 0;
	private int handMiniRank2 = 0;
	private int handMiniRank3 = 0;
	private int handMiniRank4 = 0;
	private int handMiniRank5 = 0;
	private int bet = 0;
	private int chips = 300;
	private int lastAction = 0;

	
	public int getLastAction() {
		return lastAction;
	}
	public void setLastAction(int lastAction) {
		this.lastAction = lastAction;
	}
	public Player(String n) {
		this.name = n;
	}
	public Card getpCard1() {
		return pCard1;
	}
	public void setpCard1(Card pCard1) {
		this.pCard1 = pCard1;
	}
	public Card getpCard2() {
		return pCard2;
	}
	public void setpCard2(Card pCard2) {
		this.pCard2 = pCard2;
	}
	
	public int getHandMiniRank5() {
		return handMiniRank5;
	}
	public void setHandMiniRank5(int handMiniRank5) {
		this.handMiniRank5 = handMiniRank5;
	}
		
	public int getHandMiniRank4() {
		return handMiniRank4;
	}
	public void setHandMiniRank4(int handMiniRank4) {
		this.handMiniRank4 = handMiniRank4;
	}
	public int getHandMiniRank3() {
		return handMiniRank3;
	}
	public void setHandMiniRank3(int handMiniRank3) {
		this.handMiniRank3 = handMiniRank3;
	}
	public int getHandMiniRank2() {
		return handMiniRank2;
	}
	public void setHandMiniRank2(int handMiniRank2) {
		this.handMiniRank2 = handMiniRank2;
	}
	public int getHandMiniRank() {
		return handMiniRank;
	}
	public void setHandMiniRank(int handMiniRank) {
		this.handMiniRank = handMiniRank;
	}
	public int getHandRank() {
		return handRank;
	}
	public void setHandRank(int handRank) {
		this.handRank = handRank;
	}
	
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getName() {
		return name;
	}
	public void reset(){
		this.setHandRank(0);
		this.setHandMiniRank(0);
		this.setHandMiniRank2(0);
		this.setHandMiniRank3(0);
		this.setHandMiniRank4(0);
		this.setHandMiniRank5(0);
		this.bet = 0;
		
		
	}
	public int getBet() {
		return bet;
	}
	public void setBet(int bet) {
		this.bet = bet;
	}
	public int getChips() {
		return chips;
	}
	public void setChips(int chips) {
		this.chips = chips;
	}
	public void payPot(int amount){
		if(amount > this.getChips()){
			this.setChips(0);
		}
		else{
			this.setChips(this.getChips() - amount);
			
		}
			
	}

}
