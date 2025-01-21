package CodeChef.Problems.Difficulty500to1000;

/*
Building Race
Two friends Chef and Chefina are currently on floors
A
A and
B
B respectively. They hear an announcement that prizes are being distributed on the ground floor and so decide to reach the ground floor as soon as possible.

Chef can climb down
X
X floors per minute while Chefina can climb down
Y
Y floors per minute. Determine who will reach the ground floor first (ie. floor number 0). In case both reach the ground floor together, print Both.

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
The first line of each test case contains four space-separated integers
A
A,
B
B,
X
X, and
Y
Y — the current floor of Chef, the current floor of Chefina, speed of Chef and speed of Chefina in floors per minute respectively.
Output Format
For each test case, output on a new line:

Chef if Chef reaches the ground floor first.
Chefina if she reaches the ground floor first.
Both if both reach the ground floor at the same time.
You may print each character of the string in uppercase or lowercase. For example, the strings CHEF, chef, Chef, and chEF are all considered the same.

Constraints
1
≤
T
≤
2500
1≤T≤2500
1
≤
A
,
B
≤
100
1≤A,B≤100
1
≤
X
,
Y
≤
10
1≤X,Y≤10

---Input---
4
2 2 2 2
4 2 1 5
3 2 4 1
3 2 2 1
---Output---
Both
Chefina
Chef
Chef
**/

import java.util.Scanner;

public class BuildingRace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            // Compare a*y and b*x to avoid floating-point precision issues
            if(a * y == b * x){
                System.out.println("Both");
            } else if(a * y > b * x){
                System.out.println("Chefina");
            } else {
                System.out.println("Chef");
            }
        }
    }
}
/*
Explanation:
Instead of comparing a/x and b/y, we compare a * y and b * x. This avoids the need for floating-point division and ensures accurate comparisons.
This approach is mathematically equivalent to comparing a/x and b/y but avoids precision errors.
This should resolve any issues with your code.

---Alternative--- takes 20s , above takes 26s to execute
double a = sc.nextInt();
            double b = sc.nextInt();
            double x = sc.nextInt();
            double y = sc.nextInt();
            if(a/x == b/y){
                System.out.println("Both");
            } else {
                if(a/x > b/y){
                    System.out.println("Chefina");
                } else {
                    System.out.println("Chef");
                }
            }
**/
