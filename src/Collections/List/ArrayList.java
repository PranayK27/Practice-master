package Collections.List;

import java.util.List;
import java.util.function.Supplier;
import java.util.logging.Logger;


public class ArrayList {
    public static void main(String[] args) {

        final Logger log = Logger.getLogger(ArrayList.class.getName());

        List<String> l = new java.util.ArrayList<>();
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");
        l.add(2, "M");
        System.out.println(l);

    }
}
