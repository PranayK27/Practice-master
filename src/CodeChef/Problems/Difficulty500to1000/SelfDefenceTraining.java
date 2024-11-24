package CodeChef.Problems.Difficulty500to1000;

/*
Self Defence Training
After the phenomenal success of the 36th Chamber of Shaolin, San Te has decided to start 37th Chamber of Shaolin. The aim this time is to equip women with shaolin self-defence techniques.

The only condition for a woman to be eligible for the special training is that she must be between
10
10 and
60
60 years of age, inclusive of both
10
10 and
60
60.

Given the ages of
N
N women in his village, please help San Te find out how many of them are eligible for the special training.

Input Format
The first line of input contains a single integer
T
T, denoting the number of test cases. The description of
T
T test cases follows.
The first line of each test case contains a single integer
N
N, the number of women.
The second line of each test case contains
N
N space-separated integers
A
1
,
A
2
,
.
.
.
,
A
N
A
1
​
 ,A
2
​
 ,...,A
N
​
 , the ages of the women.
Output Format
For each test case, output in a single line the number of women eligible for self-defence training.

Constraints
1
≤
T
≤
20
1≤T≤20
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
≤
100
1≤A
i
​
 ≤100

---Input---
3
3
15 23 65
3
15 62 16
2
35 9
---Output---
2
2
1
**/

import java.util.Scanner;

public class SelfDefenceTraining {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] ages = new int[n];
            int count = 0;
            for (int i = 0; i < n; i++) {
                ages[i] = sc.nextInt();
                if (ages[i] >= 10 && ages[i] <= 60) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
