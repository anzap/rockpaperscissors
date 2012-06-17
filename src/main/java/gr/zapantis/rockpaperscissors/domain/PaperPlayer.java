package gr.zapantis.rockpaperscissors.domain;


/**
 * Concrete implementation of a player that always chooses a PAPER move.
 * 
 * @author Andreas
 * 
 */
public class PaperPlayer extends Player {

	public PaperPlayer(String name) {
		super(name);
	}

	@Override
	public Move getMove() {
		return Move.PAPER;
	}

}
