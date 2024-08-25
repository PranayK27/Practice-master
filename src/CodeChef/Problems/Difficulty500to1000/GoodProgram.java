package CodeChef.Problems.Difficulty500to1000;

/*
Good Program
In computing, the collection of four bits is called a nibble.

Chef defines a program as:

Good, if it takes exactly
X
X nibbles of memory, where
X
X is a positive integer.
Not Good, otherwise.
Given a program which takes
N
N bits of memory, determine whether it is Good or Not Good.

Input Format
First line will contain
T
T, number of test cases. Then the test cases follow.
The first and only line of each test case contains a single integer
N
N, the number of bits taken by the program.
Output Format
For each test case, output
Good
Good or
Not

Good
Not Good in a single line. You may print each character of
Good
Good or
Not

Good
Not Good in uppercase or lowercase (for example,
GoOd
GoOd,
GOOD
GOOD,
good
good will be considered identical).

Constraints
1
≤
T
≤
1000
1≤T≤1000
1
≤
N
≤
1000
1≤N≤1000

---Input---
4
8
17
52
3
---Output---
Good
Not Good
Good
Not Good

**/

import java.util.Scanner;

public class GoodProgram {
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n % 4 == 0) {
                System.out.println("Good");
            } else System.out.println("Not Good");
        }
    }
}
