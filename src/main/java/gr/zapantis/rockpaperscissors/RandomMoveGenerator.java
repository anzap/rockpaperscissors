package gr.zapantis.rockpaperscissors;

import java.security.SecureRandom;
import java.util.Random;

public class RandomMoveGenerator {
	private static Random random = new SecureRandom();

	public static Move randomMove() {
		System.out.println("RandomMoveGenerator.randomMove() "
				+ random.nextInt(Move.values().length));
		return Move.getEnumFromOrdinal(random.nextInt(Move.values().length));
	}

}
