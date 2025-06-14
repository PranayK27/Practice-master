package CodeChef.Problems.Difficulty500to1000;
/*
Counting Pretty Numbers
Read problems statements in Mandarin chinese, Russian and Vietnamese as well.
Vasya likes the number
239
239. Therefore, he considers a number pretty if its last digit is
2
2,
3
3 or
9
9.

Vasya wants to watch the numbers between
L
L and
R
R (both inclusive), so he asked you to determine how many pretty numbers are in this range. Can you help him?

Input
The first line of the input contains a single integer
T
T denoting the number of test cases. The description of
T
T test cases follows.
The first and only line of each test case contains two space-separated integers
L
L and
R
R.
Output
For each test case, print a single line containing one integer — the number of pretty numbers between
L
L and
R
R.

Constraints
1
≤
T
≤
100
1≤T≤100
1
≤
L
≤
R
≤
1
0
5
1≤L≤R≤10
5

---Input---
2
1 10
11 33
---Output---
3
8
**/


import java.util.Scanner;

public class CountingPrettyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int counter=0;
            for(int i=l; i<=r; i++){
                if(String.valueOf(i).endsWith("2") || String.valueOf(i).endsWith("3") || String.valueOf(i).endsWith("9")){
                    counter++;
                }
            }
            System.out.println(counter);
        }
    }
}
