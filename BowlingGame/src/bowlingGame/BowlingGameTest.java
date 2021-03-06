package bowlingGame;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class BowlingGameTest {

	private Game game = new Game();
	
	private void loopBowling(int shoots, int pins) {
		for (int i = 0; i < shoots; i++)
			game.roll(pins);
	}
	
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
	
	@Test
	public void spare(){
		game.roll(5);
		game.roll(5);
		game.roll(3);
		loopBowling(17, 0);
		assertEquals(16, game.score());
	}
	
	@Test
	public void strike() throws Exception {
		game.roll(10);
		game.roll(5);
		game.roll(5);
		loopBowling(16, 0);
		assertEquals(30, game.score());
		
	}
	
	@Test
	public void perfectGame() throws Exception {
		loopBowling(12, 10);
		assertEquals(300, game.score());
		
	}
	
	
	
	
}
