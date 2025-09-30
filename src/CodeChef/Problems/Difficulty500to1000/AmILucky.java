package CodeChef.Problems.Difficulty500to1000;
/*
Am I Lucky!
A school has organized a field trip for a class of
N
N students, of which
X
X students are boys, and the remaining students are girls.
Everyone is excited to go trekking, and must form groups of size exactly
K
K to do so. However, boys will only form groups among themselves, and girls will only form groups among themselves.
Both boys and girls will form as many groups as possible.

The remaining students can either dance around a bonfire, or just read books.
Dancing around the bonfire requires a pair of one girl and one boy, while reading is done alone.

Reading is much more boring than dancing, so students will try to avoid it.
What's the minimum number of students who will be engaged in reading?

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
The only line of each test case contains three space-separated integers
N
N,
X
X and
K
K — the total number of students, the number of boys and the number of students in each trekking group.
Output Format
For each test case, output on a new line the the minimum number of students engaged in reading.
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
,
K
≤
1
0
9
1≤N,K≤10
9

1
≤
X
≤
N
1≤X≤N

---Input---
3
12 4 3
15 10 5
8 8 3
---Output---
1
0
2
**/


import java.util.Scanner;

public class AmILucky {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int k=sc.nextInt();
            int y=n-x;
            int boysLeft=x%k;
            int girlsLeft =y%k;
            if(boysLeft>= girlsLeft)
            {
                System.out.println(boysLeft-girlsLeft);
            }
            else
            {
                System.out.println(girlsLeft-boysLeft);
            }
        }
    }
}
