package Task4;

public class Run {
    public static void main(String[] args) {
        int[] array = {100500, 333, 696};
        int[] array1 = new int[0];
        ArrayBist dinamo = new ArrayBist();
        dinamo.print();
        dinamo.add(0);
        dinamo.add(1);
        dinamo.add(2);
        dinamo.add(3);
        dinamo.add(4);
        dinamo.print();
        dinamo.remove(2);
        dinamo.print();
        dinamo.remove(4);
        System.out.println(dinamo.length());
        System.out.println(dinamo.get(10));
        dinamo.add(array);
        dinamo.add(array1);
        dinamo.print();
    }
}
