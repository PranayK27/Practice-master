package JavaChallenges;


import java.util.Scanner;
import java.util.function.BiFunction;

class IsNumberAValidPowerOfBase implements BiFunction<Integer, Integer, Boolean>{

    @Override
    public Boolean apply(Integer number, Integer base){
        return isNumberAValidPowerOfBase(number, base);
    }

    static boolean isNumberAValidPowerOfBase(int number, int base){
        if (number == 0){
            return true;
        }
        while (number != 1){
            if ((number % base) != 0)
                return false;

            number = number / base;
        }
        return true;
    }
}

public class Exponentiation {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    IsNumberAValidPowerOfBase isNumberAValidPowerOfBase = new IsNumberAValidPowerOfBase();

    System.out.println(isNumberAValidPowerOfBase.apply(a, b));

}
}
