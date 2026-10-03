package pvz.logic;

import pvz.control.Level;
import utils.Position;
import java.util.Random;
import pvz.logic.sunflowerList;
import pvz.logic.peashooterList;
import pvz.logic.ZombiesManager;

public class Game {
	public static final int NUM_ROWS = 4;
	public static final int NUM_COLS = 8;
	public static final int INITIAL_COINS = 50;
	private int coins;
	private int cycles = 0;
	private long seed;
	private Level level;
	private Random rand;
	private sunflowerList sunflower;
	private peashooterList peashooter;
	private ZombiesManager zombiesManager;
	
public Game() {
}

public void reset() {
	
}
    
}

