package CodeChef.Problems.Difficulty500to1000;

import java.util.Scanner;

/*
Chef and Races
The National Championships are starting soon. There are
4
4 race categories, numbered from
1
1 to
4
4, that Chef is interested in. Chef is participating in exactly
2
2 of these categories.

Chef has an arch-rival who is, unfortunately, the only person participating who is better than Chef, i.e, Chef can't defeat the arch-rival in any of the four race categories but can defeat anyone else. Chef's arch-rival is also participating in exactly
2
2 of the four categories.

Chef hopes to not fall into the same categories as that of the arch-rival.

Given
X
,
Y
,
A
,
B
X,Y,A,B where
X
,
Y
X,Y are the races that Chef participates in, and
A
,
B
A,B are the races that Chef's arch-rival participates in, find the maximum number of gold medals (first place) that Chef can win.

Input Format
The first line of input contains an integer
T
T, denoting the number of testcases. The description of
T
T testcases follows.
Each testcase consists of a single line containing four space-separated integers — the values of
X
,
Y
,
A
X,Y,A, and
B
B respectively.
Output Format
For each testcase, print a single line containing one integer — the maximum number of gold medals that Chef can win.
Constraints
1
≤
T
≤
144
1≤T≤144
1
≤
X
,
Y
,
A
,
B
≤
4
1≤X,Y,A,B≤4
X
≠
Y
X=Y
A
≠
B
A=B

---Input---
3
4 3 1 2
4 2 1 2
2 1 1 2
---Output---
2
1
0
**/
public class ChefAndRaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            if((x != a && x != b) && (y != a && y != b)){
                System.out.println(2);
            } else if((x != a && x != b) || (y != a && y != b)){
                System.out.println(1);
            } else if((x == a || x == b) && (y == a || y == b)){
                System.out.println(0);
            }
        }
    }
}
