package CodeChef.Problems.Difficulty500to1000;

/*
Second Largest
Three numbers A, B and C are the inputs. Write a program to find second largest among them.

Input Format
The first line contains an integer T, the total number of testcases. Then T lines follow, each line contains three integers A, B and C.

Output Format
For each test case, display the second largest among A, B and C, in a new line.

Constraints
1 ≤ T ≤ 1000
1 ≤ A,B,C ≤ 1000000

---Input---
3
120 11 400
10213 312 10
10 3 450
---Output---
120
312
10
**/

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

            if (a>b && a>c){
                if (b>c){
                    System.out.println(b);
                } else {
                    System.out.println(c);
                }
            } else if (b>a && b>c){
                if (a>c){
                    System.out.println(a);
                } else {
                    System.out.println(c);
                }
            } else if (c>a && c>b){
                if (a>b){
                    System.out.println(a);
                } else {
                    System.out.println(b);
                }
            }
        }

    }
}
