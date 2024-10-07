package CodeChef.Problems.Difficulty500to1000;

/*
Mario and Transformation
Mario transforms each time he eats a mushroom as follows:

If he is currently small, he turns normal.
If he is currently normal, he turns huge.
If he is currently huge, he turns small.
Given that Mario was initially normal, find his size after eating
X
X mushrooms.

Input Format
The first line of input will contain one integer
T
T, the number of test cases. Then the test cases follow.
Each test case contains a single line of input, containing one integer
X
X.
Output Format
For each test case, output in a single line Mario's size after eating
X
X mushrooms.

Print:

NORMAL
NORMAL, if his final size is normal.
HUGE
HUGE, if his final size is huge.
SMALL
SMALL, if his final size is small.
You may print each character of the answer in either uppercase or lowercase (for example, the strings
Huge
Huge,
hUgE
hUgE,
huge
huge and
HUGE
HUGE will all be treated as identical).

Constraints
1≤T≤100
1≤X≤100

---Input---
3
2
4
12
---Output---
SMALL
HUGE
NORMAL
**/

import java.util.Scanner;

public class MarioTransformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            if (x == 0 || (x % 3) == 0) {
                System.out.println("Normal");
            } else if ((x % 3) == 1) {
                System.out.println("Huge");
            } else if ((x % 3) != 0) {
                System.out.println("Small");
            }
        }
    }
}
