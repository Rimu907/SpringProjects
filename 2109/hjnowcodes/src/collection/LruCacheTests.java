package collection;
import java.util.*;

/**
 * @Date:2021/12/27 16:33
 * @Author:NANDI_GUO
 */
public class LruCacheTests {
    static Map<String,Integer> cache;
    public static void main(String[] args) {
        cache=new LinkedHashMap<String,Integer>(3,
                0.75f,
                true){
            //每次执行put都会调用
            @Override
            protected boolean removeEldestEntry(
                    Map.Entry<String,Integer> eldest) {
                return cache.size()>3;
            }
        };

        cache.put("A", 100);
        cache.put("B", 200);
        cache.put("C", 300);
        cache.put("D", 400);
        System.out.println(cache);
//        cache.get("B");
//        cache.get("C");
//        cache.put("E", 500);
//        cache.put("F", 500);
//
//        System.out.println(cache);

    }
}