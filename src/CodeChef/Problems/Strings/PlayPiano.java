package CodeChef.Problems.Strings;

/*
Play Piano
Two sisters, A and B, play the piano every day. During the day, they can play in any order. That is, A might play first and then B, or it could be B first and then A. But each one of them plays the piano exactly once per day. They maintain a common log, in which they write their name whenever they play.

You are given the entries of the log, but you're not sure if it has been tampered with or not. Your task is to figure out whether these entries could be valid or not.

Input
The first line of the input contains an integer
T
T denoting the number of test cases. The description of the test cases follows.
The first line of each test case contains a string
s
s denoting the entries of the log.
Output
For each test case, output yes or no according to the answer to the problem.
Constraints
1
≤
T
≤
500
1≤T≤500
2
≤
∣
s
∣
≤
100
2≤∣s∣≤100
∣
s
∣
∣s∣ is even
Each character of
s
s is either 'A' or 'B'

--- Input ---
4
AB
ABBA
ABAABB
AA
--- Output ---
yes
yes
no
no
**/

import java.util.Scanner;

public class PlayPiano {
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String turn = sc.next();
            String answer = "yes";
            for (int i = 0; i < turn.length(); i = i + 2) {
                Character ch1 = turn.charAt(i);
                Character ch2 = turn.charAt(i + 1);
                if (ch1.equals(ch2)) {
                    answer = "no";
                    break;
                }
            }
            System.out.println(answer);
        }
    }
}
