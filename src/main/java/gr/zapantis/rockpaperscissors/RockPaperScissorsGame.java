package gr.zapantis.rockpaperscissors;

public class RockPaperScissorsGame {
	
	public Outcome round(Player firstPlayer, Player secondPlayer) {
		return calculateWinner(firstPlayer, secondPlayer);
	}

	private Outcome calculateWinner(Player firstPlayer, Player secondPlayer) {
		return WinChecker.evaluateWinner(firstPlayer.getMove(), secondPlayer.getMove());
	}

}
