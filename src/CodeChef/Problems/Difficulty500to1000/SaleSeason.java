package CodeChef.Problems.Difficulty500to1000;

/*
Sale Season
It's the sale season again and Chef bought items worth a total of
X
X rupees. The sale season offer is as follows:

if
X
≤
100
X≤100, no discount.
if
100
<
X
≤
1000
100<X≤1000, discount is
25
25 rupees.
if
1000
<
X
≤
5000
1000<X≤5000, discount is
100
100 rupees.
if
X
>
5000
X>5000, discount is
500
500 rupees.
Find the final amount Chef needs to pay for his shopping.

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
Each test case consists of single line of input containing an integer
X
X.
Output Format
For each test case, output on a new line the final amount Chef needs to pay for his shopping.

Constraints
1
≤
T
≤
100
1≤T≤100
1
≤
X
≤
10000
1≤X≤10000

---Input---
4
15
70
250
1000
---Output---
15
70
225
975
**/

import java.util.Scanner;

public class SaleSeason {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int x=0; x<T; x++){
            int chefM=sc.nextInt();
            if(chefM<=100){
                System.out.println(chefM);
            } else if(chefM>100 && chefM<=1000) {
                System.out.println(chefM-25);
            } else if(chefM>1000 && chefM<=5000) {
                System.out.println(chefM-100);
            } else if(chefM>5000){
                System.out.println(chefM-500);
            }
        }
    }
}
