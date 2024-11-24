package CodeChef.Problems.Difficulty500to1000;

/*
Too many Floors
Chef and Chefina are residing in a hotel.

There are
10
10 floors in the hotel and each floor consists of
10
10 rooms.

Floor
1
1 consists of room numbers
1
1 to
10
10.
Floor
2
2 consists of room numbers
11
11 to
20
20.
…
…
Floor
i
i consists of room numbers
10
⋅
(
i
−
1
)
+
1
10⋅(i−1)+1 to
10
⋅
i
10⋅i.
You know that Chef's room number is
X
X while Chefina's Room number is
Y
Y.
If Chef starts from his room, find the number of floors he needs to travel to reach Chefina's room.

Input Format
First line will contain
T
T, number of test cases. Then the test cases follow.
Each test case contains of a single line of input, two integers
X
,
Y
X,Y, the room numbers of Chef and Chefina respectively.
Output Format
For each test case, output the number of floors Chef needs to travel to reach Chefina's room.

Constraints
1
≤
T
≤
1000
1≤T≤1000
1
≤
X
,
Y
≤
100
1≤X,Y≤100
X
≠
Y
X=Y


---Input---
4
1 100
42 50
53 30
81 80
---Output---
9
0
3
1
**/

import java.util.Scanner;

public class TooManyFloors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();//
            int y = sc.nextInt();//
            int r, r2;
            if((x%10!=0)) {
                r = ((x / 10) + 1);

            }else {
                r=(x/10);

            }
            if((y%10!=0)) {
                r2=((y / 10) + 1);

            }else {
                r2=(y/10);

            }
            System.out.println(Math.abs(r2-r));

        }
    }
}

/*
Solution 2:
 int m = (((x - 1) / 10) + 1);
 int n = (((y - 1) / 10) + 1);
 System.out.println(Math.abs(m - n));
* */
