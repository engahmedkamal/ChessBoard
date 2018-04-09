import exception.InvalidNumberOfPiecesException;
import org.junit.Test;
import utils.IOUtil;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class PlayTest {
    @Test(expected = InvalidNumberOfPiecesException.class)
    public void InvalidNumberOfPieces() throws IOException, URISyntaxException {
        URL input = PlayTest.class.getResource("chess-invalidPieces.txt");
        Play play = new Play();
        play.startGame(input);
    }

    @Test
    public void getGameState() throws IOException, URISyntaxException {
        URL input = PlayTest.class.getResource("chess-startup.txt");
        Play play = new Play();
        play.startGame(input);
    }
}
