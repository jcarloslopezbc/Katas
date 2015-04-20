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
		int i = 0;
		for (int frame = 0; frame < 10; frame++) {
			if (rolls[i] + rolls[i + 1] == 10){
				score += rolls[i + 2] + 10;
				i +=2;
			}
			else{
				score += rolls[i] + rolls[i + 1];
				i += 2;
			}
		}
		return score;
	}

}
