package CodeChef.Problems.Difficulty500to1000;

/*
Chef and Candies
There are
N
N children and Chef wants to give them
1
1 candy each. Chef already has
X
X candies with him. To buy the rest, he visits a candy shop. In the shop, packets containing exactly
4
4 candies are available.

Determine the minimum number of candy packets Chef must buy so that he is able to give
1
1 candy to each of the
N
N children.

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
The first and only line of each test case contains two integers
N
N and
X
X — the number of children and the number of candies Chef already has.
Output Format
For each test case, output the minimum number of candy packets Chef must buy so that he is able to give
1
1 candy to each of the
N
N children.

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
,
X
≤
100
1≤N,X≤100

---Input---
4
20 12
10 100
10 9
20 9
---Output---
2
0
1
3
**/

import java.util.Scanner;

public class ChefAndCandies {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int childrens=sc.nextInt();
            int candies=sc.nextInt();

            int perPacket=4;

            if(candies<childrens){
                if((childrens-candies)%4==0){
                    System.out.println((childrens-candies)/4);
                } else{
                    System.out.println((childrens-candies)/4 + 1);
                }
            } else{
                System.out.println("0");
            }
        }
    }
}
