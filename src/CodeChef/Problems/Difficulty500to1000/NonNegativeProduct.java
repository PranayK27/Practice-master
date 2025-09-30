package CodeChef.Problems.Difficulty500to1000;
/*
Non-Negative Product
Alice has an array of
N
N integers —
A
1
,
A
2
,
…
,
A
N
A
1
​
 ,A
2
​
 ,…,A
N
​
 . She wants the product of all the elements of the array to be a non-negative integer. That is, it can be either
0
0 or positive. But she doesn't want it to be negative.

To do this, she is willing to remove some elements of the array. Determine the minimum number of elements that she will have to remove to make the product of the array's elements non-negative.

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
The first line of each test case contains a single integer
N
N — the number of elements in the array originally.
The next line contains
N
N space-separated integers —
A
1
,
A
2
,
…
,
A
N
A
1
​
 ,A
2
​
 ,…,A
N
​
 , which are the original array elements.
Output Format
For each test case, output on a new line the minimum number of elements that she has to remove from the array.

Constraints
1
≤
T
≤
100
1≤T≤100
2
≤
N
≤
10000
2≤N≤10000
−
1000
≤
A
i
≤
1000
−1000≤A
i
​
 ≤1000

---Input---
4
3
1 9 8
4
2 -1 9 100
4
2 -1 0 100
4
2 -1 -1 100

---Output---
0
1
0
0

**/


import java.util.Scanner;

public class NonNegativeProduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int c=0;
            int f=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if (arr[i]==0){
                    f=1;
                } else if (arr[i]<0){
                    c++;
                }
            }
            if (c % 2 == 0 || f==1){
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }
    }
}
