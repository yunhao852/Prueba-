package pvz.logic;

import utils.Position;
import pvz.logic.Game;
import pvz.view.Messages;

public class Sunflower {
	public static final int ENDURANCE = 1;
	public static final int COST = 20;
	public static final int DAMAGE=0;
	
	
	private Position position;
	private int endurance;
	private Game game;
	private int cycles;
	
	public Sunflower(Position position, Game game) {
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
		return String.format (Messages.SUNFLOWER_ICON, endurance);
	}
	public static String getDescription() {
		return String.format(Messages.SUNFLOWER_DESCRIPTION, COST, DAMAGE, ENDURANCE);
		
	}
	public void receivedAttack(int damage) {
		endurance= endurance-damage;
	}
	
}