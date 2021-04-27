package JavaChallenges;

import java.util.Scanner;

class NumberUtil{

    public static void fizzBuzz(int N){
        final String BUZZ="Buzz";
        final String FIZZ="Fizz";

        for (int i =1; i<=N; i++){
            if(i%15 == 0){
                System.out.print(FIZZ + "-" + BUZZ + ",");
            } else if (i%3 == 0){
                System.out.print(FIZZ + ",");
            } else if (i%5 == 0){
                System.out.print(BUZZ + ",");
            } else {
                System.out.print(i + ",");
            }
        }
    }
}

public class FizzBuzz {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        NumberUtil numberUtils = new NumberUtil();
        numberUtils.fizzBuzz(a);
//        System.out.println(numberUtils.fizzBuzz(a));
    }
}
