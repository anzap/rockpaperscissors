package gr.zapantis.rockpaperscissors;

public enum Move {
	SCISSORS, ROCK, PAPER;
	
	public static Move getEnumFromOrdinal(int ordinal) {
		return values()[ordinal];
    }
}
