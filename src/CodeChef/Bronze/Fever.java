package CodeChef.Bronze;

import java.util.Scanner;

/** Problem */
/**
 * Chef is not feeling well today. He measured his body temperature using a thermometer and it came out to be XX °F.
 *
 * A person is said to have fever if his body temperature is strictly greater than 9898 °F.
 *
 * Determine if Chef has fever or not.
 *
 * Input Format
 * The first line contains a single integer TT — the number of test cases. Then the test cases follow.
 * The first and only line of each test case contains one integer XX - the body temperature of Chef in °F.
 * Output Format
 * For each test case, output YES if Chef has fever. Otherwise, output NO.
 *
 * You may print each character of YES and NO in uppercase or lowercase (for example, yes, yEs, Yes will be considered identical).
 *
 * Constraints
 * 1 \le T \le 101≤T≤10
 * 94 \le X \le 10394≤X≤103
 * Sample 1:
 * Input
 * 3
 * 98
 * 100
 * 96
 * Output
 * NO
 * YES
 * NO
 * Explanation:
 * Test Case 1: Since X=98 is not greater than 98, Chef does not have fever.
 *
 * Test Case 2: Since X=100 is greater than 98, Chef has fever.
 *
 * Test Case 3: Since X=96 is not greater than 98, Chef does not have fever.
 * */

public class Fever {
    public static void main(String[] args) {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int x=0; x<T; x++) {
            int temp=sc.nextInt();

            if(temp<=98){
                System.out.println("NO");
            } else{
                System.out.println("YES");
            }
        }

    }
}
