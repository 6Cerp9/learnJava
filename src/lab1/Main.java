package lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {            System.out.print("Введите элемент " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();        }
        int sum = 0;
        for (int i = 0; i < size; i++) {            sum += numbers[i];
        }
        double average = (double) sum / size;
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое: " + average);
        int i = 0;
        do {
            System.out.print("Введите элемент " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
            i++;
        } while (i < size);
        i=0;
        while (i < size){
            System.out.println(numbers[i]);
            i++;
        }
        sum = 0;
        int max = numbers[0];
        int min = numbers[0];
        i = 0;        while (i < size) {
            sum += numbers[i];
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
            i++;
        }
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Аргументы командной строки:");
        for ( i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
        }
        for ( i = 1; i <= 10; i++) {
            double harmon = 1.0 / i;
            System.out.printf("1/%d = %.2f%n", i, harmon);
        }
        System.out.println("число для подсчета !");
        int number=sc.nextInt();
        long factorial = calculate(number);
        System.out.println(number + "! = " + factorial);
        sc.close();
    }    public static long calculate(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }        return result;
    }
}