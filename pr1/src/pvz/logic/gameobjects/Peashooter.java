package pvz.logic.gameobjects;

import pvz.logic.Game;
import utils.Position;

public class Peashooter{
	public static final int COST = 50;
	public static final int DAMAGE = 1;
	public static final int INITIAL_HEALTH = 3;
	
	private Position pos;
	private int health;
	private Game game;
	
	public Peashooter(Position pos, Game game) {
		this.pos = pos;
		this.game = game;
		this.health = INITIAL_HEALTH;
	}
	
	public boolean isAlive() {
		
	}
	
	public boolean isInPosition(Position position) {
		return this.pos.equals(position);
	}
	
	public void receiveDamage(int damage) {
		
	}
	
	public void update() {
		if(!Alive()) return;
		
		game.shootZombieInRow(this.pos, DAMAGE);
	}
	
	public String getIcon() {
		
	}
	
	public static string getDescription() {
		
	}
}