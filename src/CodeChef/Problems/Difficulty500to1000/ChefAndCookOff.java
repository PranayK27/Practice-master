package CodeChef.Problems.Difficulty500to1000;

/*
Chef and Cook-Off
Read problems statements in Mandarin chinese, Russian and Vietnamese as well.
Chef has obtained the results of a past Cook-Off. He wants to estimate the skill level of each contestant. The contestants can be classified with high probability (w.h.p.) based on the number of solved problems:

A contestant that solved exactly 0 problems is a beginner.
A contestant that solved exactly 1 problem is a junior developer.
A contestant that solved exactly 2 problems is a middle developer.
A contestant that solved exactly 3 problems is a senior developer.
A contestant that solved exactly 4 problems is a hacker.
A contestant that solved all five problems is Jeff Dean.
Please help Chef to identify the programming level of each participant.

Input
The first line of the input contains a single integer N denoting the number of competitors.
N lines follow. The i-th of these lines contains five space-separated integers Ai, 1, Ai, 2, Ai, 3, Ai, 4, Ai, 5. The j-th of these integers (1 ≤ j ≤ 5) is 1 if the i-th contestant solved the j-th problem and 0 otherwise.
Output
For each participant, print a single line containing one string denoting Chef's classification of that contestant — one of the strings "Beginner", "Junior Developer", "Middle Developer", "Senior Developer", "Hacker", "Jeff Dean" (without quotes).

Constraints
1 ≤ N ≤ 5000
0 ≤ Ai, j ≤ 1 for each valid i, j


---Input---
7
0 0 0 0 0
0 1 0 1 0
0 0 1 0 0
1 1 1 1 1
0 1 1 1 0
0 1 1 1 1
1 1 1 1 0
---Output---
Beginner
Middle Developer
Junior Developer
Jeff Dean
Senior Developer
Hacker
Hacker
**/

import java.util.Scanner;

public class ChefAndCookOff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int[] arr = new int[5];
            int total = 0;
            for(int i=0;i<5;i++){
                arr[i] = sc.nextInt();
            }
            for(int i=0;i<5;i++){
                total += arr[i];
            }
            if(total == 0){
                System.out.println("Beginner");
            } else if (total == 1) {
                System.out.println("Junior Developer");
            } else if (total == 2) {
                System.out.println("Middle Developer");
            } else if (total == 3) {
                System.out.println("Senior Developer");
            } else if (total == 4) {
                System.out.println("Hacker");
            } else if (total == 5) {
                System.out.println("Jeff Dean");
            }
        }
    }
}
