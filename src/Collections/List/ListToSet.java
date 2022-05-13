package Collections.List;

import java.util.*;
import java.util.ArrayList;

public class ListToSet {
    public static void main(String[] args) {
//
//        List<Integer> list = new ArrayList<>();
//        for(int i = 10; i<=20; i++){
//            list.add(i);
//        }
//
//        System.out.println("Printing list: " + list);
//
//        // Convert List into Set using HashSet
//
//        // hashset is usually not sorted
//
//        Set<Integer> mySet = new HashSet<>(list);
//
//        System.out.println("Printing HashSet: " + mySet);
//
//        // Convert List into Set using TreeSet
//
//        // treeset is sorted in natural ordering
//
//        Set<Integer> mySet1 = new TreeSet<>(list);
//
//        System.out.println("Printing TreeSet: " + mySet1);
//
        // Remove duplicate from the list

        // 1. Set

        ArrayList myList = new ArrayList();
        for (int i = 1; i <= 5 ; i++){
            myList.add(i);
            if (i == 5){
                myList.add(i);
            }
        }

        System.out.println("Before removing duplicates: " + myList);

        Set<Integer> removeDuplicate = new HashSet<>(myList);
        myList.clear();
        myList.addAll(removeDuplicate);

        System.out.println("After removing duplicates using Set: " + myList);

        // 2. LinkedHashSet


        ArrayList myList1 = new ArrayList();
        for (int i = 1; i <= 5 ; i++){
            myList1.add(i);
            if (i == 4){
                myList1.add(i);
            }
        }

        System.out.println("Before removing duplicates: " + myList1);

        Set<Integer> mylhs = new LinkedHashSet<>(myList1);
        myList1.clear();
        myList1.addAll(mylhs);

        System.out.println("After removing duplicates using LinkedHashSet: " + myList);

    }
}
