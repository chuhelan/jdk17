package test.moduleb;

import test.modulea.User;

import java.lang.reflect.Field;

/**
 * @Author：chuhelan
 * @Package：com.moduleb
 * @Project：jdk17
 * @name：Main
 * @Date：6/22/2023 4:15 PM
 * @Filename：Main
 */
public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        User user = new User("abc",123);
        System.out.println(user);

        Class<User> userClass = User.class;
        Field field = userClass.getDeclaredField("name");
        field.setAccessible(true);
        System.out.println(field.get(user));
    }
}
