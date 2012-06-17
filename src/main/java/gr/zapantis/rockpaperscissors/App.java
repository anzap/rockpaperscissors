package gr.zapantis.rockpaperscissors;

import gr.zapantis.rockpaperscissors.domain.GameStatisticsCollector;
import gr.zapantis.rockpaperscissors.domain.Outcome;
import gr.zapantis.rockpaperscissors.domain.PaperPlayer;
import gr.zapantis.rockpaperscissors.domain.RandomPlayer;
import gr.zapantis.rockpaperscissors.domain.RockPaperScissorsGame;
import gr.zapantis.rockpaperscissors.exceptions.RockPaperScissorsException;

import java.util.Map;

/**
 * Client code creating a series of Rock Paper Scissors games. The default
 * number of series rounds is 100, but one can define more times by supplying
 * the number of rounds as an argument to the program.
 * 
 */
public class App {
	private static final int GAME_ROUNDS = 100;

	public static void main(String[] args) {

		int timesToPlay = GAME_ROUNDS;

		try {
			if (args.length > 0) {
				validateArguments(args);

				timesToPlay = Integer.valueOf(args[0]);
			}

			PaperPlayer paperPlayer = new PaperPlayer("A");
			RandomPlayer randomPlayer = new RandomPlayer("B");
			RockPaperScissorsGame game = new RockPaperScissorsGame(paperPlayer,
					randomPlayer);

			GameStatisticsCollector gameStatisticsCollector = new GameStatisticsCollector(
					game, timesToPlay);
			Map<Outcome, Integer> statistics = gameStatisticsCollector
					.playGameAndGatherStatistics();

			System.out.println(String.format("Player A wins %d of %d games",
					statistics.get(Outcome.WIN), timesToPlay));
			System.out.println(String.format("Player B wins %d of %d games",
					statistics.get(Outcome.LOSS), timesToPlay));
			System.out.println(String.format("Tie: %d of %d games",
					statistics.get(Outcome.TIE), timesToPlay));
		} catch (RockPaperScissorsException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void validateArguments(String[] args) {
		if (args.length != 1) {
			throw new RockPaperScissorsException(
					"Only one argument should be defined");
		}

		try {
			Integer.valueOf(args[0]);
		} catch (NumberFormatException e) {
			throw new RockPaperScissorsException(String.format(
					"Argument [%s] should be an integer number.", args[0]));
		}
	}
}
