package utils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class IOUtil {
    public static List<String> readTextFileByLines(URL fileUrl) throws IOException, URISyntaxException {
        List<String> lines = Files.readAllLines(Paths.get(fileUrl.toURI()));
        return lines;
    }

    public static void writeToTextFile(URL fileUrl, String content) throws IOException, URISyntaxException {
        Files.write(Paths.get(fileUrl.toURI()), content.getBytes(), StandardOpenOption.CREATE);
    }
}
