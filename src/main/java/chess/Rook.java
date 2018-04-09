package chess;


public class Rook extends ChessPiece {

    public Rook(Player player) {
        super(player);
    }

    @Override
    public int getMaxNumberOfPieces() {
        return 2;
    }

    public String getSymbol() {
        return Player.White == getPlayer() ? "ro" : "oɹ";
    }

}
