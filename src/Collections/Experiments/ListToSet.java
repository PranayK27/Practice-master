package Collections.Experiments;
import java.util.*;

public class ListToSet {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(20);
        myList.add(10);
        myList.add(40);
        myList.add(50);
        myList.add(30);

        System.out.println("Unsorted List:" + myList);
        Collections.sort(myList);
        System.out.println("Sorted List:" +myList);

        /* To sort a set you need to convert the set to a list and then use Collections.sort(list)
        then again convert that list to the set
        */
        //Convert list into Hashset
        //Internally hashCode() method is used to identify duplicate elements
        Set<Integer> listToset = new HashSet<>(myList);

        System.out.println("List -> Set:" +listToset);

        // TreeSet uses its own comparator to find the duplicate object
        TreeSet<Integer> mySet = new TreeSet<>();
        mySet.addAll(myList);

        System.out.println("Sorted Set using TreeSet: " + mySet);

        System.out.println("First lowest element " +
                "removed is : " + mySet.pollFirst());
        System.out.println("Last element " +
                "removed is : " + mySet.pollLast());
        System.out.println("After removing element" +
                " from TreeSet: " + mySet);

        System.out.println("*********************************************");

        //Remove duplicate Elements from an ArrayList

        List<Integer> myDuplicates = new ArrayList<>();
        myDuplicates.add(20);
        myDuplicates.add(20);
        myDuplicates.add(40);
        myDuplicates.add(50);
        myDuplicates.add(40);

        System.out.println("Printing duplicate elements: " + myDuplicates);

        // Use Set
        Set<Integer> rmDuplicate = new HashSet<>(myDuplicates);
        //myDuplicates.clear(); // clears list
        myDuplicates.addAll(rmDuplicate); // adds elements of set
        System.out.println(rmDuplicate);

        //Use LinkedHashSet (alternative to above)
//        Set<Integer> rmDuplicate1 = new LinkedHashSet<>(myDuplicates);
//        myDuplicates.clear();
//        myDuplicates.addAll(rmDuplicate1);
//        System.out.println(rmDuplicate1);

    }
}
