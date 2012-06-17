package gr.zapantis.rockpaperscissors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class RockPaperScissorsGameTest {
	
	@Test
	public void createGame() {
		RockPaperScissorsGame rockPaperScissorsGame = new RockPaperScissorsGame();
		assertNotNull(rockPaperScissorsGame);
	}
	
	@Test
	public void testGameRound() {
		RockPaperScissorsGame game = new RockPaperScissorsGame();
		assertEquals(Outcome.WIN, game.round(new Player("A", Move.PAPER), new Player("B", Move.ROCK)));
	}


}
