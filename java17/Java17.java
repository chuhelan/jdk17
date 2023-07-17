/**
 * @Author：chuhelan
 * @Package：PACKAGE_NAME
 * @Project：jdk17
 * @name：Java17
 * @Date：7/17/2023 8:06 PM
 * @Filename：Java17
 */
//密封类型
public class Java17 {

}

// 在class关键字前加sealed关键字，表示此类为密封类型，permits后面跟上允许继承的类型，多个子类使用逗号隔开
public sealed class A permits B{

}