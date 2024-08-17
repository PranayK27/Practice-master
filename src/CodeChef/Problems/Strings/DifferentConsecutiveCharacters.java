package CodeChef.Problems.Strings;

/*
Different Consecutive Characters
Chef has a binary string
S
S of length
N
N. Chef can perform the following operation on
S
S:

Insert any character (
0
0 or
1
1) at any position in
S
S.
Find the minimum number of operations Chef needs to perform so that no two consecutive characters are same in
S
S.

Input Format
The first line contains a single integer
T
T — the number of test cases. Then the test cases follow.
The first line of each test case contains an integer
N
N — the length of the binary string
S
S.
The second line of each test case contains a binary string
S
S of length
N
N containing
0
0s and
1
1s only.
Output Format
For each test case, output on a new line the minimum number of operations Chef needs to perform so that no two consecutive characters are same in
S
S.

Constraints
1
≤
T
≤
100
1≤T≤100
1
≤
N
≤
1000
1≤N≤1000

--- Input ---
3
2
11
4
0101
5
00100
--- Output ---
1
0
2
**/

import java.util.Scanner;

public class DifferentConsecutiveCharacters {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int counter=0;
            for(int i=0; i<n-1; i++){
                if(s.charAt(i) == s.charAt(i+1)){
                    counter++;
                }
            }
            System.out.println(counter);
        }

    }
}
