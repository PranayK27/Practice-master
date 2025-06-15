package CodeChef.Problems.Difficulty500to1000;
/*
Chef On Island
Suppose Chef is stuck on an island and currently he has
x
x units of food supply and
y
y units of water supply in total that he could collect from the island. He needs
x
r
x
r
​
  units of food supply and
y
r
y
r
​
  units of water supply per day at the minimal to have sufficient energy to build a boat from the woods and also to live for another day. Assuming it takes exactly
D
D days to build the boat and reach the shore, tell whether Chef has the sufficient amount of supplies to be able to reach the shore by building the boat?

Input:
First line will contain
T
T, number of testcases. Then the testcases follow.
Each testcase contains of a single line of input, five integers
x
,
y
,
x
r
,
y
r
,
D
x,y,x
r
​
 ,y
r
​
 ,D.
Output:
For each testcase, output in a single line answer "YES" if Chef can reach the shore by building the boat and "NO" if not (without quotes).

You may print each character of each string in uppercase or lowercase (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).

Constraints
1
≤
T
≤
300
1≤T≤300
1
≤
x
,
y
≤
100
1≤x,y≤100
1
≤
x
r
,
y
r
,
D
≤
10
1≤x
r
​
 ,y
r
​
 ,D≤10

---Input---
3
4 2 1 1 1
4 2 1 3 1
4 2 4 2 2
---Output---
YES
NO
NO
**/


import java.util.Scanner;

public class ChefOnIsland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int D = sc.nextInt();
            if(x >= (x1*D) && y >= (y1*D)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
