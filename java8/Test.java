/**
 * @Author：chuhelan
 * @Package：PACKAGE_NAME
 * @Project：jdk17
 * @name：Abstract
 * @Date：6/21/2023 11:40 PM
 * @Filename：Abstract
 */
@FunctionalInterface
public interface Test {
    String test(Integer i);
}

class Main {
    public static void main(String[] args) {
        //使用类名::方法名称的形式直接引用一个已有的方法作为实现
        Test test = Main::impl;
        System.out.println(test.test(1));
    }

    public static String impl(Integer n) {
        return "The number is " + n;
    }
}