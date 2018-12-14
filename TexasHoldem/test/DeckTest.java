import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DeckTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	

	@Test
	public void testNextCard() {
		Deck d = new Deck();
		Card c = d.nextCard();
		assertEquals("it should be 0",new Card(0,0).getRank(),c.getRank());
		assertEquals("it should be 0",new Card(0,0).getRank(),c.getRank());
	}

	@Test
	public void testBurn() {
		Deck d = new Deck();
		d.burn();
		assertEquals("it should be 1",1,d.index);
		d.burn();
		d.burn();
		d.burn();
		assertEquals("it should be 4",4,d.index);
		
	}

}
