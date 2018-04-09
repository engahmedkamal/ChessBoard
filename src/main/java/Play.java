import chess.ChessBoard;
import exception.InvalidNumberOfPiecesException;
import utils.IOUtil;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

public class Play {
    private ChessBoard chessBoard = new ChessBoard();

    public void startGame(URL fileUrl) throws InvalidNumberOfPiecesException, IOException, URISyntaxException {
        List<String> inputLines = IOUtil.readTextFileByLines(fileUrl);
        chessBoard.initializeChessBoard(inputLines);
    }

    public String getGameStateString() {
        return chessBoard.getChessBoardState();
    }

    public void getGameState(URL fileUrl) throws IOException, URISyntaxException {
        String output = chessBoard.getChessBoardState();
        IOUtil.writeToTextFile(fileUrl, output);
    }
}
