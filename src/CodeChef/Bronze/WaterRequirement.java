package CodeChef.Bronze;

import java.util.Scanner;

/**
 * Problem
 * Finally, after purchasing a water cooler during the April long challenge, Chef noticed that his water cooler requires 2 liters of water to cool for one hour.
 *
 * How much water (in liters) would be required by the cooler to cool for N hours?
 *
 * Input Format
 * The first line of input will contain an integer T — the number of test cases. The description of T test cases follows.
 * The first and only line of each test case contains an integer N, as described in the problem statement.
 * Output Format
 * For each test case, output the number of liters of water required by the water cooler to cool for NN hours.
 *
 * Constraints
 * 1 \leq T \leq 10001≤T≤1000
 * 1 \leq N \leq 10001≤N≤1000
 * Sample 1:
 * Input
 * 2
 * 1
 * 2
 * Output
 * 2
 * 4
 * Explanation:
 * Test case 1: As mentioned in the problem statement, 2 liters of water is required by the water cooler to cool for 1 hour.
 *
 * Test case 2: 4 liters of water is required by the water cooler to cool for 2 hours.
 * */

public class WaterRequirement {
    public static void main(String[] args) {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int x=0; x<T; x++) {
            int hours=sc.nextInt();

            int waterInLiters = hours * 2;
            System.out.println(waterInLiters);
        }
    }
}
