package pvz.logic;

import utils.Position;
import pvz.logic.Game;
import pvz.view.Messages;

public class Peashooter {
public static final int ENDURANCE  = 3;
public static final int COST = 50;
public static final int DAMAGE = 1;

private Position position;
private int endurance;
private int damage;
private Game game; //Private pk no queremos que toquen estos datos desde fuera
private int cycles; //Para contar cuándo le toca actuar

public Peashooter (Position position, Game game) {
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
	return String.format (Messages.PEASHOOTER_ICON, endurance);
	}
	public static String getDescription() {
	return String.format(Messages.PEASHOOTER_DESCRIPTION, COST, DAMAGE, ENDURANCE);
	
	}
	public void receivedAttack(int damage) {
	endurance= endurance-damage;
	}



}
