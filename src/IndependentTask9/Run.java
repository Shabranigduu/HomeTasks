package IndependentTask9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Run {
    public static void main(String[] args) {
        Path text = Path.of("resources", "text.txt");
        printVowelWords(text);
        System.out.println();
        printWordsStartEnd(text);
    }

    static void printVowelWords(Path file) {
        try {
            Files.readAllLines(file).forEach(str -> {
                String[] singleWords = str.split("[^a-zA-Z0-9а-яА-Я]");
                for (String singleWord : singleWords) {
                    if (singleWord.matches(("^(?ui:[аеёиоуыэюя]).*"))) {
                        System.out.println(singleWord);
                    }
                }
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void printWordsStartEnd(Path file) {
        String regex = "\\b\\p{L}*(\\p{L})\\b\\W+\\b\\1\\p{L}*\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE | Pattern.UNICODE_CHARACTER_CLASS | Pattern.CASE_INSENSITIVE);
        try {
            Matcher matcher = pattern.matcher(Files.readString(file));
            while (matcher.find()) {
                String match = matcher.group().replaceAll("[\\p{Punct}\\t\\s]+", " ");
                System.out.println(match);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
