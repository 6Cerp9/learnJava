package lab14;
import java.util.Scanner;
import java.util.regex.Pattern;

public class lab142 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите дату в формате dd/mm/yyyy: ");
        String input = scanner.nextLine();

        String pattern = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19[0-9]{2}|[2-9][0-9]{3})$";

        if (isValidDate(input, pattern)) {
            System.out.println("Введенная строка является правильной датой.");
        } else {
            System.out.println("Введенная строка не является правильной датой.");
        }
    }

    public static boolean isValidDate(String input, String pattern) {
        return Pattern.matches(pattern, input);
    }
}