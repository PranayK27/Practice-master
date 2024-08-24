package CodeChef.Problems.Difficulty500to1000;

/*
Exams
In Chefland, there are
X
X schools, and each school has
Y
Y students.
The year end results are in and a total of
Z
Z students passed the exams.

Assuming that all students appeared for the exams, find whether the number of students who passed in Chefland was strictly greater than
50
%
50%.

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
Each test case consists of three space-separated integers
X
,
Y
,
X,Y, and
Z
Z, as mentioned in the statement.
Output Format
For each test case, output on a new line, YES, if the total number of students who passed in Chefland was strictly greater than
50
%
50%, otherwise print NO.

You may print each character of the string in uppercase or lowercase (for example, the strings YES, yEs, yes, and yeS will all be treated as identical).

Constraints
1
≤
T
≤
2
⋅
1
0
4
1≤T≤2⋅10
4

1
≤
X
≤
5
1≤X≤5
1
≤
Y
≤
50
1≤Y≤50
0
≤
Z
≤
X
⋅
Y
0≤Z≤X⋅Y

---Input---
4
2 10 12
2 10 3
1 5 3
3 6 9
---Output---
YES
NO
YES
NO
**/

import java.util.Scanner;

public class Exams {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            float x = sc.nextInt();
            float y = sc.nextInt();
            float z = sc.nextInt();

            if((z/(x*y)) * 100 > 50){
                System.out.println("YES");
            } else System.out.println("NO");

        }

    }
}
