package CodeChef.Problems.Difficulty500to1000;
/*
Highest Divisor
Read problem statements in Hindi, Bengali, Mandarin Chinese, Russian, and Vietnamese as well.
You are given an integer
N
N. Find the largest integer between
1
1 and
10
10 (inclusive) which divides
N
N.

Input
The first and only line of the input contains a single integer
N
N.

Output
Print a single line containing one integer ― the largest divisor of
N
N between
1
1 and
10
10.

Constraints
2
≤
N
≤
1
,
000
2≤N≤1,000
Subtasks
Subtask #1 (100 points): original constraints

---Input---
91
997
---Output---
7
1
**/


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HighestDivisor {
    public static void main(String[] args) {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        for(int i=1; i<=10; i++){
            if(n%i==0){
                l.add(i);
            }
        }
        System.out.print(Collections.max(l));

    }
}

