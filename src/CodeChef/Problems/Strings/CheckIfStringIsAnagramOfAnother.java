package CodeChef.Problems.Strings;

/*
Check if a string is anagram of another
Given two strings, your task is to check if they are anagrams of each other. Two strings are considered anagrams if by rearranging the letters of one string, we can get the other string. Your program should be able to read two strings from the input and output "YES" if they are anagrams of each other, and "NO" otherwise.

Input Format
The first line of input contains a single integer
T
T, the number of test cases.
Each test case consists of two lines.
The first line of each test case contains the first string,
A
A.
The second line of each test case contains the second string,
B
B.
Output Format
For each test case, print "YES" if the two strings are anagrams of each other; otherwise, print "NO". Each output should be in a new line.

Constraints
1
≤
T
≤
100
1≤T≤100
1
≤
∣
A
∣
,
∣
B
∣
≤
1
0
5
1≤∣A∣,∣B∣≤10
5

The strings consist only of lowercase English letters.

--- Input ---
3
listen
silent
programming
margorpign
cat
tac
--- Output ---
YES
NO
YES
**/

import interview.DSA.RotateArray;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

public class CheckIfStringIsAnagramOfAnother {
    public static void main(String[] args)
    {
        Logger logger = Logger.getLogger(CheckIfStringIsAnagramOfAnother.class.getName());
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String str1 = sc.next();
            String str2 = sc.next();

            char[] a1 = str1.toCharArray();
            char[] a2 = str2.toCharArray();
            Arrays.sort(a1);
            Arrays.sort(a2);
            if(Arrays.equals(a1, a2)){
                logger.info("YES");
            } else logger.info("NO");
        }

    }
}
