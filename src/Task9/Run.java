package Task9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Map;
import java.util.TreeMap;

public class Run {
    public static void main(String[] args) {
        Path in = Path.of("prose.txt");
        Path out = Path.of("proseChars.txt");
        try (BufferedReader bufferedReader = Files.newBufferedReader(in)) {
            StringBuilder prose = new StringBuilder();
            while (bufferedReader.ready()) {
                prose.append(bufferedReader.readLine());
            }
            String str = prose.toString().toLowerCase().replaceAll("[^а-яА-Я]", "");
            System.out.println(str);
            Map<Character, Integer> chars = new TreeMap<>();
            for (char cha : str.toCharArray()) {
                addChar(cha, chars);
            }
            for (Map.Entry<Character, Integer> characterIntegerEntry : chars.entrySet()) {
                Files.writeString(out, characterIntegerEntry.getKey().toString() + " - " + characterIntegerEntry.getValue() + "\n", StandardOpenOption.APPEND);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файла prose.txt не существует");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void addChar(Character cha, Map<Character, Integer> mapOfChars) {
        if (mapOfChars.containsKey(cha)) {
            mapOfChars.put(cha, mapOfChars.get(cha) + 1);
        } else {
            mapOfChars.put(cha, 1);
        }
    }
}
