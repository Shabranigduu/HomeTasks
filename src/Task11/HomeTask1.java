package Task11;

import java.util.Scanner;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HomeTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExecutorService executor = Executors.newSingleThreadExecutor();

        while (true) {
            System.out.print("Вводите число для передачи в поток (для выхода введите отрицательное число): ");
            int sec = sc.nextInt();
            if (sec < 0) {
                break;
            }
                        executor.execute(() -> {
                try {
                    Thread.sleep(sec * 1000);
                    System.out.println("Я спал " + sec + " секунд");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        sc.close();
        executor.shutdown();
    }
}
