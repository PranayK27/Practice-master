package CodeChef.Problems.Strings.Difficulty1000Plus;

/*
Convert string to number
You are given a string that represents a positive number. Your task is to write a program that converts this string into its numerical equivalent without using any in-built parsing, conversion libraries, or direct type casting methods. The string will not contain any leading zeros, decimals, or any non-numeric characters.

Complete the function stringToNumber in the IDE

Input Format
The first line contains a single integer, T, the number of test cases.
The following T lines each contain a single string, S, representing the number.
Output Format
For each test case, print the numerical equivalent of the string.

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
∣
≤
10
1≤∣S∣≤10, where
∣
S
∣
∣S∣ is the length of the string.
S will only contain digits (0-9) and will not have leading zeros.

---Input---
6
123
42
1001
1
123456677777777
1000

---Output---
123
42
1001
1
123456677777777
1000
**/

import java.util.Scanner;

public class ConvertStringToNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            ConvertStringToNumber.stringToNumber(s);
        }
    }
    public static long stringToNumber(String str) {
        long num = 0;
        for (int i = 0; i < str.length(); i++) {
            num = num * 10 + (str.charAt(i) - '0');
        }
        return num;
    }
}
