package CodeChef.Problems.Difficulty500to1000;

/*
Complementary Strand in a DNA
You are given the sequence of Nucleotides of one strand of DNA through a string
S
S of length
N
N.
S
S contains the character
A
,
T
,
C
,
A,T,C, and
G
G only.

Chef knows that:

A
A is complementary to
T
T.
T
T is complementary to
A
A.
C
C is complementary to
G
G.
G
G is complementary to
C
C.
Using the string
S
S, determine the sequence of the complementary strand of the DNA.

Input Format
First line will contain
T
T, number of test cases. Then the test cases follow.
First line of each test case contains an integer
N
N - denoting the length of string
S
S.
Second line contains
N
N characters denoting the string
S
S.
Output Format
For each test case, output the string containing
N
N characters - sequence of nucleotides of the complementary strand.

Constraints
1≤T≤100
1≤N≤100
S contains A, T, C, and G only

---Input---
4
4
ATCG
4
GTCC
5
AAAAA
3
TAC
---Output---
TAGC
CAGG
TTTTT
ATG
**/

import java.util.Scanner;

public class ComplementaryStrandInDNA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            for (int i = 0; i < n; i = i + 1) {
                if (s.charAt(i) == 'A') {
                    System.out.print("T");
                } else if (s.charAt(i) == 'T') {
                    System.out.print("A");
                } else if (s.charAt(i) == 'C') {
                    System.out.print("G");
                } else if (s.charAt(i) == 'G') {
                    System.out.print("C");
                }
            }
            System.out.println();
        }
    }
}
