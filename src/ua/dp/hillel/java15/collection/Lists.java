package ua.dp.hillel.java15.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by aleksei on 05.06.17.
 */
public class Lists implements Runnable {
    @Override
    public void run() {
        Random random = new Random();

        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt());
        }

        for(Integer number : list){
            System.out.println(number);
        }
    }
}
