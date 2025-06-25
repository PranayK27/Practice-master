package CodeChef.Problems.Difficulty500to1000;
/*
Avoid Contact
A hostel has
N
N rooms in a straight line. It has to accommodate
X
X people. Unfortunately, out of these
X
X people,
Y
Y of them are infected with chickenpox. Due to safety norms, the following precaution must be taken:

No person should occupy a room directly adjacent to a room occupied by a chickenpox-infected person. In particular, two chickenpox-infected people cannot occupy adjacent rooms.
For example, if room
4
4 has a chickenpox-infected person, then nobody should occupy rooms
3
3 and
5
5. Similarly, if room
1
1 has a chickenpox-infected person then nobody should occupy room
2
2.

What's the minimum value of
N
N for which all the people can be accommodated in the hostel, following the above condition?

Input Format
The first line of input contains a single integer
T
T — the number of test cases. The description of
T
T test cases follows.
The first and only line of each test case contains two integers
X
X and
Y
Y — the total number of people and the number of chickenpox-infected people.
Output Format
For each test case, output on a new line a single integer — the minimum value of
N
N for which all the people can be accommodated in the hostel.

Constraints
1
≤
T
≤
200
1≤T≤200
1
≤
X
≤
1000
1≤X≤1000
0
≤
Y
≤
X
0≤Y≤X

---Input---
3
4 0
5 3
3 3
---Output---
4
8
5
**/


import java.util.Scanner;

public class AvoidContact {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(y==0)
                System.out.println(x);
            else if(x==y)
                System.out.println(2*x-1);
            else
            {
                System.out.println((x-y)+(y*2));
            }
        }
    }
}
