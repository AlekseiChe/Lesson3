package ua.dp.hillel.java15.collection;

import java.util.*;

/**
 * Created by aleksei on 05.06.17.
 */
public class Maps implements Runnable {
    @Override
    public void run() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Vasiy", 183);
        map.put("Masha", 203);
        map.put("Masha", 204);

        Integer mashaHeight = map.get("Masha");

        int i=0;
        Set <Map.Entry<String,Integer>> entries = map.entrySet();
        List <Map.Entry<String,Integer>> entryList = new LinkedList<>(entries);
        while (i<map.size()){
            Map.Entry<String, Integer> entry = entryList.get(i);
            System.out.println("Name: " + entry.getKey() + ", height: " + entry.getValue());
            i++;
        }
    }
}
