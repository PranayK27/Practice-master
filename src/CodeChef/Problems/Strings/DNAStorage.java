package CodeChef.Problems.Strings;

/*
DNA Storage
For encoding an even-length binary string into a sequence of A, T, C, and G, we iterate from left to right and replace the characters as follows:

00 is replaced with A
01 is replaced with T
10 is replaced with C
11 is replaced with G
Given a binary string
S
S of length
N
N (
N
N is even), find the encoded sequence.

Input Format
First line will contain
T
T, number of test cases. Then the test cases follow.
Each test case contains two lines of input.
First line contains a single integer
N
N, the length of the sequence.
Second line contains binary string
S
S of length
N
N.
Output Format
For each test case, output in a single line the encoded sequence.

Note: Output is case-sensitive.

Constraints
1
≤
T
≤
100
1≤T≤100
2
≤
N
≤
1
0
3
2≤N≤10
3

N
N is even.
Sum of
N
N over all test cases is at most
1
0
3
10
3
 .
S
S contains only characters 0 and 1.


--- Input ---
4
2
00
4
0011
6
101010
4
1001

--- Output ---
A
AG
CCC
CT

 * */

import java.util.Scanner;

public class DNAStorage {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String s;
        while(t-->0){
            int n = sc.nextInt();
            s = sc.next();

            for(int i=0; i<n-1; i = i+2){
                if(s.charAt(i) == '0' && s.charAt(i+1) == '0'){
                    System.out.print("A");
                } else if(s.charAt(i) == '0' && s.charAt(i+1) == '1'){
                    System.out.print("T");
                } else if(s.charAt(i) == '1' && s.charAt(i+1) == '0'){
                    System.out.print("C");
                } else if(s.charAt(i) == '1' && s.charAt(i+1) == '1'){
                    System.out.print("G");
                }
            } System.out.println();
        }
    }
}
