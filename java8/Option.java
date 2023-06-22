import java.util.Optional;

/**
 * @Author：chuhelan
 * @Package：PACKAGE_NAME
 * @Project：jdk17
 * @name：Option
 * @Date：6/22/2023 2:51 PM
 * @Filename：Option
 */
public class Option {

    public static void main(String[] args) {
        hello(null);
        hello("Abcs");
    }

    public static void hello(String str) {
        Optional.ofNullable(str).ifPresent(s -> System.out.println(str.toLowerCase()));
        System.out.println(Optional.ofNullable(str).orElse("its null"));
    }
}
