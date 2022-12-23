package CodeChef.Basic;

import java.util.Scanner;

/*
Problem
Chef's playlist contains 3 songs named A,B, and C, each of duration exactly X minutes. Chef generally plays these 33 songs in loop, i.e, A \rightarrow B \rightarrow C \rightarrow A \rightarrow B \rightarrow C \rightarrow A \rightarrow \dotsA→B→C→A→B→C→A→…

Chef went on a train journey of N minutes and played his playlist on loop for the whole journey. How many times did he listen to the song C completely?

Input Format
The first line of input will contain a single integer T, denoting the number of test cases. The description of the test cases follows.
Each test case consists of a single line of input, containing two space-separated integers N, X.
Output Format
For each test case, output on a new line the number of times Chef listens to the song CC completely.

Constraints
1≤T≤1000
1≤N≤100
1≤X≤10
Sample 1:
Input
5
6 1
5 1
11 2
5 8
100 9
Output
2
1
1
0
3
Explanation:
Test case 1: Since each song is of duration 1 minute and the journey is 6 minutes long, Chef listens each of the songs A,B,C twice.

Test case 2: Since each song is of duration 1 minute and the journey is 5 minutes long, Chef listens the songs A,B twice but C only once.

Test case 3: Since each song is of duration 2 minutes and the journey is 11 minutes long, Chef listens the songs A,B twice but C only once. Note that Chef is in the middle of listening to song C for the second time when the journey ends, but it is not counted since he hasn't listened to it fully.

Test case 4: Chef cannot hear any song since the journey is shorter than his song duration.
* */

public class Playlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int x=0; x<T; x++){
            int journey=sc.nextInt();
            int min=sc.nextInt();
            int songs=3;

            int rep;

            System.out.println(journey/(3*min));

        }
    }
}
