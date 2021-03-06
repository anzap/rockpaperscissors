package gr.zapantis.rockpaperscissors.utils;

import gr.zapantis.rockpaperscissors.domain.Move;
import gr.zapantis.rockpaperscissors.domain.Outcome;
import gr.zapantis.rockpaperscissors.exceptions.RockPaperScissorsException;

/**
 * Class that implements the strategy for evaluating the winner between two
 * players.
 * 
 * @author Andreas
 * 
 */
public final class WinChecker {

	public static Outcome evaluateWinner(Move firstMove, Move secondMove) {

		if (firstMove == null || secondMove == null) {
			throw new RockPaperScissorsException(
					"Both move should be defined to evaluate a winner.");
		}

		Outcome outcome = Outcome.TIE;

		/*
		 * Game logic for the winning move.
		 * 
		 * Scissors beats paper. Rock beats scissors. Paper beats rock. If both
		 * player choose the same, the outcome is a tie.
		 */
		if ((Move.PAPER.equals(firstMove) && Move.ROCK.equals(secondMove))
				|| (Move.SCISSORS.equals(firstMove) && Move.PAPER
						.equals(secondMove))
				|| (Move.ROCK.equals(firstMove) && Move.SCISSORS
						.equals(secondMove))) {
			outcome = Outcome.WIN;
		} else if ((Move.ROCK.equals(firstMove) && Move.PAPER
				.equals(secondMove))
				|| (Move.PAPER.equals(firstMove) && Move.SCISSORS
						.equals(secondMove))
				|| (Move.SCISSORS.equals(firstMove) && Move.ROCK
						.equals(secondMove))) {
			outcome = Outcome.LOSS;
		}

		return outcome;

	}

}
