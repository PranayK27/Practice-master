package JavaChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class AssembleParts{
    public static int minimumTime(List<Integer> list){
        int[] arraysOfSizes = list.stream().mapToInt(i -> i).toArray();
        Arrays.sort(arraysOfSizes);

        int accumulatedTime=0;
        for (int i=0; i<arraysOfSizes.length-1; i++){
            accumulatedTime += (arraysOfSizes[i] + arraysOfSizes[i+1]);
            arraysOfSizes[i+1]=arraysOfSizes[i] + arraysOfSizes[i+1];
        }
        return accumulatedTime;
    }
}
public class MinimumTime {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(8);
        integerList.add(4);
        integerList.add(6);
        integerList.add(12);
        int time = AssembleParts.minimumTime(integerList);
        System.out.println(time);
    }
}
