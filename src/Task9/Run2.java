package Task9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Run2 {
    public static void main(String[] args) {
        Path in = Path.of("resources", "random_numbers.txt");
        Path out = Path.of("resources", "sorted_numbers.txt");
        if (!Files.exists(in)) {
            try {
                Files.createFile(in);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        if (!Files.exists(out)) {
            try {
                Files.createFile(out);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        List<String> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            list.add("" + random.nextInt());
        }
        List<String> listToSort;
        List<Integer> sortedList = new ArrayList<>();
        List<String> sortedList2 = new ArrayList<>();

        try {
            Files.write(in, list);
            listToSort = Files.readAllLines(in);
            for (String s : listToSort) {
                sortedList.add(Integer.parseInt(s));
            }
            Collections.sort(sortedList);
            for (Integer integer : sortedList) {
                sortedList2.add(integer.toString());
            }
            Files.write(out, sortedList2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
