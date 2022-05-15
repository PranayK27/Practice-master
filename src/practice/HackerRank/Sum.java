package practice.HackerRank;

import java.io.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result2 {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        int[] array = new int[arr.size()];
        for(int i=0; i<arr.size(); i++){
            array[i] = arr.get(i);
        }
        long min = 0, max = 0, sum = 0;
        min = array[0];
        max = min;
        sum = min;
        for (int i = 1; i < array.length; i++) {
            sum += array[i];
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.print((sum - max) + " " + (sum - min));
    }
}
// Print two space-separated integers on one line: the minimum sum and the maximum sum of 4 of 5 elements.
public class Sum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result2.miniMaxSum(arr);

        bufferedReader.close();
    }
}
