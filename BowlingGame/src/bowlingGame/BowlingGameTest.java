package bowlingGame;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class BowlingGameTest {

	private Game game = new Game();
	
	@Test
	public void createGame(){
		 
	}
	
	@Test
	public void oneRoll(){
		game.roll(0);
	}
	
	@Test
	public void allGameGutters(){
		loopBowling(0, 0);
		assertEquals(0, game.score());
	}

	
	
	@Test
	public void allRollsOne(){
		loopBowling(20, 1);
		assertEquals(20, game.score());
		
	}
	
	private void loopBowling(int n, int pins) {
		for (int i = 0; i < n; i++)
			game.roll(pins);
	}
	
}
