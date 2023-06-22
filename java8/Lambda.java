/**
 * @author WineLee
 */
public class Lambda {
    public static void main(String[] args) {

        // java8的写法
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Lambda in JDK 8. ");
            }
        });
        thread.start();

        //java8之后的写法
        Thread thread1 = new Thread(() -> System.out.println("Lambda after JDK 8."));
        thread1.start();

        Runnable runnable = () -> System.out.println("Runnable!");
        runnable.run();
    }
}
