package Collections.List;

import java.util.ArrayList;
import java.util.List;

public class ArraytoList {
    public static void main(String[] args) {

        int[] intArray  = {10,20,30};
        List<Integer> intList = new ArrayList<>();

        for (int i: intArray){
            intList.add(i);
        }
        System.out.print(intList);
    }
}
