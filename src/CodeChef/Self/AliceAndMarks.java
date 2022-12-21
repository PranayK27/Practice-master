package CodeChef.Self;

import java.util.Scanner;

/*
Problem
Alice has scored X marks in her test and Bob has scored Y marks in the same test. Alice is happy if she scored at least twice the marks of Bob’s score. Determine whether she is happy or not.

Input Format
The first and only line of input contains two space-separated integers X,Y — the marks of Alice and Bob respectively.
Output Format
For each testcase, print Yes if Alice is happy and No if she is not, according to the problem statement.

The judge is case insensitive so you may output the answer in any case. In particular YES, yes, yEsare all considered equivalent toYes`.

Constraints
1 \leq X, Y \leq 1001≤X,Y≤100
Sample 1:
Input
2 1
Output
Yes
Explanation:
Alice has scored X=2 marks whereas Bob has scored Y=1 mark. As Alice has scored twice as much as Bob (i.e. X≥2Y), the answer is Yes.

Sample 2:
Input
1 2
Output
No
Explanation:
Alice has scored X=1 mark whereas Bob has scored Y=2 marks. As Alice has not scored twice as much as Bob (i.e. X<2Y), the answer is No.
* */

public class AliceAndMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marksofAlice=sc.nextInt();
        int marksofBob=sc.nextInt();

        if(marksofAlice>=(marksofBob*2)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
