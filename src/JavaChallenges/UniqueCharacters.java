package JavaChallenges;

import java.util.Scanner;
import java.util.function.Function;

class AreUniqueChars implements Function<String, Boolean> {

    @Override
    public Boolean apply(String str) {
        return areUniqueChars(str);
    }

    static boolean areUniqueChars(String str) {
        if (str.length() > 128)
            return false;

        boolean[] booleans = new boolean[128];
        for (int idx = 0; idx < str.length(); idx++) {
            int value = str.charAt(idx);
            booleans[value] = true;
        }
        return true;
    }
}

public class UniqueCharacters {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        AreUniqueChars areUniqueChars = new AreUniqueChars();

        System.out.println(areUniqueChars.apply(a));
        //System.out.println(areUniqueChars.areUniqueChars("qwerty"));

    }
}
