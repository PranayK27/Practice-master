package CodeChef.Problems.Difficulty500to1000;

/*
Speed Limit Test
Alice is driving from her home to her office which is
A
A kilometers away and will take her
X
X hours to reach.
Bob is driving from his home to his office which is
B
B kilometers away and will take him
Y
Y hours to reach.

Determine who is driving faster, else, if they are both driving at the same speed print EQUAL.

Input Format
The first line will contain
T
T, the number of test cases. Then the test cases follow.
Each test case consists of a single line of input, containing four integers
A
,
X
,
B
,
A,X,B, and
Y
Y, the distances and and the times taken by Alice and Bob respectively.
Output Format
For each test case, if Alice is faster, print ALICE. Else if Bob is faster, print BOB. If both are equal, print EQUAL.

You may print each character of the string in uppercase or lowercase (for example, the strings equal, equAL, EquAl, and EQUAL will all be treated as identical).

Constraints
1
≤
T
≤
1000
1≤T≤1000
1
≤
A
,
X
,
B
,
Y
≤
1000
1≤A,X,B,Y≤1000


---Input---
3
20 6 20 5
10 3 20 6
9 1 1 1

--exception i/p--
1
379 648 2 8
---Output---
Bob
Equal
Alice

--exception o/p--
alice
**/

import java.util.Scanner;

public class SpeedLimitTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            double A = sc.nextInt();
            double X = sc.nextInt();
            double B = sc.nextInt();
            double Y = sc.nextInt();
            double sA=A/X;
            double sB=B/Y;

            if(sA == sB){
                System.out.println("Equal");
            } else if(sA < sB){
                System.out.println("Bob");
            } else if(sA > sB){
                System.out.println("Alice");
            }
        }
    }
}
