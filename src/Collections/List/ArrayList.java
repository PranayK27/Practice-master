package Collections.List;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<String> l = new java.util.ArrayList<>();
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");
        l.add(2, "M");
        System.out.println(l);

    }
}
