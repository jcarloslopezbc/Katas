package bowlingGame;

public class Game {

	private int score = 0;
	
	public int roll(int pins) {
		score += pins;
		return pins;			
	}

	public int score() {
		return score; 
	}

}
