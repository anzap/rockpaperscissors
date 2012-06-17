package gr.zapantis.rockpaperscissors;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class GameStatisticsCollectorTest {

	private GameStatisticsCollector gameStatisticsCollector;
	private int timesToPlay = 10;

	@Before
	public void setUp() {
		Player firstPlayer = new PaperPlayer("A");
		Player secondPlayer = new ScissorsPlayer("B");
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
		assertTrue(10 == (statistics.get(Outcome.WIN)
				+ statistics.get(Outcome.LOSS) + statistics.get(Outcome.TIE)));
	}

}
