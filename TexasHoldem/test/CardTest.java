import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CardTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetRank() {
		Card c = new Card(10,2);
		assertEquals("it should be 10",10,c.getRank());
	}

	@Test
	public void testGetSuit() {
		Card c = new Card(10,2);
		assertEquals("it should be 2",2,c.getSuit());
	}

}
