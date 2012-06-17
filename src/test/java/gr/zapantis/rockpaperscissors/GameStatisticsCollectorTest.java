package gr.zapantis.rockpaperscissors;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class GameStatisticsCollectorTest {

	private GameStatisticsCollector gameStatisticsCollector;

	@Before
	public void setUp() {
		Player firstPlayer = new Player("A", Move.PAPER);
		Player secondPlayer = new Player("B", Move.SCISSORS);
		int timesToPlay = 10;
		gameStatisticsCollector = new GameStatisticsCollector(
				new RockPaperScissorsGame(firstPlayer, secondPlayer),
				timesToPlay);

	}

	@Test
	public void testCreate() {
		assertNotNull(gameStatisticsCollector);
	}

	@Test
	public void testStatisticsResults() {
		Map<Outcome, Integer> statistics = gameStatisticsCollector
				.gatherStatisticsForGamePlays();
		assertTrue(0 == statistics.get(Outcome.WIN));
		assertTrue(10 == statistics.get(Outcome.LOSS));
		assertTrue(0 == statistics.get(Outcome.TIE));
	}

}
