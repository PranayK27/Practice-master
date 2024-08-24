package CodeChef.Problems.Difficulty500to1000;

/*
Count the Notebooks
You know that
1
1 kg of pulp can be used to make
1000
1000 pages and
1
1 notebook consists of
100
100 pages.

Suppose a notebook factory receives
N
N kg of pulp, how many notebooks can be made from that?

Input Format
First line will contain
T
T, the number of test cases. Then the test cases follow.
Each test case contains a single integer
N
N - the weight of the pulp the factory has (in kgs).
Output Format
For each test case, output the number of notebooks that can be made using
N
N kgs of pulp.

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
100
1≤N≤100

---Input---
3
1
100
50
---Output---
10
1000
500
**/

import java.util.Scanner;

public class CountTheNotebook {
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(n*10);
        }
    }
}
