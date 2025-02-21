package CodeChef.Problems.Difficulty500to1000;
/*
Genes
People in Chefland have three different eye colors, namely brown, blue, and green. green is the rarest of the eye colors whereas brown is most common.

The eye color of the child of two people is most likely to be the most common eye color between them.

You are given two characters denoting the eye colors of two people in Chefland. The character R denotes bRown color, B denotes Blue color, and G denotes Green color.

Determine the most likely eye color of their child. (Print R, B or G denoting bRown, Blue or Green respectively).

Please see the sample test cases below for explained examples.

Input Format
The first (and only) line of input contains two space-separated characters, the eye colors of the parents.
Output Format
Print a single character denoting the most likely eye color of the child. (Print R, B or G denoting brown, blue or green respectively).

Constraints
The input contains two space-separated characters
Each character in the input is one among {R, B, G}.

--Input---
R R
R B
R G
B R
B B
B G
G R
G B
G G
---Output---
R
R
R
R
B
B
R
B
G
**/

import java.util.Scanner;

public class Genes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);

        if((c1 == 'R' && (c2 =='B' || c2 == 'R' || c2 == 'G')) || (c1 == 'G' && c2 == 'R') ){
            System.out.println("R");
        } else if((c1 == 'B' && (c2 == 'B' || c2 == 'G')) || (c1 == 'G' && c2 == 'B') ){
            System.out.println("B");
        } else if(c1 == 'G' && c2 == 'G'){
            System.out.println("G");
        }
    }
}
