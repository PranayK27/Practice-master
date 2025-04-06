package CodeChef.Problems.Difficulty500to1000;
/*
Smallest Numbers of Notes
Consider a currency system in which there are notes of six denominations, namely, Rs. 1, Rs. 2, Rs. 5, Rs. 10, Rs. 50, Rs. 100.
If the sum of Rs. N is input, write a program to compute smallest number of notes that will combine to give Rs. N.

Input

The first line contains an integer T, total number of testcases. Then follow T lines, each line contains an integer N.

Output
For each test case, display the smallest number of notes that will combine to give N, in a new line.

Constraints
1 ≤ T ≤ 1000
1 ≤ N ≤ 1000000

---Input---
3
1200
500
242
---Output---
12
5
7
**/


import java.util.Scanner;

public class SmallestNumbersOfNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a =n%100;
            int b= a%50;
            int c= b%10;
            int d= c%5;
            int e= d%2;

            System.out.println((n/100)+(a/50)+(b/10)+(c/5)+(d/2)+e);
        }
    }
}
