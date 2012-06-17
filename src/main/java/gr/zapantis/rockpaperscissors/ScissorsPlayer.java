package gr.zapantis.rockpaperscissors;

public class ScissorsPlayer extends Player {

	public ScissorsPlayer(String name) {
		super(name);
	}

	@Override
	public Move getMove() {
		return Move.SCISSORS;
	}

}
