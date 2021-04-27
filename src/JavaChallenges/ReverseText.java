// Give a String a character, reverse the order of the characters in an efficient manner.
package JavaChallenges;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

class StringUtils1{

    public static String reverse(String text){
        // 1. string input need to be converted to the character array
        char[] chars = text.toCharArray();
        // 2. store the length of character array in a integer variable
        final int arraylength = chars.length; // length starts from 1
        // 3. transposing values using a temporary variable
        char temp;
        for (int i=0; i<arraylength/2;i++){
            temp = chars[i];
            chars[i] = chars[arraylength - 1 - i];
            chars[arraylength - 1 - i] = temp;
        }
        return String.valueOf(chars);
    }
}

class ReverseTexts{
    public static void main(String args[]){
        StringUtils1 stringUtils = new StringUtils1();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(StringUtils1.reverse(str));

//        @Test
//        public void reverseText_useCases(){
//            assertEquals("abc2132", StringUtils1.reverse("2312cba"));
//            assertEquals("ba", StringUtils1.reverse("ab"));
//        }
    }
}

