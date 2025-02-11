package CodeChef.Problems.Difficulty500to1000;
/*
Small Factorial
Write a program to find the factorial value of any number entered by the user.

Input Format
The first line contains an integer T, the total number of testcases. Then T lines follow, each line contains an integer N.

Output Format
For each test case, display the factorial of the given number N in a new line.

Constraints
1 ≤ T ≤ 1000
0 ≤ N ≤ 20

---Input---
3
3
4
5
---Output---
6
24
120
**/


import java.util.Scanner;

public class SmallFactorial {
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Factorial f = new Factorial();
        while (t--> 0) {
            long n = sc.nextInt();
            System.out.println(f.fact(n));
        }
    }
}
class Factorial {
    public static long fact(long n)
    {
        long result;
        if (n == 0 || n == 1) return 1;
        result = fact(n - 1) * n;
        return result;
    }
}
