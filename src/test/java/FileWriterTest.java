import org.junit.Assert;
import org.junit.Test;
import utils.IOUtil;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileWriterTest {
    @Test
    public void testFileWriterChessStartup() throws IOException, URISyntaxException {
        URL outputResource = FileWriterTest.class.getResource("test.txt");
        IOUtil.writeToTextFile(outputResource,"test");
        Assert.assertTrue(Paths.get(outputResource.toURI()).toFile().exists());
    }

//    @Test
//    public void testFileWriterChess01() throws IOException, URISyntaxException {
//        URL resource = FileWriterTest.class.getResource("chess-01.txt");
//        List<String> lines = IOUtil.readTextFileByLines(resource);
//        Assert.assertTrue(lines.size()==9);
//    }
//
//    @Test
//    public void testFileWriterChess02() throws IOException, URISyntaxException {
//        URL resource = FileWriterTest.class.getResource("chess-02.txt");
//        List<String> lines = IOUtil.readTextFileByLines(resource);
//        Assert.assertTrue(lines.size()==9);
//    }
//
//    @Test
//    public void testFileWriterChess03() throws IOException, URISyntaxException {
//        URL resource = FileWriterTest.class.getResource("chess-03.txt");
//        List<String> lines = IOUtil.readTextFileByLines(resource);
//        Assert.assertTrue(lines.size()==9);
//    }
}
