package CodeChef.Problems.Difficulty500to1000;

/*
Minimum Pizzas
Each pizza consists of
4
4 slices. There are
N
N friends and each friend needs exactly
X
X slices.

Find the minimum number of pizzas they should order to satisfy their appetite.

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
Each test case consists of two integers
N
N and
X
X, the number of friends and the number of slices each friend wants respectively.
Output Format
For each test case, output the minimum number of pizzas required.

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
,
X
≤
10
1≤N,X≤10

---Input---
4
1 5
2 6
4 3
3 5
---Output---
2
3
3
4
**/

import java.util.Scanner;

public class MinimumPizza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int x=0; x<T; x++){
            int numOfF=sc.nextInt();
            int slicePerF=sc.nextInt();
            int slicePerPizza=4;

            int reqSlices=numOfF*slicePerF;

            int numofPizzaReq = reqSlices/slicePerPizza;

            if((reqSlices%slicePerPizza)!=0){
                numofPizzaReq++;
                System.out.println(numofPizzaReq);
            } else {
                System.out.println(numofPizzaReq);
            }
        }
    }
}
