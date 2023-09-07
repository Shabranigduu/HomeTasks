package IndependentTask8;

import java.util.*;

public class Run {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 7, 3, -1, 2, 3, 7, 2, 15, 15);
        System.out.println(listOdd(list));
        System.out.println(countUnique(list));
        Map<String, String> map = Map.of("Marty", "Stepp", "Stuart", "Reges", "Jessica", "Miller", "Amanda", "Camp", "Hal", "Perkins");
        System.out.println(isUnique(map));
        Map<String, String> map2 = Map.of("Kendrick", "Perkins", "Stuart", "Reges", "Jessica", "Miller", "Bruce", "Reges", "Hal", "Perkins");
        System.out.println(isUnique(map2));

    }

    public static List<Integer> listOdd(List<Integer> list) {
        if (!list.isEmpty()) {
            List<Integer> integers = new ArrayList<>();
            for (Integer integer : list) {
                if (!(integer % 2 == 0)) {
                    integers.add(integer);
                }
            }
            return integers;
        } else return new ArrayList<>();
    }

    public static int countUnique(List<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        } else {
            Set<Integer> integers = new HashSet<>(list);
            return integers.size();
        }
    }

    public static boolean isUnique(Map<String, String> map) {
        Set<String> valuesOfMap = new HashSet<>(map.values());
        return map.size() == valuesOfMap.size();
    }
}
