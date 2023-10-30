package lab8;

public class eightseven {
    public static void main(String[] args) {
        int n = 72; // Замените на ваше натуральное число n.

        if (n <= 1) {
            System.out.println("Введите натуральное число больше 1.");
            return;
        }

        System.out.print("Простые множители числа " + n + ": ");

        for (int divisor = 2; divisor <= n; divisor++) {
            while (n % divisor == 0) {
                System.out.print(divisor + " ");
                n /= divisor;
            }
        }
    }
}
