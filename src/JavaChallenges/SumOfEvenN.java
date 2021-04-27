package JavaChallenges;

import java.util.Scanner;
import java.util.function.Function;

class SumOfEvenNumbers implements Function<Integer, Integer>{
    @Override
    public Integer apply(Integer N){
        int sum=0;
        for (int number = 1; number <=N; number++){
            if ((number%2) == 0){
                sum = sum + number;
            }
        }
        return sum;
    }
}

public class SumOfEvenN {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        SumOfEvenNumbers sumOfEvenNumbers = new SumOfEvenNumbers();
        sumOfEvenNumbers.apply(a);
        System.out.println(sumOfEvenNumbers.apply(a));
    }
}
