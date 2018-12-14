import java.util.Scanner;

public class PokerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfHands = 0;
		//Deck d = new Deck();
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to Texas Holdem!");
		System.out.println("Please Enter the Number of Players: [2 to 9]: ");
		int i = s.nextInt();
		while (i > 9 && i < 2) {
			System.out.println("Invalid Selection.....");
			System.out.println("Please Enter the Number of Players: [2 to 9]: ");

		}

		Player[] p = new Player[i];

		for (int j = 1; j <= p.length; j++) {
			System.out.println("Enter Player Number (" + j + ") Name:");
			s.nextLine();
			String n = s.next();
			p[j - 1] = new Player(n);
		}

		// new hand
		System.out.println("Would you like to start a new hand? 1:YES 2:NO");
		int select = s.nextInt();
		while (select == 1) {
			System.out.println("Starting a new Hand... \n");
			Hand h = new Hand();
			//System.out.println(numOfHands % (p.length - 1));
			//System.out.println(numOfHands % (p.length));
			h.blindsHandler(p, numOfHands % (p.length - 1));
			
				h.deal(p, numOfHands % (p.length - 1));
			
			
			System.out.println("Betting Round 1.....");
			h.round1(p, numOfHands % (p.length - 1));
			System.out.println("Betting Round 1 Ended.....");
			int active = 0;
			int index = 0;
			for (int jj = 0; jj < p.length; jj++) {
				if (p[jj].isActive()) {
					active++;
					index = jj;
				}
			}
			Card[] f = h.flop();
			if (active > 1) {
				System.out.println("FLOP.....");
				System.out.println(f[0].toString());
				System.out.println(f[1].toString());
				System.out.println(f[2].toString());
			} else {
				for (int ii = 0 ; ii < p.length ; ii++){
					if(p[ii].isActive()){
						System.out.println("Winner is:   " + p[ii].getName());
						System.out.println("Wining Hand.....");
						System.out.println(p[ii].getpCard1().toString());
						System.out.println(p[ii].getpCard2().toString());
						System.out.println("Winings:  " + h.getPot());
						p[ii].setChips(p[ii].getChips() + h.getPot());
						System.out.println("Current Chips:  " + p[ii].getChips());
						
					}
				}

			}

			System.out.println("Betting Round 2.....");
			h.round2(p, numOfHands % (p.length - 1));
			System.out.println("Betting Round 2 Ended.....");
			active = 0;
			index = 0;
			for (int jj = 0; jj < p.length; jj++) {
				if (p[jj].isActive()) {
					active++;
					index = jj;
				}
			}
			Card t = h.turn();
			if (active > 1) {
				System.out.println("TURN.....");
				System.out.println(f[0].toString());
				System.out.println(f[1].toString());
				System.out.println(f[2].toString());
				System.out.println(t.toString());
			} else {
				for (int ii = 0 ; ii < p.length ; ii++){
					if(p[ii].isActive()){
						System.out.println("Winner is:   " + p[ii].getName());
						System.out.println("Wining Hand.....");
						System.out.println(p[ii].getpCard1().toString());
						System.out.println(p[ii].getpCard2().toString());
						System.out.println("Winings:  " + h.getPot());
						p[ii].setChips(p[ii].getChips() + h.getPot());
						System.out.println("Current Chips:  " + p[ii].getChips());
						
					}
				}

			}

			System.out.println("Betting Round 3.....");
			h.round3(p, numOfHands % (p.length - 1));
			System.out.println("Betting Round 3 Ended.....");
			active = 0;
			index = 0;
			for (int jj = 0; jj < p.length; jj++) {
				if (p[jj].isActive()) {
					active++;
					index = jj;
				}

			}
			Card r = h.river();
			if (active > 1) {
				System.out.println("RIVER.....");
				System.out.println(f[0].toString());
				System.out.println(f[1].toString());
				System.out.println(f[2].toString());
				System.out.println(t.toString());
				System.out.println(r.toString());
			} else {
				for (int ii = 0 ; ii < p.length ; ii++){
					if(p[ii].isActive()){
						System.out.println("Winner is:   " + p[ii].getName());
						System.out.println("Wining Hand.....");
						System.out.println(p[ii].getpCard1().toString());
						System.out.println(p[ii].getpCard2().toString());
						System.out.println("Winings:  " + h.getPot());
						p[ii].setChips(p[ii].getChips() + h.getPot());
						System.out.println("Current Chips:  " + p[ii].getChips());
						
					}
				}

			}
			
			System.out.println("Betting Round 4.....");
			h.round4(p, numOfHands % (p.length - 1));
			System.out.println("Betting Round 4 Ended.....");
			active = 0;
			index = 0;
			for (int jj = 0; jj < p.length; jj++) {
				if (p[jj].isActive()) {
					active++;
					index = jj;
				}

			}
			if (active > 1) {
				Card[] floor = new Card[5];
				floor[0] = f[0];
				floor[1] = f[1];
				floor[2] = f[2];
				floor[3] = t;
				floor[4] = r;
				HandEvaluation eval = new HandEvaluation(floor,p);
				Player w = eval.winner(p);
				System.out.println("Winner is:   " + w.getName());
				System.out.println("Wining Hand.....");
				System.out.println(w.getpCard1().toString());
				System.out.println(w.getpCard2().toString());
				System.out.println("Winings:  " + h.getPot());
				w.setChips(w.getChips() + h.getPot());
				System.out.println("Current Chips:  " + w.getChips());
			} else {
				for (int ii = 0 ; ii < p.length ; ii++){
					if(p[ii].isActive()){
						System.out.println("Winner is:   " + p[ii].getName());
						System.out.println("Wining Hand.....");
						System.out.println(p[ii].getpCard1().toString());
						System.out.println(p[ii].getpCard2().toString());
						System.out.println("Winings:  " + h.getPot());
						p[ii].setChips(p[ii].getChips() + h.getPot());
						System.out.println("Current Chips:  " + p[ii].getChips());
						
					}
				}

			}

			///////////
			System.out.println("Hand Ended.....");
			for(int ll = 0 ; ll < p.length ; ll++){
				System.out.println("Player Name:   " + p[ll].getName() + "Chips:  " + p[ll].getChips());
				
			}
			numOfHands++;
			System.out.println("Would you like to start a new hand? 1:YES 2:NO");
			select = s.nextInt();
		}
		System.out.println("Game Ended.....");
		for(int ll = 0 ; ll < p.length ; ll++){
			System.out.println("Player Name:   " + p[ll].getName() + "Chips:  " + p[ll].getChips());
			
		}

	}

}
