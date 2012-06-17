package gr.zapantis.rockpaperscissors;

public abstract class Player {

	private final String name;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public abstract Move getMove();

}
