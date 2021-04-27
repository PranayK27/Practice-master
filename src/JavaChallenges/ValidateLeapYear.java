package JavaChallenges;


import java.util.Scanner;
import java.util.function.Function;

class IsLeapYear implements Function<Integer, Boolean>{
    @Override
    public Boolean apply(Integer number){
        return isLeapYear(number);
    }

    private static boolean isLeapYear(int year){
        return (year % 400 == 0) || (year % 4 ==0 && year % 100 !=0);
    }
}

public class ValidateLeapYear {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        IsLeapYear isLeapYear = new IsLeapYear();

        System.out.println(isLeapYear.apply(a));

    }
}
