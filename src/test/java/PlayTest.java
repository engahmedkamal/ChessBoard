import exception.InvalidNumberOfPiecesException;
import org.junit.Assert;
import org.junit.Test;

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
        URL out = PlayTest.class.getResource("chess-test.txt");
        play.getGameState(out);

        URL outCheck = PlayTest.class.getResource("chess-test.txt");
        Play playOutCheck = new Play();
        playOutCheck.startGame(outCheck);

        Assert.assertTrue(play.getGameStateString().equals(playOutCheck.getGameStateString()));

    }
}
