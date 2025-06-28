package CodeChef.Problems.Difficulty500to1000;
/*
Shoe Fit
Read problems statements in Mandarin Chinese, Russian, Vietnamese and Bengali as well.
You have three shoes of the same size lying around. Each shoe is either a left shoe (represented using
0
0) or a right shoe (represented using
1
1). Given
A
A,
B
B,
C
C, representing the information for each shoe, find out whether you can go out now, wearing one left shoe and one right shoe.

Input Format
The first line contains an integer
T
T, the number of test cases. Then the test cases follow.
Each test case contains a single line of input, three integers
A
A,
B
B,
C
C.
Output Format
For each test case, output in a single line the answer:
1
1 if it's possible to go out with a pair of shoes and
0
0 if not.

Constraints
1
≤
T
≤
8
1≤T≤8
0
≤
A
,
B
,
C
≤
1
0≤A,B,C≤1

---Input---
3
0 0 0
0 1 1
1 0 1
---Output---
0
1
1
**/


import java.util.Scanner;

public class ShoeFit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(((a==0 && b==1) || (a==1 && b==0)) || ((a==0 && c==1) || (a==1 && c==0)) || (b==0 && c==1) || (b==1 && c==0)){
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
