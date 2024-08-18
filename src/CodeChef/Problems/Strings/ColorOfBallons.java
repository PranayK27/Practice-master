package CodeChef.Problems.Strings;

/*
Malvika is peculiar about color of balloons
Little Malvika is very peculiar about colors. On her birthday, her mom wanted to buy balloons for decorating the house. So she asked her about her color preferences. The sophisticated little person that Malvika is, she likes only two colors — amber and brass. Her mom bought n balloons, each of which was either amber or brass in color. You are provided this information in a string s consisting of characters 'a' and 'b' only, where 'a' denotes that the balloon is amber, where 'b' denotes it being brass colored.

When Malvika saw the balloons, she was furious with anger as she wanted all the balloons of the same color. In her anger, she painted some of the balloons with the opposite color (i.e., she painted some amber ones brass and vice versa) to make all balloons appear to be the same color. As she was very angry, it took her a lot of time to do this, but you can probably show her the right way of doing so, thereby teaching her a lesson to remain calm in difficult situations, by finding out the minimum number of balloons needed to be painted in order to make all of them the same color.

Input Format
The first line of input contains a single integer T, denoting the number of test cases.
The first and only line of each test case contains a string s.
Output Format
For each test case, output a single line containing an integer — the minimum number of flips required.
Constraints
1 ≤ T ≤ 100
1 ≤ n ≤ 100, where n denotes to the length of the string s.

--- Input ---
3
ab
bb
baaba
--- Output ---
1
0
2
**/

import java.util.Scanner;

public class ColorOfBallons {
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int amber = 0, brass = 0;
            for (int i = 0; i < s.length(); i++)
            {
                if (s.charAt(i) == 'a')
                    amber++;
                else if (s.charAt(i) == 'b')
                    brass++;
            }
            System.out.println(Math.min(amber, brass));
        }
    }
}
