package CodeChef.Problems.Difficulty500to1000;
/*
Rearranging digits to get a multiple of 5
Given a positive integer
N
N, MoEngage wants you to determine if it is possible to rearrange the digits of
N
N (in decimal representation) and obtain a multiple of
5
5.

For example, when
N
=
108
N=108, we can rearrange its digits to construct
180
=
36
⋅
5
180=36⋅5 which is a multiple of
5
5.

Input Format
The first line contains an integer
T
T, the number of test cases. The description of the
T
T test cases follow.
Each test case consists of two lines
The first line contains a single integer
D
D, the number of digits in
N
N.
The second line consists of a string of length
D
D, the number
N
N (in decimal representation). It is guaranteed that the string does not contain leading zeroes and consists only of the characters
0
,
1
,
…
9
0,1,…9.
Output Format
For each test case, print
Yes
Yes if it is possible to rearrange the digits of
N
N so that it becomes a multiple
5
5. Otherwise, print
No
No.
You may print each character of the string in uppercase or lowercase (for example, the strings
YeS
YeS,
yEs
yEs,
yes
yes and
YES
YES will all be treated as identical).

Constraints
1
≤
T
≤
1000
1≤T≤1000
1
≤
D
≤
1000
1≤D≤1000
1
≤
N
<
10
1000
1≤N<10
1000

Sum of
D
D over all test cases
≤
1000
≤1000.

---Input---
3
3
115
3
103
3
119

---Output---
Yes
Yes
No

**/


import java.util.Scanner;

public class RearrangingDigitsToGetMultipleOf5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int l=sc.nextInt();
            String s = sc.next();
            int c=0;
            for (int i = 0; i < l; i++) {
                char[] arr = s.toCharArray();
                if (arr[i] == '0' || arr[i] == '5'){
                    c++;
                }
            }
            if(c>0){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
