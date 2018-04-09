package chess;

import exception.InvalidNumberOfPiecesException;

import java.util.HashMap;
import java.util.List;

public class ChessBoard {
    private ChessPiece[][] pieces = new ChessPiece[8][8];

    private static HashMap<String, ChessPiece> piecesMap = new HashMap<>();

    static {
        piecesMap.put("pa", new Bishop(Player.White));
        piecesMap.put("ɐd", new Bishop(Player.Black));

        piecesMap.put("ro", new Rook(Player.White));
        piecesMap.put("oɹ", new Rook(Player.Black));

        piecesMap.put("kn", new Knight(Player.White));
        piecesMap.put("uʞ", new Knight(Player.Black));

        piecesMap.put("bi", new Elephant(Player.White));
        piecesMap.put("ıq", new Elephant(Player.Black));

        piecesMap.put("qu", new Queen(Player.White));
        piecesMap.put("nb", new Queen(Player.Black));

        piecesMap.put("ki", new King(Player.White));
        piecesMap.put("ıʞ", new King(Player.Black));
    }

    public void initializeChessBoard(List<String> lines) throws InvalidNumberOfPiecesException {
        HashMap<ChessPiece, Integer> piecesCount = new HashMap<>();
        for (int i = 0; i < lines.size() - 1; i++) {
            String cells[] = lines.get(i).split("\\|");
            for (int j = 1; j < cells.length; j++) {
                ChessPiece piece = piecesMap.get(cells[j]);
                if (piece != null) {
                    if (!piecesCount.containsKey(piece)) {
                        piecesCount.put(piece, 1);
                    } else {
                        int count = piecesCount.get(piece);
                        if (piece.getMaxNumberOfPieces() == count) {
                            throw new InvalidNumberOfPiecesException(piece);
                        }
                        piecesCount.put(piece, count + 1);
                    }
                    pieces[j - 1][i] = piece;
                }
            }
        }
    }

    public String getChessBoardState() {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < pieces.length; i++) {
            output.append(8 - i);
            for (int j = 0; j < pieces.length; j++) {
                output.append("|" + (pieces[j][i] == null ? "  " : pieces[j][i]));
            }
            output.append("|\n");
        }
        output.append("   a  b  c  d  e  f  g  h");
        return output.toString();
    }
}
