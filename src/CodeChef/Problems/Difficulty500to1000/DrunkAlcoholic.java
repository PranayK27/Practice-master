package CodeChef.Problems.Difficulty500to1000;
/*
Drunk Alcoholic
Faizal is very sad after finding out that he is responsible for Sardar's death. He tries to drown his sorrows in alcohol and gets very drunk. Now he wants to return home but is unable to walk straight. For every
3
3 steps forward, he ends up walking one step backward.

Formally, in the
1
s
t
1
st
  second he moves
3
3 steps forward, in the
2
n
d
2
nd
  second he moves
1
1 step backwards, in the
3
r
d
3
rd
  second he moves
3
3 steps forward, in
4
t
h
4
th
  second
1
1 step backwards, and so on.

How far from his initial position will Faizal be after
k
k seconds have passed? Assume that Faizal's initial position is
0
0.

Input Format
The first line of input contains a single integer
T
T denoting the number of test cases. The description of
T
T test cases follows.
The first line of each test case contains a single integer
k
k, the number of seconds after which Faizal's position is to be calculated.
Output Format
For each test case, output a single line containing one integer - Faizal's position after
k
k seconds.
Constraints
1
≤
T
≤
100000
1≤T≤100000
0
≤
k
≤
100000
0≤k≤100000
The sum of
k
k over all test cases does not exceed
1000000
1000000

---Input---
3
5
11
23

---Output---
7
13
25
**/

import java.util.Scanner;

public class DrunkAlcoholic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int k = sc.nextInt();
            if (k == 0) {
                System.out.println(0);
            } else if (k == 1) {
                System.out.println(3);
            } else if (k % 2 != 0) {
                System.out.println(k + 2);
            } else {
                System.out.println(k);
            }
        }
    }
}
