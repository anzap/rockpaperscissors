package gr.zapantis.rockpaperscissors;


public class GameStatisticsCollector {

	private final RockPaperScissorsGame game;
	private final int timesToPlay;

	public GameStatisticsCollector(RockPaperScissorsGame game, int timesToPlay) {
		this.game = game;
		this.timesToPlay = timesToPlay;
	}

	public void gatherStatisticsForGamePlays() {
		for (int i = 0; i < timesToPlay; i++) {
			game.round();
		}
	}

}
