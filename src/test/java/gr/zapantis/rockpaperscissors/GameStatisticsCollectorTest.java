package gr.zapantis.rockpaperscissors;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import gr.zapantis.rockpaperscissors.domain.GameStatisticsCollector;
import gr.zapantis.rockpaperscissors.domain.Outcome;
import gr.zapantis.rockpaperscissors.domain.PaperPlayer;
import gr.zapantis.rockpaperscissors.domain.Player;
import gr.zapantis.rockpaperscissors.domain.RockPaperScissorsGame;
import gr.zapantis.rockpaperscissors.domain.ScissorsPlayer;
import gr.zapantis.rockpaperscissors.exceptions.RockPaperScissorsException;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class GameStatisticsCollectorTest {

	private GameStatisticsCollector gameStatisticsCollector;
	private int timesToPlay = 10;
	private Player firstPlayer;
	private Player secondPlayer;
	private RockPaperScissorsGame game;

	@Before
	public void setUp() {
		firstPlayer = new PaperPlayer("A");
		secondPlayer = new ScissorsPlayer("B");
		game = new RockPaperScissorsGame(firstPlayer, secondPlayer);
		gameStatisticsCollector = new GameStatisticsCollector(game, timesToPlay);

	}

	@Test
	public void testCreate() {
		assertNotNull(gameStatisticsCollector);
	}

	@Test
	public void gatherStatisticsResults() {
		Map<Outcome, Integer> statistics = gameStatisticsCollector
				.gatherStatisticsForGamePlays();
		assertTrue(0 == statistics.get(Outcome.WIN));
		assertTrue(10 == statistics.get(Outcome.LOSS));
		assertTrue(0 == statistics.get(Outcome.TIE));
		assertTrue(10 == (statistics.get(Outcome.WIN)
				+ statistics.get(Outcome.LOSS) + statistics.get(Outcome.TIE)));
	}

	@Test(expected = RockPaperScissorsException.class)
	public void noGameDefined() {
		new GameStatisticsCollector(null, 5);
	}

	@Test(expected = RockPaperScissorsException.class)
	public void negativeGamePlaysNoDefined() {
		new GameStatisticsCollector(game, -10);
	}

}
