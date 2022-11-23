import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("  Задача - 1");
        int[] accountBook = generateRandomArray();
        System.out.println(Arrays.toString(accountBook));
        int sum = 0;
        for (int paymentDay : accountBook) {
            sum = sum + paymentDay;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println("  Задача - 2");

        int minPayment = 200_001;
        int maxPayment = 99_999;
        for (int paymentDay : accountBook) {
            if (paymentDay < minPayment) {
                minPayment = paymentDay;
            }
            if (paymentDay > maxPayment) {
                maxPayment = paymentDay;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minPayment + " рублей. Максимальная сумма трат за день составила " + maxPayment + " рублей.");
        System.out.println("  Задача - 3");

        double average = (double) sum / accountBook.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
        System.out.println(" Задача - 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] accountBook = new int[30];
        for (int i = 0; i < accountBook.length; i++) {
            accountBook[i] = random.nextInt(100_000) + 100_000;
        }
        return accountBook;
    }

}