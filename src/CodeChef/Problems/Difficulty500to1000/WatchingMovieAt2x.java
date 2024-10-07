package CodeChef.Problems.Difficulty500to1000;

/*
Watching Movies at 2x
Chef started watching a movie that runs for a total of
X
X minutes.

Chef has decided to watch the first
Y
Y minutes of the movie at twice the usual speed as he was warned by his friends that the movie gets interesting only after the first
Y
Y minutes.

How long will Chef spend watching the movie in total?

Note: It is guaranteed that
Y
Y is even.

Input Format
The first line contains two space separated integers
X
,
Y
X,Y - as per the problem statement.
Output Format
Print in a single line, an integer denoting the total number of minutes that Chef spends in watching the movie.
Constraints
1
≤
X
,
Y
≤
1000
1≤X,Y≤1000
Y
Y is an even integer.
Subtasks
Subtask #1 (100 points): original constraints

---Input---
Sample 1:
100 20
Sample 2:
50 24
---Output---
Sample1:
90
Sample2:
38
**/

import java.util.Scanner;

public class WatchingMovieAt2x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(x-(y/2));
    }
}
