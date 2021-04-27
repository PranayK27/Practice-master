package Collections.List.Vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorIterator {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("A");
        v.add("B");

        Iterator i = v.iterator();
        while (i.hasNext()){
            System.out.print(i.next()+" ");
        }
    }
}
