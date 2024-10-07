package CodeChef.Problems.Difficulty500to1000;

/*
Minimum Cars required
A single car can accommodate at most
4
4 people.

N
N friends want to go to a restaurant for a party. Find the minimum number of cars required to accommodate all the friends.

Input Format
The first line contains a single integer
T
T - the number of test cases. Then the test cases follow.
The first and only line of each test case contains an integer
N
N - denoting the number of friends.
Output Format
For each test case, output the minimum number of cars required to accommodate all the friends.

Constraints
1
≤
T
≤
1000
1≤T≤1000
2
≤
N
≤
1000
2≤N≤1000

---Input---
4
4
2
7
98
---Output---
1
1
2
25
**/

import java.util.Scanner;

public class MinimumCarsRequired {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            if(n%4==0){
                System.out.println(n/4);
            } else System.out.println((n/4)+1);
        }
    }
}
