package Task9;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Run {
    public static void main(String[] args) throws IOException {
        File in = new File("prose.txt");
        File out = new File("proseChars.txt");
        out.createNewFile();
        PrintWriter printWriter = new PrintWriter(out);

        BufferedReader bufferedReader = new BufferedReader(new FileReader(in));
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
            printWriter.println(characterIntegerEntry.getKey().toString()+" - "+ characterIntegerEntry.getValue());
        }
        printWriter.close();

    }

    public static void addChar(Character cha, Map<Character, Integer> mapOfChars) {
        if (mapOfChars.containsKey(cha)) {
            mapOfChars.put(cha, mapOfChars.get(cha) + 1);
        } else {
            mapOfChars.put(cha, 1);
        }
    }
}
