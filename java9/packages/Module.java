package packages;

import java.lang.reflect.Field;

/**
 * @Author：chuhelan
 * @Package：PACKAGE_NAME
 * @Project：jdk17
 * @name：Module
 * @Date：6/22/2023 3:40 PM
 * @Filename：Module
 */
public class Module {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException{
        Class<String> stringClass = String.class;
        Field field = stringClass.getDeclaredField("value");//这里通过反射来获取String类中的value字段
        field.setAccessible(true);//由于是private访问权限，所以我们修改一下
        System.out.println(field.get("ABED"));
    }
}