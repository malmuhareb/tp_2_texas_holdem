
public class Player {
	
	private String name;
	private boolean active;
	private Card[] pHand = new Card[2];
	private int handRank = 0;
	
	public int getHandRank() {
		return handRank;
	}
	public void setHandRank(int handRank) {
		this.handRank = handRank;
	}
	public Card[] getpHand() {
		return pHand;
	}
	public void setpHand(Card[] pHand) {
		this.pHand = pHand;
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

}
