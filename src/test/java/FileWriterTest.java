import org.junit.Assert;
import org.junit.Test;
import utils.IOUtil;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.List;

public class FileWriterTest {
    @Test
    public void testFileWriterChessStartup() throws IOException, URISyntaxException {
        URL outputResource = FileWriterTest.class.getResource("FileWriterTest.txt");
        IOUtil.writeToTextFile(outputResource, "test");
        List<String> lines = IOUtil.readTextFileByLines(outputResource);
        Assert.assertTrue(lines.size() == 1 && lines.get(0).equals("test"));
    }

}
