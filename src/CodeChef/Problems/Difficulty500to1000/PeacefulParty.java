package CodeChef.Problems.Difficulty500to1000;

import java.util.Scanner;

/*
Peaceful Party
The mayor of your city has decided to throw a party to gather the favour of his people in different regions of the city.

There are
3
3 distinct regions in the city namely
A
A,
B
B,
C
C comprising of
P
A
P
A
​
 ,
P
B
P
B
​
  and
P
C
P
C
​
  number of people respectively.

However, the mayor knows that people of the region
B
B are in conflict with people of regions
A
A and
C
C. So, there will be a conflict if people from region
B
B are present at the party along with people from region
A
A or
C
C.

The mayor wants to invite as many people as possible and also avoid any conflicts. Help him invite maximum number of people to the party.

Input Format
The first line contains a single integer
T
T - the number of test cases. Then the test cases follow.
The first line of each test case contains three integers
P
A
P
A
​
 ,
P
B
P
B
​
  and
P
C
P
C
​
  - number of people living in regions
A
A,
B
B and
C
C respectively.
Output Format
For each test case, output the maximum number of people that can be invited to the party.

Constraints
1
≤
T
≤
1000
1≤T≤1000
1
≤
P
A
,
P
B
,
P
C
≤
1000
1≤P
A
​
 ,P
B
​
 ,P
C
​
 ≤1000

---Input---
3
2 3 4
1 5 2
8 8 8
---Output---
6
5
16
**/

public class PeacefulParty {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

            System.out.println(Math.max(b, a+c));
        }

    }

}
