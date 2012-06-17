package gr.zapantis.rockpaperscissors.domain;

import gr.zapantis.rockpaperscissors.exceptions.RockPaperScissorsException;
import gr.zapantis.rockpaperscissors.utils.WinChecker;

/**
 * Class implementing a Rock Paper Scissors game.
 * 
 * @author Andreas
 * 
 */
public class RockPaperScissorsGame {

	private final Player firstPlayer;
	private final Player secondPlayer;

	public RockPaperScissorsGame(Player firstPlayer, Player secondPlayer) {
		if (firstPlayer == null || secondPlayer == null) {
			throw new RockPaperScissorsException(
					"Both players should be defined.");
		}
		if (firstPlayer.getMove() == null || secondPlayer.getMove() == null) {
			throw new RockPaperScissorsException(
					"A move should be defined for both playes of the game.");
		}
		this.firstPlayer = firstPlayer;
		this.secondPlayer = secondPlayer;
	}

	public Outcome round() {
		return WinChecker.evaluateWinner(firstPlayer.getMove(),
				secondPlayer.getMove());
	}

}
