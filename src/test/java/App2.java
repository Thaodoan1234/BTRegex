import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App2 {
    public static void main(String[] args) {
        String text1 = "Danh sách email: lananh123@gmail.com.vn, 123test@gmail.com.vn, quantran12@gmail.com, hoa_Nguyen12@gmail.com, hainguyen24@gmail.com, -my15@gmail.com";
        Pattern pattern = Pattern.compile("[a-z|A-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,8}\\.[\\w]{2,8})");
        Matcher matcher = pattern.matcher(text1);

        System.out.println("Chuỗi text1: \n" + text1);
        while (matcher.find()) {
            System.out.println(text1.substring(matcher.start(), matcher.end()));
        }

    }
}
