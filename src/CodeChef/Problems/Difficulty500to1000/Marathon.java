package CodeChef.Problems.Difficulty500to1000;
/*
Marathon
Read problems statements in Mandarin Chinese, Russian, Vietnamese and Bengali as well.
Chefland is holding a virtual marathon for the categories
10
10 km,
21
21 km and
42
42 km having prizes
A
,
B
,
C
A,B,C (
A
<
B
<
C
A<B<C) respectively to promote physical fitness. In order to claim the prize in a particular category the person must cover the total distance for that category within
D
D days. Also a single person cannot apply in multiple categories.

Given the maximum distance
d
d km that Chef can cover in a single day, find the maximum prize that Chef can win at the end of
D
D days. If Chef can't win any prize, print
0
0.

Input Format
The first line contains an integer
T
T, the number of test cases. Then the test cases follow.
Each test case contains a single line of input, five integers
D
,
d
,
A
,
B
,
C
D,d,A,B,C.
Output Format
For each test case, output in a single line the answer to the problem.

Constraints
1
≤
T
≤
50
1≤T≤50
1
≤
D
≤
10
1≤D≤10
1
≤
d
≤
5
1≤d≤5
1
≤
A
<
B
<
C
≤
10
5
1≤A<B<C≤10
5

---Input---
3
1 1 1 2 3
10 1 1 2 3
10 3 1 2 3
---Output---
0
1
2
**/


import java.util.Scanner;

public class Marathon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int D=sc.nextInt();
            int d=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int chef = d*D;
            if (chef >=10 && chef <21){
                System.out.println(a);
            } else if (chef >=21 && chef<43){
                System.out.println(b);
            } else if (chef >=43){
                System.out.println(c);
            } else {
                System.out.println(0);
            }
        }
    }
}
