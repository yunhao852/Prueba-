package pvz.logic.gameobjects;

import pvz.logic.Game;
import utils.Position;

public class Zombie{
	public static final int INITIAL_HEALTH = 5;
	public static final int DAMAGE = 1;
	public static final int VELOCITY = 2;
	
	private int Position pos;
	private int health;
	private Game game;
	private int cyclesCounter;
	
	public Zombie(Position pos, Game game) {
		
	}
	
	public boolean isAlive() {
		
	
	}
	
	public boolean isInPosition(Position position) {
		
	}
	
	public void receiveAttack(int damage) {
		
	}
	
	public void update() {
		
		if(!isAlive()) return;
		
		Position leftPos = this.pos.left();
		// si hay una planta la ataca y si no avanza cada 2 ciclos
	}
	
	public String getIcon() {
		
	}

}