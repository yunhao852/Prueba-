package pvz.logic.gameobjects;

import pvz.logic.Game;
import utils.Position;

public class Sunflower{

	public static final int COST = 20;
	public static final int DAMAGE = 0;
	public static final int INITIAL_HEALTH = 1;
	public static final int FREQUENCY = 3;
	
	private Position pos;
	private int health;
	private Game game;
	private int cycleCounter;
	
	public Sunflower(Position pos, Game game) {
		this.pos = pos;
		this.game = game;
		this.health = INITIAL_HEALTH;
		this.cycleCounter = 0;
	}
	
	public boolean isAlive() {
		return health > 0;
		
	}
	
	public boolean isInPosition(Position position) {
		return this.pos.equals(position);
	}
	
	public void update() {
		if(!isAlive()) return;
		
		this.cycleCounter++;//continúa el juego,siguiente ciclo
		if(this.cycleCounter==FREQUENCY){	//si pasan 3 ciclos
			game.addCoins(10);
			this.cycleCounter = 0; //reinicia el contador de ciclos
		}
		
	}
	
	public String getIcon() {
		return String.format("S[%02d]", health);
	}
	
	
	public static String getDescription() {
		return String.format("[S]unflower: cost= '%d" suncoins, damage='%d', endurance='%d', COST,DAMAGE,INITIAL_HEALTH);
	}
	
	public void receiveDamage(int damage) { 
		this.health -= damage;
}
	
}