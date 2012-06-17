package gr.zapantis.rockpaperscissors.domain;

/**
 * Enum representing the different legal moves a player can make.
 * 
 * @author Andreas
 * 
 */
public enum Move {
	SCISSORS, ROCK, PAPER;

	public static Move getEnumFromOrdinal(int ordinal) {
		return values()[ordinal];
	}
}
