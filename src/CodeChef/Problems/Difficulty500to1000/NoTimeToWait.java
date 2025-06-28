package CodeChef.Problems.Difficulty500to1000;
/*
No Time to Wait
Read problem statements in Bengali, Mandarin Chinese, Russian, and Vietnamese as well.
Only
x
x hours are left for the March Long Challenge and Chef is only left with the last problem unsolved. However, he is sure that he cannot solve the problem in the remaining time. From experience, he figures out that he needs exactly
H
H hours to solve the problem.

Now Chef finally decides to use his special power which he has gained through years of intense yoga. He can travel back in time when he concentrates. Specifically, his power allows him to travel to
N
N different time zones, which are
T
1
,
T
2
,
…
,
T
N
T
1
​
 ,T
2
​
 ,…,T
N
​
  hours respectively behind his current time.

Find out whether Chef can use one of the available time zones to solve the problem and submit it before the contest ends.

Input
The first line of the input contains three space-separated integers
N
N,
H
H and
x
x.
The second line contains
N
N space-separated integers
T
1
,
T
2
,
…
,
T
N
T
1
​
 ,T
2
​
 ,…,T
N
​
 .
Output
Print a single line containing the string "YES" if Chef can solve the problem on time or "NO" if he cannot.

You may print each character of each string in uppercase or lowercase (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).

Constraints
1
≤
N
≤
100
1≤N≤100
1
≤
x
<
H
≤
100
1≤x<H≤100
1
≤
T
i
≤
100
1≤T
i
​
 ≤100 for each valid
i
i

---Input---
2 5 3
1 2
---Output---
YES
---Input---
2 6 3
1 2
---Output---
NO
* */


import java.util.Scanner;

public class NoTimeToWait {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[N];
        int f=0;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            if (x+arr[i]>=H){
                f=1;
            }
        }
        if (f==1){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
