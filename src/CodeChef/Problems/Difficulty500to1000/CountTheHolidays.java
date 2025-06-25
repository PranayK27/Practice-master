package CodeChef.Problems.Difficulty500to1000;
/*
Count the Holidays
A particular month has
30
30 days, numbered from
1
1 to
30
30.

Day
1
1 is a Monday, and the usual
7
7-day week is followed (so day
2
2 is Tuesday, day
3
3 is Wednesday, and so on).

Every Saturday and Sunday is a holiday. There are
N
N festival days, which are also holidays. Note that it is possible for a festival day to occur on a Saturday or Sunday.

You are given the dates of the festivals. Determine the total number of holidays in this month.

Input Format
The first line of input contains a single integer
T
T, denoting the number of test cases. The description of
T
T test cases follows.
The first line of each test case contains an integer
N
N denoting the number of festival days.
The second line of each test case contains
N
N distinct space-separated integers
A
1
,
A
2
,
…
A
N
A
1
​
 ,A
2
​
 ,…A
N
​
 , denoting the festival days. Note that the
A
i
A
i
​
  are not necessarily given in sorted order.
Output Format
For each test case, output a new line containing the total number of holidays.

Constraints
1
≤
T
≤
1000
1≤T≤1000
1
≤
N
≤
30
1≤N≤30
1
≤
A
i
≤
30
1≤A
i
​
 ≤30
All the
A
i
A
i
​
  are distinct

---Input---
3
2
5 7
3
23 1 6
1
13
---Output---
9
10
8
**/

import java.util.Scanner;

public class CountTheHolidays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int c = 8;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i]==6 || arr[i]==7 || arr[i]==13 | arr[i]==14 || arr[i]==20 || arr[i]==21 || arr[i]==27 || arr[i]==28){
                    continue;
                } else {
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}
