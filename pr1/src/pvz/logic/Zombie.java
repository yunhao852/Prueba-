package pvz.logic;

import pvz.logic.Game;
import utils.Position;
import pvz.view.Messages;
public class Zombie {
	public static final int ENDURANCE= 5;
	public static final int DAMAGE= 1;
	public static final int SPEED= 2;
	
	private Position position;
	private int endurance;
	private Game game;
	private int cycles;
	
	public Zombie(Position position, Game game) {
		this.position= position;
		this.game = game;
		this.cycles =0;
		this.endurance = ENDURANCE;
	}
	
	public boolean isAlive() {
		return endurance>0;
	}
	public boolean isInPosition (Position p) {
		return position.equals(p); //Compara posición del zombi con la "p" que se le pasa
	}
	public String getIcon() {
		return String.format (Messages.ZOMBIE_ICON, endurance);
	}
	public void receivedAttack(int damage) {
		endurance= endurance-damage;
	}
	
	
	

}
