package gr.zapantis.rockpaperscissors;

public class RockPaperScissorsGame {
	
	private final Player firstPlayer;
	private final Player secondPlayer;

	public RockPaperScissorsGame(Player firstPlayer, Player secondPlayer) {
		this.firstPlayer = firstPlayer;
		this.secondPlayer = secondPlayer;
	}

	public Outcome round() {
		return WinChecker.evaluateWinner(firstPlayer.getMove(), secondPlayer.getMove());
	}

}
