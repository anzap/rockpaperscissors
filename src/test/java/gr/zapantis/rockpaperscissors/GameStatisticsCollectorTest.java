package gr.zapantis.rockpaperscissors;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class GameStatisticsCollectorTest {

	@Test
	public void testCreate() {
		GameStatisticsCollector gameStatisticsCollector = new GameStatisticsCollector(
				new RockPaperScissorsGame(new Player("A", Move.PAPER),
						new Player("B", Move.SCISSORS)), 10);
		assertNotNull(gameStatisticsCollector);
	}

}
