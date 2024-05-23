package java1.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateSeeker {
    public static void main(String[] args) throws IOException {
        Path dir = Paths.get("src/main/resources/files");
        findFilesFromFolders(dir);
    }

    private static void findFilesFromFolders(Path dir) throws IOException {
        List<Path> pathStream = Files.list(dir).toList();

        for (Path path : pathStream) {

            if (Files.isDirectory(path)) {
                findFilesFromFolders(path);
                continue;
            }

            readFile(path);
        }

    }

    private static void readFile(Path path) throws IOException {
        try (BufferedReader file = Files.newBufferedReader(path)) {
            String line;
            while ((line = file.readLine()) != null) {
                patternMather("[0-3]\\d.[0-1]\\d.[1,2][0,9]\\d{2}", line);
            }
        }
    }

    private static void patternMather(String pattern, String line) {
        Pattern p  = Pattern.compile(pattern);
        Matcher m = p.matcher(line);
        while (m.find()) {
            System.out.println("date: " + m.group());
        }
    }
}
