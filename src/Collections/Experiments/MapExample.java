package Collections.Experiments;

// Java Program to Demonstrate
// Working of Map interface

// Importing required classes
import java.util.*;

// Main class
class MapExample {

    // Main driver method
    public static void main(String args[]) {
        // Creating an empty HashMap
        Map<String, Integer> hm
                = new HashMap<String, Integer>();

        // Inserting pairs in above Map
        // using put() method
        hm.put("a", 100);
        hm.put("b", 200);
        hm.put("c", 300);
        hm.put("d", 400);

        // Traversing through Map using for-each loop
        for (Map.Entry<String, Integer> me :
                hm.entrySet()) {

            // Printing keys
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());

            Map<Integer, String> hm1
                    = new HashMap<Integer, String>();

            // Inserting the Elements
            hm1.put(new Integer(1), "Geeks");
            hm1.put(new Integer(2), "Geeks");
            hm1.put(new Integer(3), "Geeks");
            hm1.put(new Integer(4), "For");

            hm1.remove(new Integer(4));

            System.out.println("Initial Map " + hm1);

            hm1.put(new Integer(2), "For");

            System.out.println("Updated Map " + hm1);

            for (Map.Entry mapElement : hm1.entrySet()) {
                int key
                        = (int) mapElement.getKey();

                // Finding the value
                String value
                        = (String) mapElement.getValue();

                System.out.println(key + " : "
                        + value);
            }
        }
    }
}
