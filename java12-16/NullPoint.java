/**
 * @Author：chuhelan
 * @Package：PACKAGE_NAME
 * @Project：jdk17
 * @name：NullPoint
 * @Date：7/17/2023 7:54 PM
 * @Filename：NullPoint
 */
public class NullPoint {
    public static void main(String[] args) {
        test("aaa", null);
    }

    public static void test(String a, String b) {
        int length = a.length() + b.length();
        System.out.println(length);
    }
}
