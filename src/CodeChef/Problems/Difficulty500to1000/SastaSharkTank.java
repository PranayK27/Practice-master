package CodeChef.Problems.Difficulty500to1000;

/*
Sasta Shark Tank
Devendra just had a million-dollar idea and he needs funds to startup. He was recently invited to Sasta Shark Tank (A TV show where entrepreneurs pitch their ideas to investors hoping to get investment in return).

He was offered deals from two investors. The first investor offers
A
A dollars for
10
10% of his company and the second investor offers
B
B dollars for
20
20% of his company. Devendra will accept the offer from the investor whose valuation of the company is more. Determine which offer will Devendra accept or if both the offers are equally good.

For example, if the first investor offers
300
300 dollars for
10
10% of the company, then the first investor's valuation of the company is
3000
3000 dollars since
10
10% of
3000
=
300
3000=300. If the second investor offers
500
500 dollars for
20
20% of the company, then the second investor's valuation of the company is
2500
2500 dollars since
20
20% of
2500
=
500
2500=500.

Input Format
The first line contains a single integer
T
T - the number of test cases. Then the test cases follow.
The first and only line of each test case contains two integers
A
A and
B
B - the amount offered by first investor for
10
10% of Devendra's company and the amount offered by second investor for
20
20% of Devendra's company respectively.
Output Format
For each test case, Output FIRST if Devendra should accept the first investor's deal, output SECOND if he should accept the second investor's deal, otherwise output ANY if both deals are equally good.

You may print each character of the strings in uppercase or lowercase (for example, the strings "FiRst", "First", "FIRST", and "FIrst" will all be treated as identical).

Constraints
1
≤
T
≤
100
1≤T≤100
100
≤
A
,
B
≤
10000
100≤A,B≤10000
A
A and
B
B are multiples of
100
100

---Input---
3
100 200
200 100
200 500
---Output---
ANY
FIRST
SECOND
**/

import java.util.Scanner;

public class SastaSharkTank {
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if((a*10) == (b*5)){
                System.out.println("ANY");
            } else if((a*10) > (b*5)){
                System.out.println("FIRST");
            } else System.out.println("SECOND");
        }
    }
}
