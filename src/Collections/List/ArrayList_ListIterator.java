package Collections.List;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList_ListIterator {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("1");
        a.add("2");
        a.add("3");
        a.add("4");
        a.add("5");

        ListIterator<String> li = a.listIterator();
        while (li.hasNext()){
            System.out.println(li.next()+" ");
        }
    }
}
