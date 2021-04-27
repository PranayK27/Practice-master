package JavaChallenges;

import java.util.*;

class ListUtils{
    public static<E extends Comparable<E>>
    List<E> removeDuplicatesAndOrder(List<E> list){
        Set<E> set = new LinkedHashSet<>(list); //set doesnt allow duplicate elements
        ArrayList<E> arrayList = new ArrayList<>(set);
        Collections.sort(arrayList);
        return arrayList;
    }
}
public class RemoveDuplicateInList {
    public static void main(String args[]){
        ListUtils listUtils = new ListUtils();
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(listUtils.removeDuplicatesAndOrder(list));
    }
}
