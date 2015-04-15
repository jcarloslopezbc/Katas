package bowlingGame;

import org.junit.Test;

public class BowlingGameTest {

	@Test
	public void createGame(){
		Game game = new Game(); 
	}
	
	@Test
	public void oneRoll(){
		Game game = new Game();
		game.roll(0);
	}
	
}
