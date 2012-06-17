package gr.zapantis.rockpaperscissors;

public class PaperPlayer extends Player {

	public PaperPlayer(String name) {
		super(name);
	}

	@Override
	public Move getMove() {
		return Move.PAPER;
	}

}
