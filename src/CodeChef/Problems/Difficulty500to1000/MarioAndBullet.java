package CodeChef.Problems.Difficulty500to1000;

/*
Mario and Bullet
Mario's bullet moves at
X
X pixels per frame. He wishes to shoot a goomba standing
Y
Y pixels away from him. The goomba does not move.

Find the minimum time (in seconds) after which Mario should shoot the bullet, such that it hits the goomba after at least
Z
Z seconds from now.

Input Format
The first line of input will contain an integer
T
T, the number of test cases. Then the test cases follow.
Each test case consists of a single line of input, containing three space-separated integers
X
,
Y
,
X,Y, and
Z
Z.
Output Format
For each test case, output in a single line the minimum time (in seconds) after which Mario should shoot the bullet, such that it hits the goomba after at least
Z
Z seconds from now.

Constraints
1≤T≤100
1≤X,Y,Z≤100
X divides Y

---Input---
3
3 3 5
2 4 1
3 12 8
---Output---
4
0
4

**/

import java.util.Scanner;

public class MarioAndBullet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            if (x <= y) {
                if ((y % x) == 0 && (y / x) < z) {
                    System.out.println(z - (y / x));
                } else {
                    System.out.println("0");
                }
            } else {
                System.out.println("0");
            }
        }
    }
}
