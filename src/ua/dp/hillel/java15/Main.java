package ua.dp.hillel.java15;

import ua.dp.hillel.java15.collection.Lists;
import ua.dp.hillel.java15.collection.Maps;
import ua.dp.hillel.java15.collection.Sets;
import ua.dp.hillel.java15.interfaces.AnotherMessage;
import ua.dp.hillel.java15.interfaces.Message;
import ua.dp.hillel.java15.interfaces.Printable;

/**
 * Created by aleksei on 05.06.17.
 */
public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        m.run(new Message("Hello"));
        m.run(new AnotherMessage());

        new Lists().run();
        new Sets().run();
        new Maps().run();
    }

    public void run(Printable p) {
        p.print();
    }
}
