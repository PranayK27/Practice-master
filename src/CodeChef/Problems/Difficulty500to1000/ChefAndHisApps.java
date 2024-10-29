package CodeChef.Problems.Difficulty500to1000;

/*
Chef's phone has a total storage of
S
S MB. Also, Chef has
2
2 apps already installed on his phone which occupy
X
X MB and
Y
Y MB respectively.

He wants to install another app on his phone whose memory requirement is
Z
Z MB. For this, he might have to delete the apps already installed on his phone. Determine the minimum number of apps he has to delete from his phone so that he has enough memory to install the third app.

Input Format
The first line contains a single integer
T
T — the number of test cases. Then the test cases follow.
The first and only line of each test case contains four integers
S
,
X
,
Y
S,X,Y and
Z
Z — the total memory of Chef's phone, the memory occupied by the two already installed apps and the memory required by the third app.
Output Format
For each test case, output the minimum number of apps Chef has to delete from his phone so that he can install the third app.

Constraints
1
≤
T
≤
1000
1≤T≤1000
1
≤
S
≤
500
1≤S≤500
1
≤
X
≤
Y
≤
S
1≤X≤Y≤S
X
+
Y
≤
S
X+Y≤S
Z
≤
S
Z≤S

---Input---
4
10 1 2 3
9 4 5 1
15 5 10 15
100 20 30 75
---Output---
0
1
2
1
**/


import java.util.Scanner;

public class ChefAndHisApps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int s = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            if(x+y+z<=s) System.out.println("0");
            else if(x+z<=s || y+z<=s) System.out.println("1");
            else System.out.println("2");
            }

        }
    }
