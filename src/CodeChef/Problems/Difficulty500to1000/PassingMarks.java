package CodeChef.Problems.Difficulty500to1000;
/*
Passing Marks
Read problems statements in Mandarin Chinese, Russian, and Bengali as well.
Recently, Chef's College Examination has concluded. He was enrolled in
3
3 courses and he scored
A
,
B
,
C
A,B,C in them, respectively. To pass the semester, he must score at least
A
m
i
n
,
B
m
i
n
,
C
m
i
n
A
min
​
 ,B
min
​
 ,C
min
​
  marks in the respective subjects along with a cumulative score of at least
T
m
i
n
T
min
​
 , i.e,
A
+
B
+
C
≥
T
m
i
n
A+B+C≥T
min
​
 .

Given seven integers
A
m
i
n
,
B
m
i
n
,
C
m
i
n
,
T
m
i
n
,
A
,
B
,
C
A
min
​
 ,B
min
​
 ,C
min
​
 ,T
min
​
 ,A,B,C, tell whether Chef passes the semester or not.

###Input:

The first line will contain
T
T, number of testcases. Then the testcases follow.
Each testcase contains of a single line of input, seven integers
A
m
i
n
,
B
m
i
n
,
C
m
i
n
,
T
m
i
n
,
A
,
B
,
C
A
min
​
 ,B
min
​
 ,C
min
​
 ,T
min
​
 ,A,B,C each separated by aspace.
###Output: Output in a single line, the answer, which should be "YES" if Chef passes the semester and "NO" if not.

You may print each character of the string in uppercase or lowercase (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).

###Constraints

1
≤
T
≤
100
1≤T≤100
1
≤
A
m
i
n
,
B
m
i
n
,
C
m
i
n
,
A
,
B
,
C
≤
100
1≤A
min
​
 ,B
min
​
 ,C
min
​
 ,A,B,C≤100
A
m
i
n
+
B
m
i
n
+
C
m
i
n
≤
T
m
i
n
≤
300
A
min
​
 +B
min
​
 +C
min
​
 ≤T
min
​
 ≤300


---Input---
5
1 1 1 300 2 2 2
3 2 2 6 2 2 2
2 3 2 6 2 2 2
2 2 3 6 2 2 2
100 100 100 300 100 100 100
---Output---
NO
NO
NO
NO
YES
**/

import java.util.Scanner;

public class PassingMarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int amin=sc.nextInt();
            int bmin=sc.nextInt();
            int cmin=sc.nextInt();
            int tmin=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if ((a >= amin && b >= bmin && c>=cmin) && ((a+b+c) >= tmin)){
                System.out.println("YES");
            } else if((a < amin || b < bmin || c < cmin) || ((a+b+c) < tmin)) {
                System.out.println("NO");
            }
        }
    }
}
