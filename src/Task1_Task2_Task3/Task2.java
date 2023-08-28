package Task1_Task2_Task3;

import java.util.Scanner;

public class Task2 {

//    Вычисление високосного года

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год для проверки на високосность");
        int year = 0;
        boolean chekPositive = true;
        while (chekPositive) {
            while (!sc.hasNextInt()) {
                System.out.println("Вы ввели какую-то дичь. Попробуйте еще раз ввести год");
                sc.next();
            }
            year = sc.nextInt();
            if (year >= 0) chekPositive = false;
            else System.out.println("Вы ввели отрицательное число. Попробуйте еще раз");
        }
        if (year%4 == 0){
            if (year%100 == 0 && year%400 != 0) {
                System.out.println(year + " не является високосным");
                return;
            }
            System.out.println(year + " является високосным");
        } else System.out.println(year + " не является високосным");
    }
}
