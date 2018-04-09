package chess;

public class Bishop extends ChessPiece {
    public Bishop(Player player) {
        super(player);
    }

    @Override
    public int getMaxNumberOfPieces() {
        return 8;
    }

    public String getSymbol() {
        return Player.White == getPlayer() ? "pa" : "ɐd";
    }
}
