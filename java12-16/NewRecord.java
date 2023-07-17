/**
 * @Author：chuhelan
 * @Package：PACKAGE_NAME
 * @Project：jdk17
 * @name：NewRecord
 * @Date：7/17/2023 7:59 PM
 * @Filename：NewRecord
 */
public record NewRecord(String username,String password) {
    public static void main(String[] args) {
        NewRecord account = new NewRecord("username", "password");
        System.out.println(account.username);
        System.out.println(account.toString());
    }
}
