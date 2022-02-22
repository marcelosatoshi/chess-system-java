package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Root extends ChessPiece {

	public Root(Board board, Color color) {
		super(board, color);
	}
	
	public String toString() {
		return "R";
	}
	

}
