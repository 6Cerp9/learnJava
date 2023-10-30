package lab8;

public class eighteight {
    public static boolean isPalindrome(String word) {
        if (word.length() <= 1) {
            return true;
        }
        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length() - 1);

        if (firstChar != lastChar) {
            return false;
        } else {
            return isPalindrome(word.substring(1, word.length() - 1));
        }
    }

    public static void main(String[] args) {
        String word = "шалаш"; // Замените на ваше слово.

        if (isPalindrome(word)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
