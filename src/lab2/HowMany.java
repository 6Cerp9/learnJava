package lab2;
import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();
        String[] words = inputString.split(" ");
        int wordCount = words.length;
        System.out.println("Вы ввели " + wordCount + " слов(а).");
    }
}
