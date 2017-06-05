package ua.dp.hillel.java15.interfaces;

/**
 * Created by aleksei on 05.06.17.
 */
public class Message implements Printable {

    private String text;
    private String anotherText;
    private String initializedText = "initialized";

    public Message (String someText) {
        anotherText = someText;
        //text = someText;
    }

    @Override
    public void print() {
        System.out.println(text);
        System.out.println(anotherText);
        System.out.println(initializedText);
    }
}
