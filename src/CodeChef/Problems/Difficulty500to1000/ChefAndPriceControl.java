package CodeChef.Problems.Difficulty500to1000;
/*
Chef and Price Control
Read problem statements in Hindi, Bengali, Mandarin Chinese, Russian, and Vietnamese as well.
Chef has
N
N items in his shop (numbered
1
1 through
N
N); for each valid
i
i, the price of the
i
i-th item is
P
i
P
i
​
 . Since Chef has very loyal customers, all
N
N items are guaranteed to be sold regardless of their price.

However, the government introduced a price ceiling
K
K, which means that for each item
i
i such that
P
i
>
K
P
i
​
 >K, its price should be reduced from
P
i
P
i
​
  to
K
K.

Chef's revenue is the sum of prices of all the items he sells. Find the amount of revenue which Chef loses because of this price ceiling.

Input
The first line of the input contains a single integer
T
T denoting the number of test cases. The description of
T
T test cases follows.
The first line of each test case contains two space-separated integers
N
N and
K
K.
The second line contains
N
N space-separated integers
P
1
,
P
2
,
…
,
P
N
P
1
​
 ,P
2
​
 ,…,P
N
​
 .
Output
For each test case, print a single line containing one integer ― the amount of lost revenue.

Constraints
1
≤
T
≤
100
1≤T≤100
1
≤
N
≤
10
,
000
1≤N≤10,000
1
≤
P
i
≤
1
,
000
1≤P
i
​
 ≤1,000 for each valid
i
i
1
≤
K
≤
1
,
000
1≤K≤1,000

---Input---
3
5 4
10 2 3 4 5
7 15
1 2 3 4 5 6 7
5 5
10 9 8 7 6
---Output---
7
0
15
**/


import java.util.Scanner;

public class ChefAndPriceControl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            int temp=0;
            int c=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]>k){
                    temp = arr[i]-k;
                    c = c + temp;
                } else {
                    continue;
                }
            }
            System.out.println(c);
        }
    }
}
