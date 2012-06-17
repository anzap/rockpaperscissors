package gr.zapantis.rockpaperscissors;

import java.security.SecureRandom;
import java.util.Random;

/**
 * Seeder class returning random moves.
 * 
 * @author Andreas
 * 
 */
public class RandomMoveGenerator {
	private static Random random = new SecureRandom();

	public static Move randomMove() {
		return Move.getEnumFromOrdinal(random.nextInt(Move.values().length));
	}

}
