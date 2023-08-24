import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("\nСложение двух чисел.\n");
        sumOfNumber();
        System.out.println("\nСлучайное число с заданной границей диапазона.\n");
        randomNumber();
    }

    public static void sumOfNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        while (!sc.hasNextInt()) {
            System.out.println("Вы ввели какую-то дичь. Попробуйте еще раз ввести первое число");
            sc.next();
        }
        int firstNumber = sc.nextInt();
        System.out.print("Введите второе число: ");
        while (!sc.hasNextInt()) {
            System.out.println("Вы ввели какую-то дичь. Попробуйте еще раз ввести второе число");
            sc.next();
        }
        int secondNumber = sc.nextInt();
        System.out.println("Результат: " + (firstNumber + secondNumber));
        sc.close();
    }

    public static void randomNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите верхнюю границу для случайного числа: ");
        while (!sc.hasNextInt()) {
            System.out.println("Вы ввели какую-то дичь. Попробуйте еще раз ввести число");
            sc.next();
        }
        int boundNumber = sc.nextInt();
        if (boundNumber < 0) {
            System.out.println("Число должно быть положительным");
            randomNumber();
        } else {
            Random random = new Random();
            int randomNumber = random.nextInt(boundNumber + 1);
            System.out.println(randomNumber);
        }
        sc.close();
    }
}
