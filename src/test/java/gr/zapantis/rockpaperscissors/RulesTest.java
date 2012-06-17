package gr.zapantis.rockpaperscissors;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RulesTest {

	@Test
	public void scissorsBeatsPaper() {
		assertEquals(Outcome.WIN, WinChecker.evaluateWinner(Move.SCISSORS, Move.PAPER));
	}

	@Test
	public void rockBeatsScissors() {
		assertEquals(Outcome.WIN, WinChecker.evaluateWinner(Move.ROCK, Move.SCISSORS));
	}

	@Test
	public void paperBeatsRock() {
		assertEquals(Outcome.WIN, WinChecker.evaluateWinner(Move.PAPER, Move.ROCK));
	}
	
	@Test
	public void equalMovesAreATie() {
		assertEquals(Outcome.TIE, WinChecker.evaluateWinner(Move.PAPER, Move.PAPER));
		assertEquals(Outcome.TIE, WinChecker.evaluateWinner(Move.ROCK, Move.ROCK));
		assertEquals(Outcome.TIE, WinChecker.evaluateWinner(Move.SCISSORS, Move.SCISSORS));
	}

}
