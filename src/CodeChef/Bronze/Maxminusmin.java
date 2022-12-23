package CodeChef.Bronze;

import java.util.Scanner;

/** Problem */
/**
 * Chef is given 33 integers A,B, and C such that A \lt B \lt C, A<B<C.
 *
 * Chef needs to find the value of max(A,B,C)−min(A,B,C).
 *
 * Here max(A,B,C) denotes the maximum value among A,B,C while min(A,B,C) denotes the minimum value among A,B,C.
 *
 * Input Format
 * The first line of input will contain a single integer TT, denoting the number of test cases.
 * Each test case consists of 33 integers A, B, CA,B,C.
 * Output Format
 * For each test case, output the value of max(A, B, C) - min(A, B, C)max(A,B,C)−min(A,B,C).
 *
 * Constraints
 * 1 \leq T \leq 101≤T≤10
 * 1 \leq A \lt B \lt C \leq 101≤A<B<C≤10
 * Sample 1:
 * Input
 * 4
 * 1 3 10
 * 5 6 7
 * 3 8 9
 * 2 5 6
 * Output
 * 9
 * 2
 * 6
 * 4
 * Explanation:
 * Test case 1: Here, max(1,3,10)=10 and min(1,3,10)=1. Thus, the difference is 9.
 *
 * Test case 2: Here, max(5,6,7)=7 and min(5,6,7)=5. Thus, the difference is 2.
 *
 * Test case 3: Here, max(3,8,9)=9 and min(3,8,9)=3. Thus, the difference is 6.
 *
 * Test case 4: Here, max(2,5,6)=6 and min(2,5,6)=2. Thus, the difference is 4.
 */

public class Maxminusmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int x=0; x<T; x++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

            int max = Maxminusmin.max(a,b,c);
            int min = Maxminusmin.min(a,b,c);

            int diff = max-min;
            System.out.println(diff);


        }
    }

    public static int max(int x, int y, int z){
        if(x>y && x>z){
            return x;
        } else if(y>x && y>z){
            return y;
        } else return z;
    }
    public static int min(int x, int y, int z){
        if(x<y && x<z){
            return x;
        } else if(y<x && y<z){
            return y;
        } else{
            return z;
        }
    }
}
