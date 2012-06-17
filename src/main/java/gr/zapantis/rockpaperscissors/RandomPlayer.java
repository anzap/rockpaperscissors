package gr.zapantis.rockpaperscissors;

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
