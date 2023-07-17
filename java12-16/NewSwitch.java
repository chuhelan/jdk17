/**
 * @Author：chuhelan
 * @Package：PACKAGE_NAME
 * @Project：jdk17
 * @name：NewSwitch
 * @Date：7/17/2023 5:38 PM
 * @Filename：NewSwitch
 */
public class NewSwitch {
    public static void main(String[] args) {
        System.out.println(grade(98));
        System.out.println(grade(45));
    }

    public static String grade(int score) {
        score /= 10;
        return switch (score) {
            case 10, 9 -> "优秀";
            case 8, 7 -> "良好";
            case 6 -> "及格";
            default -> {
                //注意处理完成后需要返回最总结果，但是这样并不是使用return，而是使用yield关键字
                System.out.println("这里写执行的操作");
                yield "不及格";
            }
        };
    }
}
