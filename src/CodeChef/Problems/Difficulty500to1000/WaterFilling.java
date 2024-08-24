package CodeChef.Problems.Difficulty500to1000;

/*
Water Filling
Chef has three water bottles. At any point, if at least two of them are empty, she will fill them up. But if at most one bottle is empty, she will wait, and not fill them up now.

You are given three integers -
B
1
,
B
2
,
B
1
​
 ,B
2
​
 , and
B
3
B
3
​
 .
If
B
1
=
1
B
1
​
 =1, it means that the first bottle is full.
If
B
1
=
0
B
1
​
 =0, it means that the first bottle is empty.
Similarly,
B
2
B
2
​
  denotes whether the second bottle is full or empty, and
B
3
B
3
​
  denotes it for the third bottle.

Output "Water filling time", if Chef has to fill the bottles now. If not, output "Not now".

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
The only line of each test case contains three space-separated integers,
B
1
,
B
2
,
B
3
B
1
​
 ,B
2
​
 ,B
3
​
 .
Output Format
For each test case, output on a new line, either "Water filling time", or "Not now".

Constraints
1
≤
T
≤
1000
1≤T≤1000
B
i
B
i
​
  is either
0
0 or
1
1

---Input---
5
0 0 0
1 1 1
1 1 0
0 1 0
0 1 1
---Output---
Water filling time
Not now
Not now
Water filling time
Not now
**/

import java.util.Scanner;

public class WaterFilling {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int b1 = sc.nextInt();
            int b2 = sc.nextInt();
            int b3 = sc.nextInt();

            if((b1 == 1) && ((b2 | b3) == 1)) System.out.println("Not now");
            else if((b2== 1) && ((b1 | b3) == 1)) System.out.println("Not now");
            else if((b3== 1) && ((b2 | b2) == 1)) System.out.println("Not now");
            else System.out.println("Water filling time");
        }
    }
}
