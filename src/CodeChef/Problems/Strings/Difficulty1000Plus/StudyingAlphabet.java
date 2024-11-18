package CodeChef.Problems.Strings.Difficulty1000Plus;

/*
Studying Alphabet
Read problems statements in Mandarin Chinese, Russian and Vietnamese as well.
Not everyone probably knows that Chef has younger brother Jeff. Currently Jeff learns to read.

He knows some subset of the letter of Latin alphabet. In order to help Jeff to study, Chef gave him a book with the text consisting of N words. Jeff can read a word if it consists only of the letters he knows.

Now Chef is curious about which words his brother will be able to read, and which are not. Please help him!

Input
The first line of the input contains a lowercase Latin letter string S, consisting of the letters Jeff can read. Every letter will appear in S no more than once.

The second line of the input contains an integer N denoting the number of words in the book.

Each of the following N lines contains a single lowecase Latin letter string Wi, denoting the ith word in the book.

Output
For each of the words, output "Yes" (without quotes) in case Jeff can read it, and "No" (without quotes) otherwise.

Constraints
1 ≤ |S| ≤ 26
1 ≤ N ≤ 1000
1 ≤ |Wi| ≤ 12
Each letter will appear in S no more than once.
S, Wi consist only of lowercase Latin letters.

---Input---
act
2
cat
dog
---Output---
Yes
No
**/

import java.util.Scanner;

public class StudyingAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        while(n-->0){
            int ans=0;
            String s1 = sc.next();
            for(int i=0;i<s.length();i++){
                char ch= s.charAt(i);

                for(int j=0;j<s1.length();j++){
                    char ch2 = s1.charAt(j);
                    if(ch == ch2){
                        ans++;}
                }
            }
            if(ans == s1.length())
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
