package gr.zapantis.rockpaperscissors.domain;

import gr.zapantis.rockpaperscissors.utils.RandomMoveGenerator;

/**
 * Concrete implementation of a player that chooses a random move in each round.
 * 
 * @author Andreas
 * 
 */
public class RandomPlayer extends Player {

	public RandomPlayer(String name) {
		super(name);
	}

	@Override
	public Move getMove() {
		return RandomMoveGenerator.randomMove();
	}

}
