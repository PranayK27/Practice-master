package CodeChef.Problems.Difficulty500to1000;

/*
Chef in his Office
Recently Chef joined a new company. In this company, the employees have to work for
X
X hours each day from Monday to Thursday. Also, in this company, Friday is called Chill Day — employees only have to work for
Y
Y hours
(
Y
<
X
)
(Y<X) on Friday. Saturdays and Sundays are holidays.

Determine the total number of working hours in one week.

Input Format
The first line contains a single integer
T
T — the number of test cases. Then the test cases follow.
The first and only line of each test case contains two space-separated integers
X
X and
Y
Y — the number of working hours on each day from Monday to Thursday and the number of working hours on Friday respectively.
Output Format
For each test case, output the total number of working hours in one week.

Constraints
1
≤
T
≤
100
1≤T≤100
2
≤
X
≤
12
2≤X≤12
1
≤
Y
<
X
1≤Y<X

---Input---
3
10 5
12 2
8 7
---Output---
45
50
39
**/

import java.util.Scanner;

public class ChefInHisOffice {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println((x*4)+y);
        }
    }
}
