package CodeChef.Bronze;

import java.util.Scanner;

/*
Problem
Alice has a bucket of water initially having W litres of water in it. The maximum capacity of the bucket is X liters.

Alice turned on the tap and the water starts flowing into the bucket at a rate of Y litres/hour. She left the tap running for exactly ZZ hours. Determine whether the bucket has been overflown, filled exactly, or is still left unfilled.

Input Format
The first line of input will contain a single integer T, denoting the number of test cases. The description of the test cases follows.
Each test case consists of a single line of input containing four space-separated integers W, X, Y, Z.
Output Format
For each test case, print the answer on a new line:

If the bucket has overflown print overflow
If it is exactly filled print filled
If it is still unfilled, print unfilled
You may print each character of the string in uppercase or lowercase (for example, the strings filled, FIlled, fiLLed, and FILLED will all be treated as identical).

Constraints
1≤T≤1000
1≤W,X,Y,Z≤1000
Subtasks
Subtask 1 (100 points):
Original constraints.
Sample 1:
Input
4
1 2 3 4
10 70 10 6
2 100 4 3
4 3 2 1
Output
overFlow
filled
Unfilled
overflow
Explanation:
Test case 1: Initially the bucket had 1 litre of water, we then added 33 litres of water for 4 hours. Thus, the total bucket inflow was 1 + 3 \times 4 = 13, 1+3×4=13 litres. Since this is greater than the capacity of 2n litres, the bucket will OVERFLOW

Test case 2: Initially the bucket had 10 litres of water, we then added 1010 litres of water for 6 hours. Thus, the total bucket inflow was 10 + 10 \times 6 = 70, 10+10×6=70 litres. Since this is equal to the capacity of 70 litres, the bucket will be FILLED

Test case 3: Initially the bucket had 2 litres of water, we then added 44 litres of water for 3 hours. Thus, the total bucket inflow was 2 + 4 \times 3 = 14, 2+4×3=14 litres. Since this is lesser than the capacity of 100 litres, the bucket will be UNFILLED.

Test case 4: Initially the bucket had 4 litres of water, we then added 22 litres of water for 1 hours. Thus, the total bucket inflow was 4 + 2 \times 1 = 6, 4+2×1=6 litres. Since this is more than the capacity of 3 litres, the bucket will OVERFLOW.
* */

public class BucketAndWaterFlow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int x=0; x<T; x++){
            int initialCap=sc.nextInt();
            int maxCap=sc.nextInt();

            int incCap=sc.nextInt();
            int timeOn=sc.nextInt();

            int totalinc = initialCap + (incCap * timeOn);

            if(maxCap<totalinc){
                System.out.println("overflow");
            } else if(maxCap==totalinc){
                System.out.println("filled");
            } else{
                System.out.println("unfilled");
            }

        }
    }
}
