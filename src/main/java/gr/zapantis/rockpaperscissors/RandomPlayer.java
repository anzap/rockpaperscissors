package gr.zapantis.rockpaperscissors;

public class RandomPlayer extends Player {

	public RandomPlayer(String name) {
		super(name);
	}

	@Override
	public Move getMove() {
		return RandomMoveGenerator.randomMove();
	}

}
