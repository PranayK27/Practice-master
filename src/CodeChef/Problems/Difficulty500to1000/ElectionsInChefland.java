package CodeChef.Problems.Difficulty500to1000;

/*
Elections in Chefland
Election season has started in Chefland and the election commission wants to know the count of eligible voters.

There are
N
N people in Chefland where the age of the
i
t
h
i
th
  person in
A
i
A
i
​
 .
Given that a person needs to be at least
X
X years old to vote, find the number of eligible voters.

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
Each test case consists of multiple lines of input.
The first line of each test case contains two space-separated integers
N
N and
X
X — the number of people in Chefland, and the minimum age required for a person to vote in Chefland.
The next line contains
N
N space-separated integers, where the
i
t
h
i
th
  integer denotes the age of the
i
t
h
i
th
  person.
Output Format
For each test case, output on a new line, the number of eligible voters in Chefland.

Constraints
1
≤
T
≤
200
1≤T≤200
1
≤
N
≤
100
1≤N≤100
1
≤
A
i
,
X
≤
100
1≤A
i
​
 ,X≤100

 ---Input---
 4
4 3
5 3 1 2
3 2
1 3 4
4 2
2 1 2 4
5 6
1 2 3 4 5
 ---Output---
 2
2
3
0
**/

import java.util.Scanner;

public class ElectionsInChefland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int c=0;
            while(n-->0){
                int ni = sc.nextInt();
                if(ni>=x){
                    c++;
                }
            } System.out.println(c);

        }
    }
}
