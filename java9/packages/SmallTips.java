package packages;

import java.util.Optional;

/**
 * @Author：chuhelan
 * @Package：packages
 * @Project：jdk17
 * @name：SmallTips
 * @Date：7/17/2023 10:52 AM
 * @Filename：SmallTips
 */
public class SmallTips {
    public static void main(String[] args) {
//        在Java9中新增了一些更加方便的操作
        String str = null;
        Optional.ofNullable(str).ifPresentOrElse(s -> {
            System.out.println("被包装的元素为：" + s);
        }, () -> {
            System.out.println("被包装的元素为null");
        });
    }
}
