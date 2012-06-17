package gr.zapantis.rockpaperscissors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class PlayerTest {

	@Test
	public void createPlayer() {
		Player player = new Player("A", Move.PAPER);
		assertNotNull(player);
		assertEquals("A", player.getName());
		assertEquals(Move.PAPER, player.getMove());
	}

}
