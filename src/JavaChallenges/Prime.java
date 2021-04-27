package JavaChallenges;

import java.util.Scanner;
import java.util.function.Function;

class IsPrimeNumber implements Function<Integer, Boolean>{

    @Override
    public Boolean apply(Integer number){
        return isPrimeNumber(number);
    }

    private static boolean isPrimeNumber(int number) {
        if (number < 2)
            return false;

        if (number == 2)
            return true;

        for (int div = (number / 2) + 1; div > 1; div--){
            if (number % div == 0) {
                return false;
            }
    }
        return true;
    }

}



public class Prime {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        IsPrimeNumber isPrimeNumber = new IsPrimeNumber();

        System.out.println(isPrimeNumber.apply(a));
    }
}
