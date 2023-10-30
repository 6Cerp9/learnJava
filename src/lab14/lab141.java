package lab14;
import java.util.Scanner;

public class lab141 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        String pattern = "abcdefghijklmnopqrstuv18340";

        if (input.equals(pattern)) {
            System.out.println("Строка такая же");
        } else {
            System.out.println("Строка другая");
        }
    }
}


