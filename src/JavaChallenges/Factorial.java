package JavaChallenges;

import java.util.Scanner;

class FactorialRecursive{
    public static int factorial(int N){
        if(N < 1)
            return 1;
        else
            return (N * factorial(N -1));
    }
}

class FactorialIterative{
    public static int factorial(int N){
        int result = 1;
        for(int i=2; i<=N; i++){
            result*=i;
        }
        return result;
    }
}

public class Factorial {

    public static void main(String args[]) {


        FactorialRecursive fr = new FactorialRecursive();


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println(fr.factorial(a));
    }
}
