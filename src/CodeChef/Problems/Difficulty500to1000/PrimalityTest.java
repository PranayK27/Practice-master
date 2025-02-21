package CodeChef.Problems.Difficulty500to1000;
/*
Primality Test

Alice and Bob are meeting after a long time. As usual they love to play some math games. This times Alice takes the call and decides the game. The game is very simple, Alice says out an integer and Bob has to say whether the number is prime or not. Bob as usual knows the logic but since Alice doesn't give Bob much time to think, so Bob decides to write a computer program.

Help Bob accomplish this task by writing a computer program which will calculate whether the number is prime or not.

Note that 1 is not a prime number.

Input
The first line of the input contains an integer T, the number of testcases. T lines follow.

Each of the next T lines contains an integer N which has to be tested for primality.

Output
For each test case output in a separate line, "yes" if the number is prime else "no."

Constraints
1 ≤ T ≤ 20
1 ≤ N ≤ 100000

---Input---
5
23
13
20
1000
99991
---Output---
yes
yes
no
no
yes
**/


import java.util.Scanner;

public class PrimalityTest {
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int n = sc.nextInt();

            System.out.println(isPrimeNumber(n) ? "YES" : "NO");
        }

    }

    private static boolean isPrimeNumber(int number) {
        if (number < 2)
            return false;

        if (number == 2)
            return true;

        for (int div = (number / 2) + 1; div > 1; div--) {
            if (number % div == 0) {
                return false;
            }
        }
        return true;
    }
}
