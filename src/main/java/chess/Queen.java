package chess;

public class Queen extends ChessPiece {
    public Queen(Player player) {
        super(player);
    }

    @Override
    public int getMaxNumberOfPieces() {
        return 1;
    }

    public String getSymbol() {
        return Player.White == getPlayer() ? "qu" : "nb";
    }
}
