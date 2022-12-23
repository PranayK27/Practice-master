package CodeChef.Bronze;

import java.util.Scanner;

/*
Problem
Most programmers will tell you that one of the ways to improve your performance in competitive programming is to practice a lot of problems.

Our Chef took the above advice very seriously and decided to set a target for himself.

Chef decides to solve at least 1010 problems every week for 44 weeks.
Given the number of problems he actually solved in each week over 44 weeks as P_1, P_2, P_3,P
1
​
 ,P
2
​
 ,P
3
​
 , and P_4P
4
​
 , output the number of weeks in which Chef met his target.

Input Format
There is a single line of input, with 44 integers P_1, P_2, P_3,P
1
​
 ,P
2
​
 ,P
3
​
 , and P_4P
4
​
 . These are the number of problems solved by Chef in each of the 44 weeks.

Output Format
Output a single integer in a single line - the number of weeks in which Chef solved at least 1010 problems.

Constraints

1 ≤ P1, P2, P3, P4 ≤ 100
Sample 1:
Input
Output
12 15 8 10
3
Explanation:
Chef solved at least 10 problems in the first, second and fourth weeks. He failed to solve at least 10 problems in the third week. Hence, the number of weeks in which Chef met his target is 3.

Sample 2:
Input
2 3 1 10
Output
1
Explanation:
Chef solved at least 10 problems in the fourth week. He failed to solve at least 10 problems in all the other three weeks. Hence, the number of weeks in which Chef met his target is 1.

Sample 3:
Input
12 100 99 11
Output
4
Explanation:
Chef solved at least 10 problems in all the four weeks. Hence, the number of weeks in which Chef met his target is 4.

Sample 4:
Input
1 1 1 1
Output
0
Explanation:
Chef was not able to solve at least 10 problems in any of the four weeks. Hence, the number of weeks in which Chef met his target is 0.
* */

public class PracticeMakesUsPerfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        int count=0;
        for(int x=0; x<arr.length; x++){
            int numOfSolved=sc.nextInt();
            if(numOfSolved>=10){
                count++;
            }
        }
        System.out.println(count);
    }
}
