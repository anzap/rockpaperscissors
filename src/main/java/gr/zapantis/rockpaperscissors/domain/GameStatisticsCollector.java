package gr.zapantis.rockpaperscissors.domain;

import gr.zapantis.rockpaperscissors.exceptions.RockPaperScissorsException;

import java.util.HashMap;
import java.util.Map;

/**
 * Class responsible for playing a game multiple times and gathering the
 * statistics for the outcome of each round.
 * 
 * @author Andreas
 * 
 */
public class GameStatisticsCollector {

	private final RockPaperScissorsGame game;
	private final int timesToPlay;

	public GameStatisticsCollector(RockPaperScissorsGame game, int timesToPlay) {
		if (game == null) {
			throw new RockPaperScissorsException("A game should be defined.");
		}
		
		if (timesToPlay < 0) {
			throw new RockPaperScissorsException("The defined times to play the game should be a positive number.");
		}
		this.game = game;
		this.timesToPlay = timesToPlay;
	}

	public Map<Outcome, Integer> playGameAndGatherStatistics() {


		@SuppressWarnings("serial")
		Map<Outcome, Integer> statistics = new HashMap<Outcome, Integer>() {
			{
				put(Outcome.WIN, 0);
				put(Outcome.LOSS, 0);
				put(Outcome.TIE, 0);
			}
		};

		for (int i = 0; i < timesToPlay; i++) {
			Outcome roundOutcome = game.round();
			statistics.put(roundOutcome, statistics.get(roundOutcome) + 1);
		}

		return statistics;
	}

}
