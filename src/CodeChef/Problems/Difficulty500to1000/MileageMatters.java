package CodeChef.Problems.Difficulty500to1000;
/*
Mileage matters
Chef wants to rent a car to travel to his restaurant which is
N
N kilometers away. He can either rent a petrol car or a diesel car.

One litre of petrol costs
X
X rupees and one litre of diesel costs
Y
Y rupees. Chef can travel
A
A kilometers with one litre of petrol and
B
B kilometers with one litre of diesel.

Chef can buy petrol and diesel in any amount, not necessarily integer. For example, if
X
=
95
X=95, Chef can buy half a litre of petrol by paying
95
/
2
=
47.5
95/2=47.5 rupees.

Which car should the chef rent in order to minimize the cost of his travel?

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
The first and only line of each test case contains
5
5 space-separated integers,
N
,
X
,
Y
,
A
,
N,X,Y,A, and
B
B - distance that chef needs to travel, the per litre prices of petrol and diesel and the distance chef can travel using one litre of petrol and diesel respectively.
Output Format
For each test case, output on a new line PETROL if the cost of travel is less using petrol car, DIESEL if the cost of travel is less using diesel car or ANY if cost of travel is same in both the cases.

You may print each character of the string in either uppercase or lowercase (for example, the strings PETrol, petrol, Petrol, and PETROL will all be treated as identical).

Constraints
1
≤
T
≤
100
1≤T≤100

---Input---
4
20 10 8 2 4
50 12 12 4 3
40 3 15 8 40
21 9 9 2 9

--special I/P--
1
4 91 9 5 34

---Output---
DIESEL
PETROL
ANY
DIESEL

--special O/P--
DIESEL

**/

import java.util.Scanner;

public class MileageMatters {
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            float n,x,y,a,b;
            n=sc.nextFloat();
            x=sc.nextFloat();
            y=sc.nextFloat();
            a=sc.nextFloat();
            b=sc.nextFloat();


            if (((n/a)*x) < ((n/b)*y)) {
                System.out.println("Petrol");
            } else if (((n/a)*x) > ((n/b)*y)) {
                System.out.println("Diesel");
            } else {
                System.out.println("Any");
            }


        }

    }
}
