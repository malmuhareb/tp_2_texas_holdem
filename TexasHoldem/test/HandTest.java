import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HandTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_flop() {
		Hand h = new Hand();
		assertEquals("it shoud be 0",new Card(0,0).getRank(),h.flop()[0].getRank());
		assertEquals("it shoud be 1",new Card(1,0).getRank(),h.flop()[1].getRank());
		assertEquals("it shoud be 2",new Card(2,0).getRank(),h.flop()[2].getRank());
		
	}
	
	@Test
	public void test_turn() {
		Hand h = new Hand();
		assertEquals("it shoud be 1",new Card(0,1).getSuit(),h.turn().getSuit());
		
	}
	
	@Test
	public void test_river() {
		Hand h = new Hand();
		assertEquals("it shoud be 1",new Card(0,1).getSuit(),h.turn().getSuit());
		
		
	}

}
