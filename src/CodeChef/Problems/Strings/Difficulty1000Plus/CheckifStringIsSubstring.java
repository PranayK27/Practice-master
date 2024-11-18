package CodeChef.Problems.Strings.Difficulty1000Plus;

/*
Check if a string is a substring of another
Given two strings, S1 and S2, your task is to determine whether S2 is a substring of S1. If S2 is a substring of S1, print "YES". Otherwise, print "NO".

A substring is a contiguous sequence of characters within a string. For example, "abc" is a substring of "aabcda", but "ac" is not a contiguous sequence in "aabcda".

Input Format
The first line contains a single integer T, the number of test cases.
Each test case consists of two lines:
The first line contains the string S1.
The second line contains the string S2.
Output Format
For each test case, print a single line containing either "YES" or "NO", depending on whether S2 is a substring of S1.

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
S
1
∣
,
∣
S
2
∣
≤
1000
1≤∣S1∣,∣S2∣≤1000
S1 and S2 contain only lowercase English letters.

---Input---
4
hello
ell
codechef
chef
programming
debug
abcd
efgh
---Output---
YES
YES
NO
NO
**/

import java.util.Scanner;

public class CheckifStringIsSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();
            CheckifStringIsSubstring.traversal(s1, s2);
        }

    }
    static void traversal(String s1, String s2){
        if(s1.length() > s2.length()){
            for (int i=0; i<s1.length(); i++){
                if(s1.contains(s2)){
                    System.out.println("YES");
                    break;
                } else {
                    System.out.println("NO");
                    break;
                }
            }
        } else {
            for (int i=0; i<s2.length(); i++){
                if(s2.contains(s1)){
                    System.out.println("YES");
                    break;
                } else {
                    System.out.println("NO");
                    break;
                }
            }
        }
    }
}
