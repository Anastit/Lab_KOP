import java.util.*;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Enter kol-vo n:");
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        final int[] arr = new int[n];
        System.out.println("Enter element mass:");
        String[] arrItems = scanner.nextLine().split(" ");
        System.out.println("Press Enter");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        scanner.close();
        Func1 func1 = new Func1();
        System.out.println("Проверяем");
        System.out.println("Старт "+Thread.currentThread().getName());
        Thread.sleep(10000);
        new Thread(() -> {
            try {
                System.out.println("Результат "+ func1.func1(arr));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                System.out.println("Результат "+ func1.func1(arr));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                System.out.println("Результат "+ func1.func1(arr));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        System.out.println("Стоп "+Thread.currentThread().getName());
        System.out.println();
    }
}
