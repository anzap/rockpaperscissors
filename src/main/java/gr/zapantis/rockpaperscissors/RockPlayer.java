package gr.zapantis.rockpaperscissors;

public class RockPlayer extends Player {

	public RockPlayer(String name) {
		super(name);
	}

	@Override
	public Move getMove() {
		return Move.ROCK;
	}

}
