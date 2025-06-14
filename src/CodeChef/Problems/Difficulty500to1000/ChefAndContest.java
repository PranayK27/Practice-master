package CodeChef.Problems.Difficulty500to1000;
/*
Chef and Contest
Chef and Chefina are competing against each other in a programming contest. They were both able to solve all the problems in the contest, so the winner between them must be decided by time penalty. Chef solved all the problems in
X
X minutes and made
P
P wrong submissions, while Chefina solved all the problems in
Y
Y minutes and made
Q
Q wrong submissions. Who won the competition (or was it a draw)?

Note: The time penalty is calculated as follows:

The base time penalty is the time at which the final problem was solved (so,
X
X for Chef and
Y
Y for Chefina)
Each wrong submission adds a penalty of
10
10 minutes
The winner is the person with less penalty time. If they both have the same penalty, it is considered a draw.
Input Format
The first line of input contains a single integer
T
T, denoting the number of test cases. The description of
T
T test cases follows.
The first and only line of each test case contains four space-separated integers —
X
,
Y
,
P
X,Y,P, and
Q
Q respectively.
Output Format
For each test case, output a single line containing one string — the name of the winner ("Chef" or "Chefina"), or "Draw" if the match was a draw. Print each string without the quotes.

Each character of the answer can be printed in either uppercase or lowercase, i.e, the strings "Chef", "chEf", "cHeF", etc. are treated as equivalent.

Constraints
1
≤
T
≤
1000
1≤T≤1000
1
≤
X
,
Y
≤
100
1≤X,Y≤100
0
≤
P
,
Q
≤
100
0≤P,Q≤100

---Input---
3
10 8 2 3
10 10 10 10
40 21 2 0
---Output---
Chef
Draw
Chefina
**/

import java.util.Scanner;

public class ChefAndContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int p = sc.nextInt();
            int q = sc.nextInt();
            int chef = x+p*10;
            int chefina = y+q*10;
            if (chef == chefina) {
                System.out.println("Draw");
            } else if(chef < chefina){
                System.out.println("Chef");
            } else {
                System.out.println("Chefina");
            }
        }
    }
}
