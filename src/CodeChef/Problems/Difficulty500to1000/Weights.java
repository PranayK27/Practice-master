package CodeChef.Problems.Difficulty500to1000;

/*
Chef is playing with weights. He has an object weighing
W
W units. He also has three weights each of
X
,
Y
,
X,Y, and
Z
Z units respectively. Help him determine whether he can measure the exact weight of the object with one or more of these weights.

If it is possible to measure the weight of object with one or more of these weights, print YES, otherwise print NO.

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
Each test case consists of single line containing a four positive integers
W
,
X
,
Y
,
W,X,Y, and
Z
Z.
Output Format
For each test case, output on a new line YES if it is possible to measure the weight of object with one or more of these weights, otherwise print NO.

You may print each character of the string in either uppercase or lowercase (for example, the strings yes, YES, Yes, and yeS will all be treated as identical).

Constraints
1≤T≤10^4
1≤W,X,Y,Z≤10^5

---Input---
4
5 2 1 6
7 9 7 2
20 8 10 12
20 10 11 12

---Output---
NO
YES
YES
NO

**/

import java.util.Scanner;

public class Weights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int w = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int xy = x+y;
            int yz = y+z;
            int xz = x+z;
            int xyz = x+y+z;

            if(w == x || w == y || w == z || w == xy || w == yz || w == xz || w == xyz){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
