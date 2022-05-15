package practice.HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int leftdiagonal = 0, rightdiagonal = 0;
        for(int i = 0, j = arr.get(0).size()-1; i < arr.get(0).size(); i++, j--){
            leftdiagonal = leftdiagonal + arr.get(i).get(i);
            rightdiagonal = rightdiagonal + arr.get(i).get(j);
        }
        return Math.abs(leftdiagonal - rightdiagonal);
    }
}

public class SolutionDiagonalSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

       System.out.println(Result.diagonalDifference(arr));

        bufferedReader.close();
    }
}
