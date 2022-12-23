package CodeChef.Bronze;

import java.util.Scanner;

/** Problem */
/**
 * For the upcoming semester, the admins of your university decided to keep a total of XX seats for the MATH-1 course. A student interest survey was conducted by the admins and it was found that YY students were interested in taking up the MATH-1 course.
 *
 * Find the minimum number of extra seats that the admins need to add into the MATH-1 course to make sure that every student who is interested in taking the course would be able to do so.
 *
 * Input Format
 * The first line of input will contain a single integer TT, denoting the number of test cases.
 * Each test case consists of two-space separated integers on a single line, XX and YY — the current number of seats up for enrolment and the number of students interested in taking up the course in the upcoming semester, respectively.
 * Output Format
 * For each test case, output on a new line the minimum number of seats required to be added.
 *
 * Constraints
 * 1 \leq T \leq 1001≤T≤100
 * 1 \leq X, Y \leq 10^51≤X,Y≤10
 * 5
 *
 * Sample 1:
 * Input
 * 4
 * 1 1
 * 12 34
 * 50 49
 * 49 50
 * Output
 * 0
 * 22
 * 0
 * 1
 * Explanation:
 * Test case 1: Exactly 11 seat is available for enrolment, and exactly 11 student is interested in taking up the course, hence addition of more seats is not required.
 *
 * Test case 2: 12 seats are available for enrolment but 34 students are interested in taking up the course, hence the admins would have to add 34-12=22 more seats to make sure that every student interested in the course gets a seat.
 *
 * Test case 3: 50 seats are available for enrolment and 49 students are interested in taking up the course, hence addition of more seats is not required.
 *
 * Test case 4: 49 seats are available for enrolment, but 50 students are interested in taking up the course, hence the admins would have to add 50-49=1 more seat to make sure that every student interested in the course gets a seat.
 * */

public class Math1enrolment {
    public static void main(String[] args) {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int x=0; x<T; x++) {
            int seats=sc.nextInt();
            int students=sc.nextInt();
            int extraSeats = students - seats;
            if(seats==students){
                System.out.println(extraSeats);
            } else if(students>seats){
                System.out.println(extraSeats);
            } else if(seats>students){
                System.out.println(0);
            }
        }
    }
}
