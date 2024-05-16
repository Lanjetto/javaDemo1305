package day4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class DateParser {

    public static void main(String[] args) throws IOException {
        parseFiles("resources/files");
    }

    public static void parseFiles(String folderPath) throws IOException {
        try (Stream<Path> paths = Files.walk(Path.of(folderPath))) {
            paths.filter(Files::isRegularFile)
                    .forEach(file -> {
                        try {
                            String content = Files.readString(file);
                            Pattern pattern = Pattern.compile("\\b\\d{2}\\.\\d{2}\\.\\d{4}\\b");
                            Matcher matcher = pattern.matcher(content);

                            System.out.println("Dates in " + file.getFileName() + ":");
                            while (matcher.find()) {
                                System.out.println(matcher.group());
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
        }
    }
}
