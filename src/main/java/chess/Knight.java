package chess;


public class Knight extends ChessPiece {

    public Knight(Player player) {
        super(player);
    }

    @Override
    public int getMaxNumberOfPieces() {
        return 2;
    }

    public String getSymbol() {
        return Player.White == getPlayer() ? "kn" : "uʞ";
    }

}
