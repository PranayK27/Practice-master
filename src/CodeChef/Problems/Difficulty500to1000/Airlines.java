package CodeChef.Problems.Difficulty500to1000;

/*
Airlines
An airline operates
X
X aircraft every day. Each aircraft can carry up to
100
100 passengers.
One day,
N
N passengers would like to travel to the same destination. What is the minimum number of new planes that the airline must buy to carry all
N
N passengers?

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
Each test case consists of a single line containing two space-separated integers
X
X and
N
N — the number of aircraft the airline owns and the number of passengers travelling, respectively.
Output Format
For each test case, output the minimum number of planes the airline needs to purchase.
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
≤
1
0
6
1≤X≤10
6

1
≤
N
≤
1
0
6
1≤N≤10
6

---Input---
3
4 600
3 523
8 245
---Output---
2
3
0
**/

import java.util.Scanner;

public class Airlines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // Number of test cases

        StringBuilder result = new StringBuilder();  // To store results for fast output

        while (T-- > 0) {
            int X = sc.nextInt();  // Number of owned aircraft
            int N = sc.nextInt();  // Number of passengers

            // Current capacity
            int currentCapacity = X * 100;

            if (currentCapacity >= N) {
                result.append(0).append("\n");
            } else {
                int shortfall = N - currentCapacity;
                int additionalPlanes = (shortfall + 100 - 1) / 100;  // Equivalent to ceil(shortfall / 100)
                result.append(additionalPlanes).append("\n");
            }
        }

        // Output all results at once
        System.out.print(result);

        sc.close();
    }
}
