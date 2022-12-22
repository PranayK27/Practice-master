package CodeChef.Basic;

import java.util.Scanner;

/**
 * Problem
 * This semester, Chef took XX courses. Each course has YY units and each unit has ZZ chapters in it.
 *
 * Find the total number of chapters Chef has to study this semester.
 *
 * Input Format
 * The first line will contain TT, the number of test cases. Then the test cases follow.
 * Each test case consists of a single line of input, containing three space-separated integers X, Y,X,Y, and ZZ.
 * Output Format
 * For each test case, output in a single line the total number of chapters Chef has to study this semester.
 *
 * Constraints
 * 1 \leq T \leq 10001≤T≤1000
 * 1 \leq X, Y, Z \leq 10001≤X,Y,Z≤1000
 * Sample 1:
 * Input
 * 3
 * 1 1 1
 * 2 1 2
 * 1 2 3
 * Output
 * 1
 * 4
 * 6
 * Explanation:
 * Test case 1: There is only 1 course with 1 unit. The unit has 1 chapter. Thus, the total number of chapters is 1.
 *
 * Test case 2: There are 2 courses with 1 unit each. Thus, there are 2 units. Each unit has 2 chapters. Thus, the total number of chapters is 4.
 *
 * Test case 3: There is only 1 course with 2 units. Each unit has 3 chapters. Thus, the total number of chapters is 6.
 * */

public class Chefandchapters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int x=0; x<T; x++) {
            int courses=sc.nextInt();
            int units=sc.nextInt();
            int chapters=sc.nextInt();

            int numOfChap = courses*units*chapters;

            System.out.println(numOfChap);
        }
    }
}
