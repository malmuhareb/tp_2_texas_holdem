import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HandEvaluationTest {

	@Before
	public void setUp() throws Exception {
		/*Player p1 = new Player("a");
		Player p2 = new Player("b");
		Player p3 = new Player("c");
		Player p4 = new Player("d");
		p1.setpCard1(new Card(12,0));
		p1.setpCard2(new Card(12,1));
		p2.setpCard1(new Card(0,0));
		p2.setpCard2(new Card(6,1));
		p3.setpCard1(new Card(6,0));
		p3.setpCard2(new Card(2,1));
		p4.setpCard1(new Card(7,0));
		p4.setpCard2(new Card(1,1));
		Player[] p = new Player[4];
		ArrayList<Player> pa = new ArrayList<Player>();
		pa.add(p1);
		pa.add(p2);
		pa.add(p3);
		pa.add(p4);
		p[0] = p1;
		p[1] = p2;
		p[2] = p3;
		p[3] = p4;
		
		Card[] floor = new Card[5];
		floor[0] = new Card(12,2);
		floor[1] = new Card(11,3);
		floor[2] = new Card(3,2);
		floor[3] = new Card(10,3);
		floor[4] = new Card(8,2);*/
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_HandEvaluation_init_and_eval() {
		Player p1 = new Player("a");
		Player p2 = new Player("b");
		Player p3 = new Player("c");
		Player p4 = new Player("d");
		p1.setpCard1(new Card(12,0));
		p1.setpCard2(new Card(12,1));
		p2.setpCard1(new Card(0,0));
		p2.setpCard2(new Card(6,1));
		p3.setpCard1(new Card(6,0));
		p3.setpCard2(new Card(2,1));
		p4.setpCard1(new Card(7,0));
		p4.setpCard2(new Card(1,1));
		p1.setActive(true);
		p2.setActive(true);
		p3.setActive(true);
		p4.setActive(true);
		Player[] p = new Player[4];
		ArrayList<Player> pa = new ArrayList<Player>();
		pa.add(p1);
		pa.add(p2);
		pa.add(p3);
		pa.add(p4);
		p[0] = p1;
		p[1] = p2;
		p[2] = p3;
		p[3] = p4;
		
		Card[] floor = new Card[5];
		floor[0] = new Card(12,2);
		floor[1] = new Card(12,3);
		floor[2] = new Card(3,2);
		floor[3] = new Card(10,3);
		floor[4] = new Card(8,2);
		HandEvaluation he = new HandEvaluation(floor,p);
		assertEquals("it should be 4 of a kind (true)",true,he.is4OfKind(floor, p1));
	}
	@Test
	public void isRoyalFlush_Test() {
		Player p1 = new Player("a");
		p1.setpCard1(new Card(12,0));
		p1.setpCard2(new Card(11,0));
		p1.setActive(true);
		Player[] p = new Player[1];
		p[0] = p1;
		Card[] floor = new Card[5];
		floor[0] = new Card(10,0);
		floor[1] = new Card(9,0);
		floor[2] = new Card(8,0);
		floor[3] = new Card(10,3);
		floor[4] = new Card(8,2);
		
		HandEvaluation he = new HandEvaluation(floor,p);
		assertEquals("it should be Royal Flush (true)",true,he.isRoyalFlush(floor, p1));
		
	}
	
	@Test
	public void isStraightFlush_Test() {
		Player p1 = new Player("a");
		p1.setpCard1(new Card(10,0));
		p1.setpCard2(new Card(11,0));
		p1.setActive(true);
		Player[] p = new Player[1];
		p[0] = p1;
		Card[] floor = new Card[5];
		floor[0] = new Card(9,0);
		floor[1] = new Card(8,0);
		floor[2] = new Card(7,0);
		floor[3] = new Card(10,3);
		floor[4] = new Card(8,2);
		
		HandEvaluation he = new HandEvaluation(floor,p);
		assertEquals("it should be Straight Flush (true)",true,he.isStraightFlush(floor, p1));
		
	}
	
	@Test
	public void is4OfKind_Test() {
		Player p1 = new Player("a");
		p1.setpCard1(new Card(12,0));
		p1.setpCard2(new Card(12,1));
		p1.setActive(true);
		Player[] p = new Player[1];
		p[0] = p1;
		Card[] floor = new Card[5];
		floor[0] = new Card(12,2);
		floor[1] = new Card(12,3);
		floor[2] = new Card(3,2);
		floor[3] = new Card(10,3);
		floor[4] = new Card(8,2);
		HandEvaluation he = new HandEvaluation(floor,p);
		assertEquals("it should be 4 of a kind (true)",true,he.is4OfKind(floor, p1));
		
	}
	
	@Test
	public void isFullHouse_Test() {
		
		Player p1 = new Player("a");
		p1.setpCard1(new Card(12,0));
		p1.setpCard2(new Card(12,1));
		p1.setActive(true);
		Player[] p = new Player[1];
		p[0] = p1;
		Card[] floor = new Card[5];
		floor[0] = new Card(12,2);
		floor[1] = new Card(11,3);
		floor[2] = new Card(11,2);
		floor[3] = new Card(10,3);
		floor[4] = new Card(8,2);
		HandEvaluation he = new HandEvaluation(floor,p);
		assertEquals("it should be Full House (true)",true,he.isFullHouse(floor, p1));
		
	}
	
	@Test
	public void isFlush_Test() {
		
		Player p1 = new Player("a");
		p1.setpCard1(new Card(2,0));
		p1.setpCard2(new Card(4,0));
		p1.setActive(true);
		Player[] p = new Player[1];
		p[0] = p1;
		Card[] floor = new Card[5];
		floor[0] = new Card(6,0);
		floor[1] = new Card(7,0);
		floor[2] = new Card(9,0);
		floor[3] = new Card(12,3);
		floor[4] = new Card(10,2);
		HandEvaluation he = new HandEvaluation(floor,p);
		assertEquals("it should be Flush (true)",true,he.isFlush(floor, p1));
		
	}
	@Test
	public void isStraight_Test() {
		
		Player p1 = new Player("a");
		p1.setpCard1(new Card(12,0));
		p1.setpCard2(new Card(11,1));
		p1.setActive(true);
		Player[] p = new Player[1];
		p[0] = p1;
		Card[] floor = new Card[5];
		floor[0] = new Card(10,2);
		floor[1] = new Card(9,3);
		floor[2] = new Card(1,2);
		floor[3] = new Card(4,3);
		floor[4] = new Card(8,2);
		HandEvaluation he = new HandEvaluation(floor,p);
		assertEquals("it should be straight (true)",true,he.isStraight(floor, p1));
		
	}
	@Test
	public void is3OfKind_Test() {
		Player p1 = new Player("a");
		p1.setpCard1(new Card(12,0));
		p1.setpCard2(new Card(12,1));
		p1.setActive(true);
		Player[] p = new Player[1];
		p[0] = p1;
		Card[] floor = new Card[5];
		floor[0] = new Card(12,2);
		floor[1] = new Card(1,3);
		floor[2] = new Card(3,2);
		floor[3] = new Card(10,3);
		floor[4] = new Card(8,2);
		HandEvaluation he = new HandEvaluation(floor,p);
		assertEquals("it should be 3 of a kind (true)",true,he.is3OfKind(floor, p1));
		
	}
	@Test
	public void is2Pair_Test() {
		Player p1 = new Player("a");
		p1.setpCard1(new Card(12,0));
		p1.setpCard2(new Card(12,1));
		p1.setActive(true);
		Player[] p = new Player[1];
		p[0] = p1;
		Card[] floor = new Card[5];
		floor[0] = new Card(11,2);
		floor[1] = new Card(11,3);
		floor[2] = new Card(1,2);
		floor[3] = new Card(4,3);
		floor[4] = new Card(8,2);
		HandEvaluation he = new HandEvaluation(floor,p);
		assertEquals("it should be 2 pair (true)",true,he.is2pair(floor, p1));
		
	}
	@Test
	public void isPair_Test() {
		Player p1 = new Player("a");
		p1.setpCard1(new Card(12,0));
		p1.setpCard2(new Card(12,1));
		p1.setActive(true);
		Player[] p = new Player[1];
		p[0] = p1;
		Card[] floor = new Card[5];
		floor[0] = new Card(11,2);
		floor[1] = new Card(10,3);
		floor[2] = new Card(1,2);
		floor[3] = new Card(4,3);
		floor[4] = new Card(8,2);
		HandEvaluation he = new HandEvaluation(floor,p);
		assertEquals("it should be a pair (true)",true,he.isPair(floor, p1));
		
	}
	@Test
	public void isHighCard_Test() {
		Player p1 = new Player("a");
		p1.setpCard1(new Card(12,0));
		p1.setpCard2(new Card(7,1));
		p1.setActive(true);
		Player[] p = new Player[1];
		p[0] = p1;
		Card[] floor = new Card[5];
		floor[0] = new Card(11,2);
		floor[1] = new Card(10,3);
		floor[2] = new Card(1,2);
		floor[3] = new Card(4,3);
		floor[4] = new Card(8,2);
		HandEvaluation he = new HandEvaluation(floor,p);
		assertEquals("it should be a pair (true)",true,he.isPair(floor, p1));
		
	}
	
	

}
