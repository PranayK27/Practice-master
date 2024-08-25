package CodeChef.Problems.Difficulty500to1000;

/*
Nearest Exit
There are two exits in a bus with
100
100 seats:

First exit is located beside seat number
1
1.
Second exit is located beside seat number
100
100.
Seats are arranged in a straight line from
1
1 to
100
100 with equal spacing between any
2
2 adjacent seats.

A passenger prefers to choose the nearest exit while leaving the bus.

Determine the exit taken by passenger sitting on seat
X
X.

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
Each test case consists a single integer
X
X, denoting the seat number.
Output Format
For each test case, output LEFT if the passenger chooses the exit beside seat
1
1, RIGHT otherwise.

You may print each character of the string in uppercase or lowercase (for example, the strings LEFT, lEft, left, and lEFT will all be treated as identical).

Constraints
1
≤
T
≤
100
1≤T≤100
1
≤
X
≤
100
1≤X≤100

---Input---
6
1
50
100
30
51
73
---Output---
LEFT
LEFT
RIGHT
LEFT
RIGHT
RIGHT
**/

import java.util.Scanner;

public class NearestExit {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            if( x <= 50 ){
                System.out.println("LEFT");
            } else System.out.println("RIGHT");
        }
    }
}
