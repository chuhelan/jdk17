/**
 * @Author：chuhelan
 * @Package：PACKAGE_NAME
 * @Project：jdk17
 * @name：InstanceOf
 * @Date：7/17/2023 6:00 PM
 * @Filename：InstanceOf
 */
public class InstanceOf {
    public static void main(String[] args) {
        Student a = new Student("A"),
                b = new Student("B");
        System.out.println(a.equals(b));

        Student c = new Student("A"),
                d = new Student("A");
        System.out.println(c.equals(d));
    }
}

class Student {
    private final String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Student student) {
            return student.name.equals(this.name);
        }
        return false;
    }
}
