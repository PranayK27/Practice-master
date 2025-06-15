package CodeChef.Problems.Difficulty500to1000;
/*
Find the Direction
Chef is currently facing the north direction. Each second he rotates exactly
90
90 degrees in clockwise direction. Find the direction in which Chef is facing after exactly
X
X seconds.

Note
:
Note: There are only 4 directions: North, East, South, West (in clockwise order).

Input Format
First line will contain
T
T, number of testcases. Then the testcases follow.
Each testcase contains of a single integer
X
X.
Output Format
For each testcase, output the direction in which Chef is facing after exactly
X
X seconds.

Constraints
1
≤
T
≤
100
1≤T≤100
1
≤
X
≤
1000
1≤X≤1000

---Input---
10
4
5
7
8
9
10
12
13
16
15
---Output---
North
East
West
North
East
South
North
East
North
West
**/


import java.util.Scanner;

public class FindTheDirection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if(n%4==1)
                System.out.println("East");
            else if(n%4==2)
                System.out.println("South");
            else if(n%4==3)
                System.out.println("West");
            else
                System.out.println("North");
        }

    }
}
