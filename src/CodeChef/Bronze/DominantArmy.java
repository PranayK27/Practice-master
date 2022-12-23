package CodeChef.Bronze;

import java.util.Scanner;

/*
Problem
In the medieval age, there were 3 kingdoms a, b and c. The army of these kingdom had a, b, c soldiers respectively.

You are given that an army with X soldiers can defeat an army with Y soldiers only if X>Y.

An army is said to be dominant if it can defeat both the other armies combined. For example, kingdom c's army will be dominant only if c > a + b.

Determine whether any of the armies is dominant or not.

Input Format
The first line contains a single integer TT - the number of test cases. Then the test cases follow.
The first and only line of each test case contains three integers a, b, c
  - the number of warriors in the armies of kingdoms a, b, and c respectively.
Output Format
For each test case, output YES if any of the armies is dominant. Otherwise, output NO.

You may print each character of YES and NO in uppercase or lowercase (for example, yes, yEs, Yes will be considered identical).

Constraints
1≤T≤1000
1≤ a, b, c  ≤100
Sample 1:
Input
4
15 5 6
12 13 16
1 1 100
10 10 20
Output
YES
NO
YES
NO
Explanation:
Test case 1: The kingdom AA's army is dominant since 15>5+6.

Test case 2: We can observe that none of the armies is dominant.

Test case 3: The kingdom CC's army is dominant since 100>1+1.

Test case 4: We can observe that none of the armies is dominant. Note that the kingdom CC's army is not dominant since 20≤10+10.


* */

public class DominantArmy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int x=0; x<T; x++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

            if(a>(b+c) || b>(a+c) || c>(a+b)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
    }
}
