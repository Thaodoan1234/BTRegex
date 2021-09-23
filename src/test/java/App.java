import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
        public static void main(String[] args) {
            String text1 = "Hello java regex 5-11-2021, hello world 15/11/2021, 13/8/aaaa";
            Pattern pattern = Pattern.compile("\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}");
            Matcher matcher = pattern.matcher(text1);

            System.out.println("Ngày tháng trong chuỗi text1: " + text1);
            while (matcher.find()) {
                System.out.println(text1.substring(matcher.start(), matcher.end()));
            }
        }
    }

