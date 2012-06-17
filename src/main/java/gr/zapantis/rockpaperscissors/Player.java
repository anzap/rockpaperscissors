package gr.zapantis.rockpaperscissors;

/**
 * Abstract class representing a game player.
 * 
 * @author Andreas
 * 
 */
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
