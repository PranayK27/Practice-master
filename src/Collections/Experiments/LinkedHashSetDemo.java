package Collections.Experiments;

// Java program to Remove Elements from LinkedHashSet

// Importing required classes
import java.io.*;
        import java.util.*;

// Main class
// RemoveElementsFromLinkedHashSet
class LinkedHashSetDemo {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating an empty LinekdhashSet of string type
        LinkedHashSet<String> hs
                = new LinkedHashSet<String>();

        // Adding elements to above Set
        // using add() method
        hs.add("Geek");
        hs.add("For");
        hs.add("Geeks");
        hs.add("A");
        hs.add("B");
        hs.add("Z");

        // Printing all above elements to the console
        System.out.println("Initial HashSet " + hs);

        // Removing the element from above Set
        hs.remove("B");

        // Again removing the element
        System.out.println("After removing element " + hs);

        // Returning false if the element is not present
        System.out.println(hs.remove("AC"));
    }
}

