package gr.zapantis.rockpaperscissors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import gr.zapantis.rockpaperscissors.domain.Move;
import gr.zapantis.rockpaperscissors.domain.Outcome;
import gr.zapantis.rockpaperscissors.domain.PaperPlayer;
import gr.zapantis.rockpaperscissors.domain.Player;
import gr.zapantis.rockpaperscissors.domain.RockPaperScissorsGame;
import gr.zapantis.rockpaperscissors.domain.RockPlayer;
import gr.zapantis.rockpaperscissors.exceptions.RockPaperScissorsException;

import org.junit.Before;
import org.junit.Test;

public class RockPaperScissorsGameTest {
	private RockPaperScissorsGame game;

	@Before
	public void setup() {
		game = new RockPaperScissorsGame(new PaperPlayer("A"), new RockPlayer(
				"B"));
	}

	@Test
	public void createGame() {
		assertNotNull(game);
	}

	@Test
	public void gameRoundResultShouldBeWin() {
		assertEquals(Outcome.WIN, game.round());
	}

	@Test(expected = RockPaperScissorsException.class)
	public void noPlayerDefined() {
		new RockPaperScissorsGame(null, null);
	}

	@Test(expected = RockPaperScissorsException.class)
	public void noPlayerMoveDefined() {
		new RockPaperScissorsGame(new NoMovePlayer("A"), new RockPlayer("B"));
	}
	
	private class NoMovePlayer extends Player {

		public NoMovePlayer(String name) {
			super(name);
		}

		@Override
		public Move getMove() {
			return null;
		}
		
	}

}
