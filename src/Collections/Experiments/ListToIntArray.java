package Collections.Experiments;

import java.util.ArrayList;
import java.util.List;

public class ListToIntArray {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for(int i = 10; i<=20; i++){
            list.add(i);
        }

        // Convert List into Array of integers like int[]

        int[] intArray = new int[list.size()];
        for (int i=0; i< list.size(); i++){
            intArray[i] = list.get(i);
            System.out.print(intArray[i]+" ");
        }
        System.out.println();
        //convert array to list
        List<Integer> myList = new ArrayList<>();
        for (int i: intArray){
            myList.add(i);
        }

        System.out.println("Printing the list:");
        System.out.println(myList);
    }
}
