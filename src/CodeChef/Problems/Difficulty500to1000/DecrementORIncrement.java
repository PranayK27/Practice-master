package CodeChef.Problems.Difficulty500to1000;

/*
Decrement OR Increment
Write a program to obtain a number
N
N and increment its value by 1 if the number is divisible by 4
o
t
h
e
r
w
i
s
e
otherwise decrement its value by 1.

Input Format
First line will contain a number
N
N.

Output Format
Output a single line, the new value of the number.

Constraints
0
≤
N
≤
1000
0≤N≤1000

---Input---
5
---Output---
4
**/

import java.util.Scanner;

public class DecrementORIncrement {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%4>0){
            System.out.println(n-1);
        } else {
            System.out.println(n+1);
        }

    }
}
