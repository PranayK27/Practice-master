package CodeChef.Self;

import java.util.Scanner;

/**
 * Problem
 * Chef has his lunch only between 1 pm and 4 pm (both inclusive).
 *
 * Given that the current time is X pm, find out whether it is lunchtime for Chef.
 *
 * Input Format
 * The first line of input will contain a single integer T, the number of test cases. Then the test cases follow.
 * Each test case contains a single line of input, containing one integer X.
 * Output Format
 * For each test case, print in a single line YES if it is lunchtime for Chef. Otherwise, print NO.
 *
 * You may print each character of the string in either uppercase or lowercase (for example, the strings YeS, yEs, yes and YES will all be treated as identical).
 *
 * Constraints
 * 1 \leq T \leq 121≤T≤12
 * 1 \leq X \leq 121≤X≤12
 * Sample 1:
 * Input
 * 3
 * 1
 * 7
 * 3
 * Output
 * YES
 * NO
 * YES
 * Explanation:
 * Test case 1: Lunchtime is between 1 pm and 4 pm (both inclusive). Since 1 pm lies within lunchtime, the answer is YES.
 *
 * Test case 2: Lunchtime is between 1 pm and 4 pm (both inclusive). Since 7 pm lies outside lunchtime, the answer is NO.
 *
 * Test case 3: Lunchtime is between 1 pm and 4 pm (both inclusive). Since 3 pm lies within lunchtime, the answer is YES.
 * */

public class Lunchtime {
    public static void main(String[] args) {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int x=0; x<T; x++) {
            int n=sc.nextInt();
            if(n>=1 && n<=4){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}
