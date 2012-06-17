package gr.zapantis.rockpaperscissors;

import gr.zapantis.rockpaperscissors.domain.GameStatisticsCollector;
import gr.zapantis.rockpaperscissors.domain.Outcome;
import gr.zapantis.rockpaperscissors.domain.PaperPlayer;
import gr.zapantis.rockpaperscissors.domain.RandomPlayer;
import gr.zapantis.rockpaperscissors.domain.RockPaperScissorsGame;

import java.util.Map;

/**
 * Client code creating a series of Rock Paper Scissors games.
 * 
 */
public class App {
	private static final int GAME_ROUNDS = 100;

	public static void main(String[] args) {
		PaperPlayer paperPlayer = new PaperPlayer("A");
		RandomPlayer randomPlayer = new RandomPlayer("B");
		RockPaperScissorsGame game = new RockPaperScissorsGame(paperPlayer, randomPlayer);
		
		GameStatisticsCollector gameStatisticsCollector = new GameStatisticsCollector(game, GAME_ROUNDS);
		Map<Outcome, Integer> statistics = gameStatisticsCollector.gatherStatisticsForGamePlays();
		
		System.out.println(String.format("Player A wins %d of %d games",
				statistics.get(Outcome.WIN), GAME_ROUNDS));
		System.out.println(String.format("Player B wins %d of %d games",
				statistics.get(Outcome.LOSS), GAME_ROUNDS));
		System.out.println(String.format("Tie: %d of %d games",
				statistics.get(Outcome.TIE), GAME_ROUNDS));
	}
}
