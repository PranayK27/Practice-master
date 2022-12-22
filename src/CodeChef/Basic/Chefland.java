package CodeChef.Basic;

import java.util.Scanner;

/** Problem */
/**
* In Chefland, precipitation is measured using a rain gauge in millimetre per hour.

Chef categorises rainfall as:

LIGHT, if rainfall is less than 33 millimetre per hour.
MODERATE, if rainfall is greater than equal to 33 millimetre per hour and less than 77 millimetre per hour.
HEAVY if rainfall is greater than equal to 77 millimetre per hour.
Given that it rains at XX millimetre per hour on a day, find whether the rain is LIGHT, MODERATE, or HEAVY.

Input Format
The first line of input will contain a single integer TT, denoting the number of test cases.
Each test case consists of a single integer XX — the rate of rainfall in millimetre per hour.
Output Format
For each test case, output on a new line, whether the rain is LIGHT, MODERATE, or HEAVY.

You may print each character in lowercase or uppercase. For example, LIGHT, light, Light, and liGHT, are all identical.

Constraints
1 \leq T \leq 201≤T≤20
1 \leq X \leq 201≤X≤20
Sample 1:
* Input
4
1
20
3
7
* Output
LIGHT
HEAVY
MODERATE
HEAVY
Explanation:
Test case 1: The rate of precipitation is less than 3. Thus, the rain is LIGHT.

Test case 2: The rate of precipitation is greater than equal to 7. Thus, the rain is HEAVY.

Test case 3: The rate of precipitation is greater than equal to 3 and less than 7. Thus, the rain is MODERATE.

Test case 4: The rate of precipitation is greater than equal to 7. Thus, the rain is HEAVY.
* */

public class Chefland {
    public static void main(String[] args) {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int X;
        for(int x=0; x<T; x++){
            X = sc.nextInt();
            if(X>=1 && X<=20){
                if(X<3){
                    System.out.println("LIGHT");
                } else if(X>=3 && X<7){
                    System.out.println("MODERATE");
                } else if(X>=7){
                    System.out.println("HEAVY");
                }
            }
        }
    }
}
