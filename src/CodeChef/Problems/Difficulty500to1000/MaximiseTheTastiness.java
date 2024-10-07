package CodeChef.Problems.Difficulty500to1000;

/*
Maximise the Tastiness
Chef is making a dish that consists of exactly two ingredients. He has four ingredients
A
,
B
,
C
A,B,C and
D
D with tastiness
a
,
b
,
c
,
a,b,c, and
d
d respectively. He can use either
A
A or
B
B as the first ingredient and either
C
C or
D
D as the second ingredient.

The tastiness of a dish is the sum of tastiness of its ingredients. Find the maximum possible tastiness of the dish that the chef can prepare.

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
The first and only line of each test case contains four space-separated integers
a
,
b
,
c
,
a,b,c, and
d
d — the tastiness of the four ingredients.
Output Format
For each test case, output on a new line the maximum possible tastiness of the dish that chef can prepare.

Constraints
1
≤
T
≤
100
1≤T≤100
1
≤
a
,
b
,
c
,
d
≤
100
1≤a,b,c,d≤100

---Input---
2
3 5 6 2
16 15 5 4
---Output---
11
21
**/

import java.util.Scanner;

public class MaximiseTheTastiness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int ac = a+c;
            int ad = a+d;
            int bc = b+c;
            int bd = b+d;
            if(ac >= ad && ac >= bc && ac >= bd){
                System.out.println(ac);
            } else if (ad >= ac && ad >= bc && ad >= bd){
                System.out.println(ad);
            } else if(bc >= ac && bc >= ad && bc >= bd){
                System.out.println(bc);
            } else if(bd >= ac && bd >= ad && bd >= bc){
                System.out.println(bd);
            }
        }
    }
}
