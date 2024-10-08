package CodeChef.Problems.Difficulty500to1000;
/*
Fill Candies
Chef received
N
N candies on his birthday. He wants to put these candies in some bags. A bag has
K
K pockets and each pocket can hold at most
M
M candies. Find the minimum number of bags Chef needs so that he can put every candy into a bag.

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
Each test case consists of a single line containing three space-separated integers
N
,
K
,
M
N,K,M.
Output Format
For each test case, print the minimum number of bags Chef needs so that he can put all the candies in one of the bags.

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
K
,
M
≤
100
1≤N,K,M≤100

---Input---
4
6 2 3
3 1 2
8 4 1
25 4 2
---Output---
1
2
2
4
**/

import java.util.Scanner;

public class FillCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            if (n==(k*m) || n%(k*m) == 0){
                System.out.println(n/(k*m));
            } else if(n>(k*m)) {
                System.out.println(n/(k*m)+1);
            } else if(n<(k*m)){
                System.out.println("1");
            }
        }
    }
}
