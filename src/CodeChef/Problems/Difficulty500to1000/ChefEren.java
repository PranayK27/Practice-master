package CodeChef.Problems.Difficulty500to1000;

/*
Chef Eren
Chef is a very big fan of Eren Yeager.

In the last season of Attack on Titan, there were
N
N episodes numbered from
1
1 to
N
N.
Each even indexed episode was
A
A minutes long and each odd indexed episode was
B
B minutes long.

Calculate the total duration (in minutes) of the last season.

Input Format
The first line of input contains a single integer
T
T, the number of test cases.
The first and only line of each test case contains three integers
N
N,
A
,
A, and
B
B, the number of episodes and the durations of each even-indexed and odd-indexed episodes respectively in minutes.
Output Format
For each test case, print a single integer on a new line, the total duration of the last season in minutes.

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
60
1≤N≤60
1
≤
A
,
B
≤
60
1≤A,B≤60

---Input---
3
1 2 2
2 3 4
4 20 30
---Output---
2
7
100
**/

import java.util.Scanner;

public class ChefEren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int e=0, o=0;

            for(int i=0; i<=n; i++){
                if(i==0 || i==1){
                    e=0;
                    o=1;
                } else if(i%2 == 0){
                    e++;
                } else if(i%2!=0){
                    o++;
                }
            }
            System.out.println((e*a)+(o*b));
        }

    }
}
