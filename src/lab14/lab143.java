package lab14;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lab143 {
    public static void main(String[] args) {
        List<String> text = new ArrayList<>();
        text.add("25.98 USD.");
        text.add("44 ERR.");
        text.add("1200 RUB.");
        text.add("0.004 EU.");
        text.add("15.50 USD.");

        List<String> validLines = extractValidPrices(text);

        for (String line : validLines) {
            System.out.println(line);
        }
    }

    public static List<String> extractValidPrices(List<String> text) {
        List<String> validLines = new ArrayList<>();
        String pattern = "\\d+\\.\\d+ (USD|RUB|EU)";

        for (String line : text) {
            Matcher matcher = Pattern.compile(pattern).matcher(line);
            if (matcher.find()) {
                validLines.add(line);
            }
        }

        return validLines;
    }
}
