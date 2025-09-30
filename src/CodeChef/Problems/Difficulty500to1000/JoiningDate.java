package CodeChef.Problems.Difficulty500to1000;
/*
Joining Date
N
N candidates (numbered from
1
1 to
N
N) join Chef's firm. The first
5
5 candidates join on the first day, and then, on every subsequent day, the next
5
5 candidates join in.
For example, if there are
12
12 candidates, candidates numbered
1
1 to
5
5 will join on day
1
1, candidates numbered
6
6 to
10
10 on day
2
2 and the remaining
2
2 candidates will join on day
3
3.

Candidate numbered
K
K decided to turn down his offer and thus, Chef adjusts the position by shifting up all the higher numbered candidates. This leads to a change in the joining day of some of the candidates.

Help Chef determine the number of candidates who will join on a different day than expected.

Input Format
First line will contain
T
T, number of test cases. Then the test cases follow.
Each test case contains of a single line of input, two space-separated integers
N
N and
K
K denoting the number of candidates and the candidate who turned down the offer.
Output Format
For each test case, output a single integer denoting the number of candidates whose joining day will be changed.

Constraints
1
≤
T
≤
1000
1≤T≤1000
2
≤
N
≤
1000
2≤N≤1000
1
≤
K
≤
N
1≤K≤N

---Input---
4
7 3
6 6
2 1
14 2
---Output---
1
0
0
2
**/

import java.util.Scanner;

public class JoiningDate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int totalGroups = (int) Math.ceil(n / 5);
            int removed_person_group = (int) Math.ceil(k / 5);
            if (n % 5 != 0) {
                totalGroups += 1;
            }
            if (k % 5 != 0) {
                removed_person_group += 1;
            }
            System.out.println(totalGroups - removed_person_group);
        }
    }
}
