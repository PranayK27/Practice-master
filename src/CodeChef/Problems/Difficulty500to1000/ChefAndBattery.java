package CodeChef.Problems.Difficulty500to1000;

import java.util.Scanner;

/*
Chef and Battery
Chef's phone has a battery level of
N
N percent.
Each minute:

If the phone is on charging, the battery level increases by
2
%
2%.
Otherwise, the battery level decreases by
3
%
3%.
Find the minimum time in which Chef can make the battery level reach exactly
50
%
50%.
Note that the battery level should always lie in the range
0
0 to
100
100 (both included).

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
Each test case consists of single lines of input
N
N - the current battery level of Chef's phone.
Output Format
For each test case, output on a new line the minimum time in which Chef can make the battery level reach exactly
50
%
50%.

Constraints
1
≤
T
≤
1000
1≤T≤1000
0
≤
N
≤
100
0≤N≤100

---Input---
4
51
50
23
0
---Output---
2
0
16
25
**/
public class ChefAndBattery {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a=0;
            while(n!=50){
                if(n<50){
                    n = n + 2;
                    a++;
                } else {
                    n = n - 3;
                    a++;
                }
            }
            System.out.println(a);
        }
    }
}
