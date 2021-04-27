package Collections.List.Vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEnumerator {
    public static void main(String[] args) {
        Vector<String> v =new Vector<>();
        v.add("A");
        v.add("B");
        v.add("C");

        Enumeration e = v.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement()+" ");
        }
    }
}
