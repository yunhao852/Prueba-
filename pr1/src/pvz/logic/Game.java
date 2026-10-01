package pvz.logic;

public class Game {
	private int cycles = 0;
	public static final int NUM_ROWS = 4;
	public static final int NUM_COLS = 8;
	public static final int INITIAL_COINS = 50;
public void update() {
	cycles++;
	sunflowerList.update();
	peashooterList.update();
	ZombiesManager.update();
}
	
    
}

