package gr.zapantis.rockpaperscissors.domain;


/**
 * Concrete implementation of a player that always chooses a ROCK move.
 * 
 * @author Andreas
 * 
 */
public class RockPlayer extends Player {

	public RockPlayer(String name) {
		super(name);
	}

	@Override
	public Move getMove() {
		return Move.ROCK;
	}

}
