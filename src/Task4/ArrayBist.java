package Task4;

import java.util.Arrays;

public class ArrayBist {

    private int size;
    private int[] array = new int[0];

    public void add(int e) {
        size += 1;
        array = Arrays.copyOf(array, size);
        array[size - 1] = e;
    }

    public void add(int[] arrayOfInt) {
        if (arrayOfInt.length != 0) {
            for (int i : arrayOfInt) {
                this.add(i);
            }
        } else {
            System.out.println("Вносимый массив пуст");
        }
    }

    public int get(int index) {
        if (index > size - 1 || index < 0) {
            System.out.println("Элемент с индексом [" + index + "] находится за рамками данного массива");
            return 0; // по идее надо вместо return надо делать throw, но я плохо помню эту тему и не хотел так усложнять код
        } else {
            return array[index];
        }
    }

    public void remove(int index) {
        if (index > size - 1 || index < 0) {
            System.out.println("Элемент с индексом [" + index + "] находится за рамками данного массива");
        } else {
            size -= 1;
            int[] tempArray = new int[size];
            int count = 0;
            for (int i = 0; i < size; i++) {
                if (i == index) {
                    count++;
                }
                tempArray[i] = array[count];
                count++;

            }
            array = Arrays.copyOf(tempArray, size);
        }
    }

    public void print() {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public int length() {
        return size;
    }
}
