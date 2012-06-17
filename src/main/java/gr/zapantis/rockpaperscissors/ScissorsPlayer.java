package gr.zapantis.rockpaperscissors;

/**
 * Concrete implementation of a player that always chooses a SCISSORS move.
 * 
 * @author Andreas
 * 
 */
public class ScissorsPlayer extends Player {

	public ScissorsPlayer(String name) {
		super(name);
	}

	@Override
	public Move getMove() {
		return Move.SCISSORS;
	}

}
