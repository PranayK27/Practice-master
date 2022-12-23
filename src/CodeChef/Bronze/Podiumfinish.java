package CodeChef.Bronze;

import java.util.Scanner;

/** Problem */
/**
 * Chef got his dream seat in F1 and secured a 3^{rd}3
 * rd
 *   place in his debut race. He now wants to know the time gap between him and the winner of the race.
 *
 * You are his chief engineer and you only know the time gap between Chef and the runner up of the race, given as AA seconds, and the time gap between the runner up and the winner of the race, given as BB seconds.
 *
 * Please calculate and inform Chef about the time gap between him and the winner of the race.
 *
 * Input Format
 * The first line of input will contain a single integer TT, denoting the number of test cases.
 * Each test case consists of a single line of input containing two space-separated integers AA and BB denoting the time gap between Chef and the runner up and the time gap between the runner up and the winner respectively.
 * Output Format
 * For each test case, output the time gap between Chef and the winner of the race.
 *
 * Constraints
 * 1 \leq T \leq 1001≤T≤100
 * 1 \leq A, B \leq 101≤A,B≤10
 * Sample 1:
 * Input
 * 4
 * 1 1
 * 2 5
 * 3 2
 * 5 6
 * Output
 * 2
 * 7
 * 5
 * 11
 * Explanation:
 * Test case 1: The time gap between Chef and runner up is 1 second. The time gap between runner up and the winner is 1 second. Thus, the time gap between Chef and the winner is 1+1=2 seconds.
 *
 * Test case 2: The time gap between Chef and runner up is 2 seconds. The time gap between runner up and the winner is 5 second. Thus, the time gap between Chef and the winner is 2+5=7 seconds.
 *
 * Test case 3: The time gap between Chef and runner up is 3 seconds. The time gap between runner up and the winner is 2 second. Thus, the time gap between Chef and the winner is 3+2=5 seconds.
 *
 * Test case 4: The time gap between Chef and runner up is 5 seconds. The time gap between runner up and the winner is 6 second. Thus, the time gap between Chef and the winner is 5+6=11 seconds.
* */

public class Podiumfinish {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int x=0; x<T; x++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int total = a + b;
            System.out.println(total);
        }
    }
}
