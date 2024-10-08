package CodeChef.Problems.Difficulty500to1000;
/*
It is My Serve
Alice and Bob are playing a game of table tennis where irrespective of the point scored, every player makes
2
2 consecutive serves before the service changes. Alice makes the first serve of the match. Therefore the first
2
2 serves will be made by Alice, then the next
2
2 serves will be made by Bob and so on.

Let's consider the following example match for more clarity:

Alice makes the
1
s
t
1
st
  serve.
Let us assume, Bob wins this point. (Score is
0
0 for Alice and
1
1 for Bob)
Alice makes the
2
n
d
2
nd
  serve.
Let us assume, Alice wins this point. (Score is
1
1 for Alice and
1
1 for Bob)
Bob makes the
3
r
d
3
rd
  serve.
Let us assume, Alice wins this point. (Score is
2
2 for Alice and
1
1 for Bob)
Bob makes the
4
t
h
4
th
  serve.
Let us assume, Alice wins this point. (Score is
3
3 for Alice and
1
1 for Bob)
Alice makes the
5
t
h
5
th
  serve.
And the game continues
…
…
After the score reaches
P
P and
Q
Q for Alice and Bob respectively, both the players forgot whose serve it is. Help them determine whose service it is.

Input Format
The first line contains a single integer
T
T — the number of test cases. Then the test cases follow.
The first line of each test case contains two integers
P
P and
Q
Q — the score of Alice and Bob respectively.
Output Format
For each test case, determine which player's (Alice or Bob) serve it is.

You may print each character of Alice and Bob in uppercase or lowercase (for example, Bob, BOB, boB will be considered identical).

Constraints
1
≤
T
≤
200
1≤T≤200
0
≤
P
,
Q
≤
10
0≤P,Q≤10

---Input---
4
0 0
0 2
2 2
4 7
0 5
---Output---
Alice
Bob
Alice
Bob
Alice
**/

import java.util.Scanner;

public class ItIsMyServe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int p =sc.nextInt();
            int q =sc.nextInt();
            if((p+q)%4 ==0 || (p+q)%4 == 1)
            {
                System.out.println("Alice");
            }
            else
            {
                System.out.println("Bob");
            }
        }
    }
}
