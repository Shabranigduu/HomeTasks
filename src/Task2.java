import java.util.Scanner;

public class Task2 {

//    Вычисление високосного года

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = 0;
        String string;
        while (true) {
            System.out.println("Введите год для проверки на високосность");
            while (true) {
                while (!sc.hasNextInt()) {
                    System.out.println("Вы ввели какую-то дичь. Попробуйте еще раз ввести год");
                    sc.next();
                }
                year = sc.nextInt();
                if (year >= 0) {
                    break;
                } else {
                    System.out.println("Вы ввели отрицательное число. Попробуйте еще раз");
                }
            }
            if (year % 4 == 0 && !(year % 100 == 0 && year % 400 != 0)) {
                System.out.println(year + " является високосным");
            } else {
                System.out.println(year + " не является високосным");
            }
            System.out.println("Для выхода напиште \"выход\" или \"в\". Для продолжения напишите любой другой текст");
            string = sc.next();
            if (string.equalsIgnoreCase("в") || string.equalsIgnoreCase("выход")){
                break;
            }else System.out.println("продолжаем");
        }
    }
}
