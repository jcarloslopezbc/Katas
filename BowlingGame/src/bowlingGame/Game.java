package bowlingGame;

public class Game {

	private int score = 0;
	private int rolls[] = new int[21];
	private int actualRoll = 0; 
	
	public int roll(int pins) {
		rolls[actualRoll++] = pins;
		return pins;			
	}

	public int score() {
		int firstBall = 0;
		for (int frame = 0; frame < 10; frame++) {
			if (spare(firstBall)){
				score += rolls[firstBall + 2] + 10;
				firstBall +=2;
			}
			else{
				score += rolls[firstBall] + rolls[firstBall + 1];
				firstBall += 2;
			}
		}
		return score;
	}

	private boolean spare(int firstBall) {
		return rolls[firstBall] + rolls[firstBall + 1] == 10;
	}

}
