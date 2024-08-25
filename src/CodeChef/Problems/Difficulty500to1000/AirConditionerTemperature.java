package CodeChef.Problems.Difficulty500to1000;

/*
Air Conditioner Temperature
There are three people sitting in a room - Alice, Bob, and Charlie. They need to decide on the temperature to set on the air conditioner. Everyone has a demand each:

Alice wants the temperature to be at least
A
A degrees.
Bob wants the temperature to be at most
B
B degrees.
Charlie wants the temperature to be at least
C
C degrees.
Can they all agree on some temperature, or not?

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
Each test case consists of a single line which contains three integers -
A
,
B
,
C
A,B,C.
Output Format
For each test case, output on a new line, "Yes" or "No". "Yes", if they can decide on some temperature which fits all their demands. Or "No", if no temperature fits all their demands.

You may print each character of the string in either uppercase or lowercase (for example, the strings NO, nO, No, and no will all be treated as identical).

Constraints
1
≤
T
≤
100
1≤T≤100
1
≤
A
,
B
,
C
≤
100
1≤A,B,C≤100
Subtasks
Subtask 1 (10 points):
1
≤
M
≤
10
1≤M≤10
Subtask 2 (20 points): The sum of
N
N across all test cases won't exceed
20
20.
Subtask 3 (70 points): No further constraints.

---Input---
4
30 35 25
30 35 40
30 35 35
30 25 35
---Output---
Yes
No
Yes
No
**/

import java.util.Scanner;

public class AirConditionerTemperature {
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (b >= a && b >= c) {
                System.out.println("Yes");
            } else System.out.println("No");
        }
    }
}
