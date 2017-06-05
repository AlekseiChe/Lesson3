package ua.dp.hillel.java15.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by aleksei on 05.06.17.
 */
public class Sets implements Runnable {
    @Override
    public void run() {
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("hello");
        set.add("hello");
        set.add("hello");
        set.add("world");
        set.add("world");
        set.add("world");
        set.add("world");

        for(String str : set){
            System.out.println(str);
        }
    }
}
