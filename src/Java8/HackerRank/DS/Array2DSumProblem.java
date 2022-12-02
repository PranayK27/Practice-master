package Java8.HackerRank.DS;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result4 {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.size() - 2; ++i) {
            for(int j = 0; j < arr.size() - 2; ++j) {
                int sum = arr.get(i).get(j) +
                        arr.get(i).get(j+1) +
                        arr.get(i).get(j+2) +
                        arr.get(i+1).get(j+1) +
                        arr.get(i+2).get(j) +
                        arr.get(i+2).get(j+1) +
                        arr.get(i+2).get(j+2);
                max = Math.max(max, sum);
            }
        }
        return max;
    }

}


public class Array2DSumProblem {
    public static void main(String[] args) {

        List<List<Integer>> array = new ArrayList<>();

        int twodarray[][]=new int[6][6];
        int i,j,k=0;

        for(i=0;i<6;i++) //row
        {
            for(j=0;j<6;j++) //column
            {
                array.add(Collections.singletonList(k));
                k++;
            }
        }
        List<List<Integer>> arr = new ArrayList<>();

        arr = array;

//        IntStream.range(0, 6).forEach(i -> {
//            try {
//                arr.add(
//                        Stream.of(array)
//                                .collect(toList())
//                );
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });

        int result = Result4.hourglassSum(arr);

        System.out.println(result);
    }
}
