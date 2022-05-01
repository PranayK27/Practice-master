package Collections.Experiments;

import java.util.*;

public class SourceToDestList {
    public static void main(String[] args) {

        List<Integer> sourceList = new ArrayList<>();
        sourceList.add(10);
        sourceList.add(15);
        sourceList.add(20);
        sourceList.add(25);
        sourceList.add(30);
        sourceList.add(35);
        sourceList.add(40);

        //Use ArrayList constructor
        ArrayList newList = new ArrayList<>(sourceList);
        System.out.println(newList);
        Collections.reverse(newList);
        System.out.println("Reversed new list: " + newList);
        Collections.shuffle(newList);
        System.out.println("Shuffled elements of the list: " +  newList);
    }
}
