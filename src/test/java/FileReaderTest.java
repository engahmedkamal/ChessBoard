import org.junit.Assert;
import org.junit.Test;
import sun.misc.ClassLoaderUtil;
import utils.IOUtil;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

public class FileReaderTest {
    @Test
    public void testFileReaderChessStartup() throws IOException, URISyntaxException {
        URL resource = FileReaderTest.class.getResource("chess-startup.txt");
        List<String> lines = IOUtil.readTextFileByLines(resource);
        Assert.assertTrue(lines.size()==9);
    }

    @Test
    public void testFileReaderChess01() throws IOException, URISyntaxException {
        URL resource = FileReaderTest.class.getResource("chess-01.txt");
        List<String> lines = IOUtil.readTextFileByLines(resource);
        Assert.assertTrue(lines.size()==9);
    }

    @Test
    public void testFileReaderChess02() throws IOException, URISyntaxException {
        URL resource = FileReaderTest.class.getResource("chess-02.txt");
        List<String> lines = IOUtil.readTextFileByLines(resource);
        Assert.assertTrue(lines.size()==9);
    }

    @Test
    public void testFileReaderChess03() throws IOException, URISyntaxException {
        URL resource = FileReaderTest.class.getResource("chess-03.txt");
        List<String> lines = IOUtil.readTextFileByLines(resource);
        Assert.assertTrue(lines.size()==9);
    }
}
