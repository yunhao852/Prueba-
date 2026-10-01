package utils;

import pvz.logic.Game;

public class Position {
private int col;
private int row;

public Position(int row, int col) {
	this.row=row;
	this.col=col;
}

public Position (Position p) {
	this.row = p.row;
	this.col = p.col;
}
public Position left() {
    return new Position(this.row, this.col - 1);
}


public boolean isInBoard() {
    return (0 <= this.row && this.row < Game.NUM_ROWS) &&  
    	   (0 <= this.col && this.col < Game.NUM_COLS);
}
}
