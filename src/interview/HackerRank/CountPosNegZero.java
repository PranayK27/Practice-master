package interview.HackerRank;

import java.io.*;
import java.text.*;
import java.util.*;

class Result1 {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int[] array = new int[arr.size()];
        double posC=0, negC=0, zeroC=0;
        int count = 0, counter=0;
        for(int i =0; i<arr.size(); i++){
            array[i] = arr.get(i);
            count++;
        }
        if(count == arr.size()){
            for(int i=0; i<count; i++){
                if(array[i] > 0){
                    posC++;
                } else if(array[i] < 0){
                    negC++;
                } else if(array[i] == 0){
                    zeroC++;
                }
            }
        }
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(6);
        System.out.println(df.format(posC/count));
        System.out.println(df.format(negC/count));
        System.out.println(df.format(zeroC/count));

    }

}

public class CountPosNegZero {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result1.plusMinus(arr);

        bufferedReader.close();
    }
}
