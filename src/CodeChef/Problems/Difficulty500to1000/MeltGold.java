package CodeChef.Problems.Difficulty500to1000;
/*
Melt Gold
Chef has an ore with melting point of
X
X degrees.
Chef’s kiln has a initial temperature of
Y
Y degrees. The temperature of the kiln increases by
i
i degrees after the
i
t
h
i
th
  minute.

Find the minimum time in minutes after which the ore starts melting.

Note:

We are only concerned about the temperature at the end of each minute and not during a minute.
The ore starts melting if the temperature of the kiln becomes greater than or equal to the melting point.
Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
Each test case consists of two space-separated integers
X
X and
Y
Y — the melting point of the ore and the initial temperature of kiln.
Output Format
For each test case, output on a new line, the minimum time in minutes after which the ore starts melting.

Constraints
1
≤
T
≤
1
0
5
1≤T≤10
5

1
≤
Y
<
X
≤
1
0
5
1≤Y<X≤10
5

---Input---
3
3 2
5 3
10 5
---Output---
1
2
3
**/

import java.util.Scanner;

public class MeltGold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int time = 0;
            int increment = 1;

            while (y < x) {
                y += increment;
                increment++;
                time++;
            }

            System.out.println(time);
        }
    }
}
