package gr.zapantis.rockpaperscissors;

import java.util.Map;

/**
 * Hello world!
 * 
 */
public class App {
	private static final int GAME_ROUNDS = 1000;

	public static void main(String[] args) {
		PaperPlayer firstPlayer = new PaperPlayer("A");
		RandomPlayer secondPlayer = new RandomPlayer("B");
		RockPaperScissorsGame game = new RockPaperScissorsGame(firstPlayer, secondPlayer);
		
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
