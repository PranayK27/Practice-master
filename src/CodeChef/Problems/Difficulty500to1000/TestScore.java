package CodeChef.Problems.Difficulty500to1000;

/*
Test Score
In a test, there are
N
N problems, each carrying
X
X marks.
In each problem, Chef either received
X
X marks or
0
0 marks.

Determine whether is it possible for Chef to achieve exactly
Y
Y marks.

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
Each test case consists of three integers
N
,
X
,
N,X, and
Y
Y, the number of problems, the maximum score for each problem, and the score Chef wants.
Output Format
For each test case, output YES if Chef can achieve exactly
Y
Y marks, NO otherwise.

You can print each character of the string in uppercase or lowercase. For example, the strings Yes, YES, yes, and yEs, are all considered identical.

Constraints
1
≤
T
≤
100
1≤T≤100
1
≤
N
≤
10
1≤N≤10
1
≤
X
≤
10
1≤X≤10
0
≤
Y
≤
N
⋅
X
0≤Y≤N⋅X

---Input---
5
1 8 4
3 6 12
4 5 0
10 10 100
8 5 36
---Output---
NO
YES
YES
YES
NO
**/

import java.util.Scanner;

public class TestScore {
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(y%x==0){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
