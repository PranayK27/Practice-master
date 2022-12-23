package CodeChef.Bronze;

import java.util.Scanner;

/*
Problem
Chef has decided to join a Gym in ChefLand and if possible, also hire a personal trainer at the gym. The monthly cost of the gym is X and personal training will cost him an additional Y per month. Chef's total budget per month is only Z. Print 1 if Chef can only join the gym, 2 if he can also have a personal trainer, and 0 if he can't even join the gym.

Note that if Chef wants to hire a personal trainer, he must join the gym — he cannot hire the trainer without joining the gym.

Input Format
The first line of input will contain a single integer T, denoting the number of test cases. Then the test cases follow.
Each test case consists of a single line of input containing three space-separated integers X,Y,Z.
Output Format
For each test case, output in a single line 2 if Chef can go to the gym and have a trainer, 1 if Chef can only go to the gym, 0 if he can't even go to the gym.

Constraints
1≤T≤100
1≤X,Y,Z≤100
Sample 1:
Input
4
1 2 3
10 12 13
23 1 22
23 1 63
Output
2
1
0
2
Explanation:
Test case 1: Since the total cost of Chef getting a gym membership and a trainer is 1+2=3 which is equal to his budget of 3, Chef can get both a gym membership and a trainer.

Test case 2: Since the total cost of Chef getting a gym membership and a trainer is 10+12=22 which is greater than his budget of 13, he can't get both a gym membership and a trainer. However, the cost of the gym membership is 10 which is less than his budget of 13, so Chef can get only a gym membership.

Test case 3: Since the cost of Chef getting a gym membership is 23 which is greater than his budget of 22, Chef can't even get the gym membership.

Test case 4: The same costs as the previous test, but this time Chef has enough money to afford both the membership and a personal trainer.
* */

public class ChefAndGym {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int x=0; x<T; x++){
            int costOfGym=sc.nextInt();
            int addCostOfPT=sc.nextInt();

            int budget=sc.nextInt();
            int a=0, b=1, c=2;

            if(budget < costOfGym){
                System.out.println(a);
            } else if(budget < (costOfGym + addCostOfPT)){
                System.out.println(b);
            } else if(budget >= (costOfGym + addCostOfPT)){
                System.out.println(c);
            }
        }
    }
}
