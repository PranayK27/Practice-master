package CodeChef.Problems.Difficulty500to1000;
/*
Secret Recipe
Read problems statements in Mandarin chinese, Russian and Vietnamese as well.
Chef and his competitor Kefa own two restaurants located at a straight road. The position of Chef's restaurant is
X
1
X
1
​
 , the position of Kefa's restaurant is
X
2
X
2
​
 .

Chef and Kefa found out at the same time that a bottle with a secret recipe is located on the road between their restaurants. The position of the bottle is
X
3
X
3
​
 .

The cooks immediately started to run to the bottle. Chef runs with speed
V
1
V
1
​
 , Kefa with speed
V
2
V
2
​
 .

Your task is to figure out who reaches the bottle first and gets the secret recipe (of course, it is possible that both cooks reach the bottle at the same time).

Input
The first line of the input contains a single integer
T
T denoting the number of test cases. The description of
T
T test cases follows.
The first and only line of each test case contains five space-separated integers
X
1
X
1
​
 ,
X
2
X
2
​
 ,
X
3
X
3
​
 ,
V
1
V
1
​
  and
V
2
V
2
​
 .
Output
For each test case, print a single line containing the string "Chef" if Chef reaches the bottle first, "Kefa" if Kefa reaches the bottle first or "Draw" if Chef and Kefa reach the bottle at the same time (without quotes).

Constraints
1
≤
T
≤
1
0
5
1≤T≤10
5

∣
X
1
∣
,
∣
X
2
∣
,
∣
X
3
∣
≤
1
0
5
∣X
1
​
 ∣,∣X
2
​
 ∣,∣X
3
​
 ∣≤10
5

X
1
<
X
3
<
X
2
X
1
​
 <X
3
​
 <X
2
​

1
≤
V
1
≤
1
0
5
1≤V
1
​
 ≤10
5

1
≤
V
2
≤
1
0
5
1≤V
2
​
 ≤10
5

---Input---
3
1 3 2 1 2
1 5 2 1 2
1 5 3 2 2

---Output---
Kefa
Chef
Draw

**/


import java.util.Scanner;

public class SecretRecipe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            float x1 = sc.nextInt();
            float x2 = sc.nextInt();
            float x3 = sc.nextInt();
            float v1 = sc.nextInt();
            float v2 = sc.nextInt();

            float ans = (x3 - x1) / v1;
            float ans1 = (x2 - x3) / v2;
            if (ans > ans1) {
                System.out.println("Kefa");
            } else if (ans < ans1) {
                System.out.println("Chef");
            } else {
                System.out.println("Draw");
            }


        }
    }
}
