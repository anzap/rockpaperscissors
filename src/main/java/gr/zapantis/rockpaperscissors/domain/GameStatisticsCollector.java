package gr.zapantis.rockpaperscissors.domain;


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
		this.game = game;
		this.timesToPlay = timesToPlay;
	}

	public Map<Outcome, Integer> gatherStatisticsForGamePlays() {

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
