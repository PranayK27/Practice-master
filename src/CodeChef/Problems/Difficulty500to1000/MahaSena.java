package CodeChef.Problems.Difficulty500to1000;

/*
Mahasena
Kattapa, as you all know was one of the greatest warriors of his time. The kingdom of Maahishmati had never lost a battle under him (as army-chief), and the reason for that was their really powerful army, also called as Mahasena.

Kattapa was known to be a very superstitious person. He believed that a soldier is "lucky" if the soldier is holding an even number of weapons, and "unlucky" otherwise. He considered the army as "READY FOR BATTLE" if the count of "lucky" soldiers is strictly greater than the count of "unlucky" soldiers, and "NOT READY" otherwise.

Given the number of weapons each soldier is holding, your task is to determine whether the army formed by all these soldiers is "READY FOR BATTLE" or "NOT READY".

Note: You can find the definition of an even number here.

Input Format
The first line of input consists of a single integer N denoting the number of soldiers. The second line of input consists of N space separated integers A1, A2, ..., AN, where Ai denotes the number of weapons that the ith soldier is holding.

Output Format
Generate one line output saying "READY FOR BATTLE", if the army satisfies the conditions that Kattapa requires or "NOT READY" otherwise (quotes for clarity).

Constraints
1 ≤ N ≤ 100
1 ≤ Ai ≤ 100

Sample 1:
---Input---
1
1
---Output---
NOT READY

Sample 2:
---Input---
1
2
---Output---
READY FOR BATTLE

Sample 3:
---Input---
4
11 12 13 14
---Output---
NOT READY

Sample 4:
---Input---
3
2 3 4
---Output---
READY FOR BATTLE

Sample 5:
---Input---
5
1 2 3 4 5
---Output---
NOT READY

Sample 6:
---Input---
100
1 44 49 94 91 40 22 75 66 4 75 24 62 49 65 87 83 16 3 10 14 31 80 67 14 22 61 6 48 42 16 12 3 7 54 69 10 65 89 74 93 19 14 33 67 27 3 89 83 62 54 14 10 55 4 43 7 69 31 86 92 30 11 82 40 7 97 20 11 24 18 89 8 10 49 32 26 42 48 91 17 65 74 41 85 6 96 37 95 59 57 28 45 85 94 29 14 32 38 19
---Output---
NOT READY
* **/

import java.util.Scanner;

public class MahaSena {
        // your code goes here
        public static void main(String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner sc = new Scanner(System.in);
            int e = 0, o = 0;
            int n = sc.nextInt();
            int[] w = new int[n];

            for (int i = 0; i < w.length; i++) {
                w[i] = sc.nextInt();
                if (w[i] == 1 || w[i] % 2 != 0) {
                    o++;
                } else if (w[i] % 2 == 0){
                    e++;
                }
            }
            if (e <= o) {
                System.out.println("NOT READY");
            } else System.out.println("READY FOR BATTLE");
        }
}
