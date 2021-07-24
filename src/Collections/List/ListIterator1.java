package Collections.List;

import java.util.ArrayList;
import java.util.List;

public class ListIterator1 {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        myList.add(50);

//        ListIterator<Integer> iter = myList.listIterator();
//        while(iter.hasNext()){
//            iter.remove();
//        }

        // covert list into an array of intergers like int[]

        //Note that this works only for arrays of reference types. For arrays of primitive types, use the traditional way:
        System.out.println(myList);
        int[] intArray = new int[myList.size()];
        for (int i=0; i < myList.size(); i++){
            intArray[i] = myList.get(i); //works
        }
    }
}
