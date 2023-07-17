package packages;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @Author：chuhelan
 * @Package：packages
 * @Project：jdk17
 * @name：StreamApi
 * @Date：7/17/2023 9:36 AM
 * @Filename：StreamApi
 */
public class StreamApi {
    public static void main(String[] args) throws IOException {
        Stream
                .of("A", "V", "R", "u", "u", "R")//这里我们可以直接将一些原色封装到steam中
                .filter(s -> s.equals("R"))//通过过滤器过滤
                .distinct()//去重
                .forEach(System.out::println);//最后打印

//        Stream
//                .of(null)   //如果传入null会报错
//                .forEach(System.out::println);

        Stream
                .ofNullable(null)   //使用新增的offNullable方法，这样就不会报错了，不过这样的话流里面就没东西了
                .forEach(System.out::println);


        //Steam通过迭代快速生成一组数据 java9新增允许结束迭代
        Stream
                //java8只能像这样生成无限的流，第一个参数是种子，然后就是后面的UnaryOperator的参数i一开始的值，最后会返回一个值作为i的新值
                .iterate(0, i -> i <= 20, i -> i + 1)
                .limit(30)  //这里限制生成20个
                .forEach(System.out::println);

        //Steam新增了对数据的截断操作，比如我们希望再读取到某个元素时截断，不再继续操作后面的元素
        Stream
                .iterate(0, i -> i <= 20, i -> i + 1)
//                .dropWhile(i -> i >= 10)
                .takeWhile(i -> i < 10)
                .forEach(System.err::println);

        //Try-with-resource语法现在不需要再完整的一个变量了，我们可以直接将现有的变量丢进去
        InputStream inputStream = Files.newInputStream(Paths.get("README.md"));
        try(inputStream) {
            for (int i = 0; i < 100; i++) {
                System.out.print((char)inputStream.read());
            }
        }

    }
}
