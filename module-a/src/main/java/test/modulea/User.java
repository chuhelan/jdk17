package test.modulea;

/**
 * @Author：chuhelan
 * @Package：com.modulea
 * @Project：jdk17
 * @name：User
 * @Date：6/22/2023 4:16 PM
 * @Filename：User
 */
public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
