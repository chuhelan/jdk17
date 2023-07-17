package packages;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author：chuhelan
 * @Package：packages
 * @Project：jdk17
 * @name：Map
 * @Date：7/17/2023 9:21 AM
 * @Filename：Map
 */
public class MapTest {
    public static void main(String[] args) {
        // Java9之前的写法
        Map<String, Integer> map = new HashMap<>();
        map.put("aaa", 23);
        map.put("bbb", 42);
        System.out.println(map);

        // Java9的写法
        Map<String, Integer> map2 = Map.of("aaa", 21, "bbb", 42);
        System.out.println(map2);

        Set<String> set = Set.of("vvv", "bbb", "ddd");
        List<String> list = List.of("aaa", "fff", "www");
        System.out.println(set);
        System.out.println(list);
    }
}
