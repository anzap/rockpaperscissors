package gr.zapantis.rockpaperscissors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class PlayerTest {

	@Test
	public void createPaperPlayer() {
		Player player = new PaperPlayer("A");
		assertNotNull(player);
		assertEquals("A", player.getName());
		assertEquals(Move.PAPER, player.getMove());
	}

	@Test
	public void createRandomPlayer() {
		Player player = new RandomPlayer("A");
		assertNotNull(player);
		assertEquals("A", player.getName());
		assertNotNull(player.getMove());
	}

}
