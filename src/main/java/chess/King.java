package chess;

public class King extends ChessPiece {

    public King(Player player) {
        super(player);
    }

    @Override
    public int getMaxNumberOfPieces() {
        return 1;
    }

    public String getSymbol() {
        return Player.White == getPlayer() ? "ki" : "ıʞ";
    }

}
