package CodeChef.Problems.Difficulty500to1000;
/*
Car Range
The fuel economy of a car is the distance which it can travel on one litre of fuel.

The base fuel economy (i.e, its fuel economy when there is only one person - the driver - in the car) of a certain car is
M
M kilometres per litre. It was also observed that every extra passenger in the car decreases the fuel economy by
1
1 kilometre per litre.

P
P people want to take this car for a journey. They know that the car currently has
V
V litres of fuel in its tank.

What is the maximum distance this car can travel under the given conditions, assuming that all
P
P people always stay in the car and no refuelling can be done?

Note that among the
P
P people is also a driver, i.e, there are exactly
P
P people in the car.

Input Format
The first line of input contains a single integer
T
T, denoting the number of test cases. The description of
T
T test cases follows.
Each test case consists of a single line of input, containing three space-separated integers
P
,
M
P,M, and
V
V - the number of people, base fuel economy, and amount of fuel present in the car, respectively.
Output Format
For each test case, output a single line containing one integer - the maximum distance that the car can travel.

Constraints
1
≤
T
≤
3
⋅
1
0
4
1≤T≤3⋅10
4

1
≤
P
≤
5
1≤P≤5
6
≤
M
≤
56
6≤M≤56
1
≤
V
≤
100
1≤V≤100

---Input---
3
5 10 20
1 6 10
4 6 1
---Output---
120
60
3
**/


import java.util.Scanner;

public class CarRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int p=sc.nextInt();
            int m=sc.nextInt();
            int v=sc.nextInt();
            System.out.println((m-(p-1))*v);
        }
    }
}
