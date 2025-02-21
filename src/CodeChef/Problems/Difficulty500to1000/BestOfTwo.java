package CodeChef.Problems.Difficulty500to1000;

/*
Best of Two
Alice and Bob are playing a game. Each player rolls a standard six-sided die three times. The score of a player is calculated as the sum of the two highest rolls. The player with the higher score wins. If both players have the same score, the game ends in a tie.

Determine the winner of the game or if it is a tie.

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
Each test case contains six space-separated integers
A
1
A
1
​
 ,
A
2
A
2
​
 ,
A
3
A
3
​
 ,
B
1
B
1
​
 ,
B
2
B
2
​
  and
B
3
B
3
​
  — the values Alice gets in her
3
3 dice rolls, followed by the values which Bob gets in his
3
3 dice rolls.
Output Format
For each test case, output on a new line Alice if Alice wins, Bob if Bob wins and Tie in case of a tie.

Note that you may print each character in uppercase or lowercase. For example, the strings tie, TIE, Tie, and tIe are considered identical.

Constraints
1
≤
T
≤
1
0
4
1≤T≤10
4

1
≤
A
1
,
A
2
,
A
3
,
B
1
,
B
2
,
B
3
≤
6
1≤A
1
​
 ,A
2
​
 ,A
3
​
 ,B
1
​
 ,B
2
​
 ,B
3
​
 ≤6

 ---Input---
3
3 2 5 6 1 1
4 4 5 6 4 1
6 6 6 6 6 1

1 1 2 1 2 1
 ---Output---
Alice
Bob
Tie
**/

import java.util.Arrays;
import java.util.Scanner;

public class BestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();
            int f = sc.nextInt();
            int temp1, temp2;
            temp1 = sumOfLargestNumbers(a, b, c);
            temp2 = sumOfLargestNumbers(d, e, f);
            if(temp1 > temp2){
                System.out.println("Alice");
            } else if (temp1 == temp2) {
                System.out.println("Tie");
            } else {
                System.out.println("Bob");
            }
        }
    }

    private static int sumOfLargestNumbers(int x, int y, int z) {
        int temp;
        if(x<=y && x<=z){
            temp = x+y+z - x;
        } else if(y<=x && y<=z){
            temp = x+y+z - y;
        } else {
            temp = x + y + z - z;
        }
        return temp;
    }
}
