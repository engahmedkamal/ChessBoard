package exception;

import chess.ChessPiece;

public class InvalidNumberOfPiecesException extends RuntimeException {
    private ChessPiece piece;
    public InvalidNumberOfPiecesException(ChessPiece piece){
        this.piece = piece;
    }
    public String getMessage() {
        return piece.getClass().getName() + " Max Number Of Pieces " + piece.getPlayer() + " is " + piece.getMaxNumberOfPieces();
    }
}
