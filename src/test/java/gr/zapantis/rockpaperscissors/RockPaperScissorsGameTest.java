package gr.zapantis.rockpaperscissors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import gr.zapantis.rockpaperscissors.domain.Outcome;
import gr.zapantis.rockpaperscissors.domain.PaperPlayer;
import gr.zapantis.rockpaperscissors.domain.RockPaperScissorsGame;
import gr.zapantis.rockpaperscissors.domain.RockPlayer;

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
