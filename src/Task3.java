import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {10, 11, 12, 13};
        int[] array3 = {1, 1, 3, 3, 5, 5};

        int[] arrayResult1 = arrayMoveOne(array1);
        System.out.println("\nСдвигаем элементы массива " + Arrays.toString(array1) + " на один элемент вперед по кругу ->  " + Arrays.toString(arrayResult1));

        System.out.print("\nЗаменяем дубликаты на нули в массиве " + Arrays.toString(array3));
        deleteDuplicates(array3);
        System.out.println(" результат ->  " + Arrays.toString(array3));

        System.out.println("\nПоочередное слияние элементов массивов " + Arrays.toString(array1) + " и " + Arrays.toString(array2) + " результат ->  " + Arrays.toString(arrayMerging(array1, array2)));

    }

    public static int[] arrayMoveOne(int[] array) {
        int[] tempArray = new int[array.length];
        tempArray[0] = array[array.length - 1];
//        for (int i = 0; i < array.length - 1; i++) {
//            tempArray[i+1] = array[i];
//        }
        System.arraycopy(array, 0, tempArray, 1, array.length - 1);
        return tempArray;
    }

    public static void deleteDuplicates(int[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = 0;
                }
            }
        }

    }

    public static int[] arrayMerging(int[] array1, int[] array2) {
        int[] arrayResult = new int[array1.length + array2.length];
        int[] shortArray = array1;
        if (array1.length > array2.length) {
            shortArray = array2;
        }
        int counter1 = 0;
        int counter2 = 1;
        for (int i = 0; i < shortArray.length; i++) {
            arrayResult[counter1] = array1[i];
            counter1 += 2;
            arrayResult[counter2] = array2[i];
            counter2 += 2;
        }
        if (array1.length > array2.length) {
            System.arraycopy(array1, shortArray.length, arrayResult, shortArray.length * 2, array1.length - array2.length);
        } else {
            System.arraycopy(array2, shortArray.length, arrayResult, shortArray.length * 2, array2.length - array1.length);
        }
        return arrayResult;
    }
}
