package CodeChef.Problems.Difficulty500to1000;

/*
Car or Bike
Chef wants to reach home as soon as possible. He has two options:

Travel with his BIKE which takes
X
X minutes.
Travel with his CAR which takes
Y
Y minutes.
Which of the two options is faster or do they both take same time?

Input Format
First line will contain
T
T, number of test cases. Then the test cases follow.
Each test case contains a single line of input, two integers
X
,
Y
X,Y representing the time taken to travel with BIKE and CAR respectively.
Output Format
For each test case, print CAR if travelling with Car is faster, BIKE if travelling with Bike is faster, SAME if they both take the same time.

You may print each character of CAR, BIKE and SAME in uppercase or lowercase (for example, CAR, Car, cAr will be considered identical).

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
,
Y
≤
10
1≤X,Y≤10

---Input---
3
1 5
4 2
6 6
---Output---
BIKE
CAR
SAME
**/

import java.util.Scanner;

public class CarOrBike {
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x<y){
                System.out.println("BIKE");
            } else if(y<x){
                System.out.println("CAR");
            } else if(x==y){
                System.out.println("SAME");
            }
        }
    }
}
