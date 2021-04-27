package JavaChallenges;

import java.util.Scanner;

class NumberUtils{
    public static int smallest(int N){
        int smallestNumber = 0;
        if (N<=1)
            return smallestNumber;

        int numberOfDigitsOriginalN = String.valueOf(N).length();

        while(N>0){
            N--;
            if (String.valueOf(N).length() == (numberOfDigitsOriginalN - 1)){
                return ++N;
            }
        }
        return smallestNumber;
    }
}

class NumberUtils1{
    public static int smallest(int N){
        int smallestNumber = 0;
        if (N<=1 || String.valueOf(N).length() == 1){
            return smallestNumber;
        }
        int numberOfDigits = String.valueOf(N).length();
        return (int) Math.pow(10, numberOfDigits - 1);
    }
}

public class SmallestNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

//        int a = sc.nextInt();
//        NumberUtils numberUtils = new NumberUtils();
//        //numberUtils.smallest(a);
//        System.out.println(numberUtils.smallest(a));
//
//
        // Using object of second implementation of the NumberUtils
        NumberUtils1 numberUtils1 = new NumberUtils1();

        int b = sc.nextInt();

        System.out.println(numberUtils1.smallest(b));
    }
}
