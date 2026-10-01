package utils;

import pvz.logic.Game;

public class Position{
	
	private int col;
	private int row;
	
	public Position(int col, int row) {
		this.col = col;
		this.row =  row;
	}
	
	public Position(Position p) {
        this.col = p.col;
        this.row = p.row;
    }
	
	
	//devuelve la posición a su izquierda
	public Position left() {
        return new Position(this.col - 1, this.row);
    }
	
	//comprueba si la posición está dentro del tablero
	public boolean isInBoard() {
        return (0 <= this.col && this.col < Game.NUM_COLS) &&  
        	   (0 <= this.row && this.row < Game.NUM_ROWS);
    }
	
	
}
	