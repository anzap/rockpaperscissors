package gr.zapantis.rockpaperscissors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class RockPaperScissorsGameTest {
	private RockPaperScissorsGame game;
	
	@Before
	public void setup() {
		game = new RockPaperScissorsGame(new PaperPlayer("A"), new RockPlayer("B"));
	}
	
	@Test
	public void createGame() {
		assertNotNull(game);
	}
	
	@Test
	public void testGameRound() {
		assertEquals(Outcome.WIN, game.round());
	}


}
