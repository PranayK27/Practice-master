package JavaChallenges;

import java.util.Scanner;
import java.util.function.Function;

class IsPallindrome implements Function<String, Boolean>{

    @Override
    public Boolean apply(String text){
        return isPalindrome(text);
    }

    static boolean isPalindrome(String text){
        final int length = text.length();
        for (int idx = 0; idx < length/2; idx++){
            if (text.charAt(idx) != text.charAt(length - 1 - idx))
                return false;
        }
        return true;
    }
}

public class Palindrome {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        IsPallindrome isPallindrome = new IsPallindrome();

        System.out.println(isPallindrome.apply(a));

    }
}
