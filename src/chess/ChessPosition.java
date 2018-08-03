package chess;

import boardgame.Position;

public class ChessPosition {

	private char col;
	private int row;

	public ChessPosition(char col, int row) {
		if (col < 'a' || col > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating Chessposition. Valid values are from a1 to h8.");
		}
		this.col = col;
		this.row = row;
	}

	public char getCol() {
		return this.col;
	}

	public int getRow() {
		return this.row;
	}

	protected Position toPosition() {
		return new Position(8 - this.row, this.col - 'a');
	}

	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char) ('a' - position.getColumn()), 8 - position.getRow());
	}

	@Override
	public String toString() {
		return "" + this.col + this.row;
	}
}
