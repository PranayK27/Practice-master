package CodeChef.Problems.Strings.Difficulty1000Plus;

/*
Lapindromes
Lapindrome is defined as a string which when split in the middle, gives two halves having the same characters and same frequency of each character. If there are odd number of characters in the string, we ignore the middle character and check for lapindrome. For example gaga is a lapindrome, since the two halves ga and ga have the same characters with same frequency. Also, abccab, rotor and xyzxy are a few examples of lapindromes. Note that abbaab is NOT a lapindrome. The two halves contain the same characters but their frequencies do not match.
Your task is simple. Given a string, you need to tell if it is a lapindrome.

Input:
First line of input contains a single integer T, the number of test cases.
Each test is a single line containing a string S composed of only lowercase English alphabet.
Output:
For each test case, output on a separate line: "YES" if the string is a lapindrome and "NO" if it is not.
Constraints:
1 ≤ T ≤ 100
2 ≤ |S| ≤ 1000, where |S| denotes the length of S

---Input---
6
gaga
abcde
rotor
xyzxy
abbaab
ababc

-- exception case --
gfheggfehgg

---Output---
YES
NO
YES
YES
NO
NO

-- answer of exception case --
YES
**/

import java.util.Arrays;
import java.util.Scanner;

public class Lapindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String str = sc.next();
            int len = str.length();
            String str1 = str.substring(0, len / 2);
            String str2 = "";
            if (len % 2 != 0)
                str2 = str.substring(len / 2 + 1);
            else
                str2 = str.substring(len / 2);
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            boolean res = Arrays.equals(ch1, ch2);

            if (res == true)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

    }
}
