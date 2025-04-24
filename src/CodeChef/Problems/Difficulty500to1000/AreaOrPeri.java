package CodeChef.Problems.Difficulty500to1000;
/*
Area OR Perimeter
Write a program to obtain length
(
L
)
(L) and breadth
(
B
)
(B) of a rectangle and check whether its area is greater or perimeter is greater or both are equal.

Input Format
First line will contain the length
(
L
)
(L) of the rectangle.
Second line will contain the breadth
(
B
)
(B) of the rectangle.
Output Format
Output 2 lines.

In the first line print "Area" if area is greater otherwise print "Peri" and if they are equal print "Eq".(Without quotes).

In the second line print the calculated area or perimeter (whichever is greater or anyone if it is equal).

Constraints
1
≤
L
≤
1000
1≤L≤1000
1
≤
B
≤
1000
1≤B≤1000

---Input---
5
1

5
4

6
3
---Output---
Peri
12

Area
20

Eq
18
**/

import java.util.Scanner;

public class AreaOrPeri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        int area = l*b;
        int perimeter = 2*l + 2*b;
        if (area > perimeter){
            System.out.println("Area");
            System.out.println(area);
        } else if(perimeter > area){
            System.out.println("Peri");
            System.out.println(perimeter);
        } else {
            System.out.println("Eq");
            System.out.println(perimeter);
        }
    }
}
