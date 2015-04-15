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
		for (int i = 0; i < 20; i++)
			game.roll(0);
		assertEquals(0, game.score());
	}
	
	@Test
	public void allRollsOne(){
		for (int i = 0; i < 20; i++)
			game.roll(1);
		assertEquals(20, game.score());
		
	}
	
}
