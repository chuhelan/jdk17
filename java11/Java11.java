import java.util.function.Consumer;

/**
 * @Author：chuhelan
 * @Package：PACKAGE_NAME
 * @Project：jdk17
 * @name：Java11
 * @Date：7/17/2023 11:09 AM
 * @Filename：Java11
 */
public class Java11 {
    public static void main(String[] args) {
        Consumer<String> consumer = (var s) -> {
            System.out.println(s);
        };
        consumer.accept("AAA");

        String str = "ad";
        System.out.println(str.isEmpty());

        String str2 = "       ";
        System.out.println(str2.isBlank());

        String str3 = "CQ CQ DE BD4WAR PSE K. ";
        System.out.println(str3.repeat(3));

        String str4 = "AB\nDE\nF";
        System.out.println(str4);
        str4.lines().forEach(System.out::println);

        String str5 = " A B C D ";
        System.out.println(str5.strip());//去除首尾空格
        System.out.println(str5.stripLeading());//去除首部空格
        System.out.println(str5.stripTrailing());//去除尾部空格
    }
}
