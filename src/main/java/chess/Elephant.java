package chess;

public class Elephant extends ChessPiece {
    public Elephant(Player player) {
        super(player);
    }

    @Override
    public int getMaxNumberOfPieces() {
        return 2;
    }

    public String getSymbol() {
        return Player.White == getPlayer() ? "bi" : "ıq";
    }
}
