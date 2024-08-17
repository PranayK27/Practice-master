package CodeChef.Problems.Strings;

import java.util.Scanner;

public class StringToTitleCase {
    public static void main (String[] args)
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String S = sc.nextLine();

            StringBuilder result = new StringBuilder();
            String[] words = S.split(" ");

            for(String word : words){
                result.append(formatWord(word)).append(" ");
            }
            System.out.println(result.toString().trim());
        }
    }
    static String formatWord(String word){
        if(word.equals(word.toUpperCase())){
            return word;
        }
        else{
            return Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
        }
    }
}
