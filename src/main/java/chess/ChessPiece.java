package chess;

public abstract class ChessPiece {

    private Player player;
    public abstract String getSymbol();

    public ChessPiece(Player player) {
        this.player = player;
    }

    public abstract int getMaxNumberOfPieces();

    @Override
    public String toString() {
        return String.valueOf(getSymbol());
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public boolean equals(ChessPiece other) {
        return getSymbol().equals(other.getSymbol());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        for (int i = 0; i < getSymbol().length(); i++) {
            hash = hash * 31 + getSymbol().charAt(i);
        }
        return hash;
    }
}
