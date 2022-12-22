package CodeChef.Basic;

import java.util.Scanner;

/** Problem */
/**
 *  person is said to be sleep deprived if he slept strictly less than 77 hours in a day.
 *
 * Chef was only able to sleep XX hours yesterday. Determine if he is sleep deprived or not.
 *
 * Input Format
 * The first line contains a single integer TT — the number of test cases. Then the test cases follow.
 * The first and only line of each test case contains one integer XX — the number of hours Chef slept.
 * Output Format
 * For each test case, output YES if Chef is sleep-deprived. Otherwise, output NO.
 *
 * You may print each character of YES and NO in uppercase or lowercase (for example, yes, yEs, Yes will be considered identical).
 *
 * Constraints
 * 1 \leq T \leq 201≤T≤20
 * 1 \le X \le 151≤X≤15
 * Sample 1:
 * Input
 * 3
 * 4
 * 7
 * 10
 * Output
 * YES
 * NO
 * NO
 * Explanation:
 * Test Case 1: Since 4 is less than equal to 7, 4<7, Chef is sleep deprived.
 *
 * Test Case 2: Since 7 is greater than equal to 7, 7 ≥7, Chef is not sleep deprived.
 *
 * Test Case 3: Since 10 is greater than equal 7, 10≥7, Chef is not sleep deprived.
 * */

public class Sleepdeprivation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int x=0; x<T; x++) {
            int n=sc.nextInt();
            if(n<7){
                System.out.println("YES");
            } else if(n>=7){
                System.out.println("NO");
            }
        }
    }
}
