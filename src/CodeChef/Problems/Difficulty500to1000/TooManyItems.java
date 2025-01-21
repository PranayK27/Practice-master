package CodeChef.Problems.Difficulty500to1000;

/*
Too many items
Chef bought
N
N items from a shop. Although it is hard to carry all these items in hand, so Chef has to buy some polybags to store these items.

1
1 polybag can contain at most
10
10 items. What is the minimum number of polybags needed by Chef?

Input Format
The first line will contain an integer
T
T - number of test cases. Then the test cases follow.
The first and only line of each test case contains an integer
N
N - the number of items bought by Chef.
Output Format
For each test case, output the minimum number of polybags required.

Constraints
1
≤
T
≤
1000
1≤T≤1000
1
≤
N
≤
1000
1≤N≤1000

---Input---
3
20
24
99
---Output---
2
3
10
**/

import java.util.Scanner;

public class TooManyItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int n = sc.nextInt();
            if(n%10 == 0){
                System.out.println(n/10);
            } else {
                System.out.println(n/10 + 1);
            }
        }
    }
}
