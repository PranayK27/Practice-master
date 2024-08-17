package CodeChef.Problems.Strings;
/*
N Buttons 1 Bulb
Kulyash stays in room that has a single bulb and
N
N buttons. The bulb is initially on.

The initial states of the buttons are stored in a binary string
S
S of length
N
N — if
S
i
S
i
​
  is
0
0, the
i
i-th button is off, and if
S
i
S
i
​
  is
1
1, the
i
i-th button is on. If Kulyash toggles any single button then the state of the bulb reverses i.e. the bulb lights up if it was off and vice versa.

Kulyash has toggled some buttons and the final states of the buttons are stored in another binary string
R
R of length
N
N. He asks you to determine the final state of the bulb.

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
Each test case consists of three lines of input.
The first line of each test case contains an integer
N
N — the number of buttons.
The second line of each test case contains a binary string
S
S — the initial states of the buttons.
The third line of each test case contains a binary string
R
R — the final states of the buttons.
Output Format
For each test case, output on a new line the final state of the bulb (
0
0 for off and
1
1 for on).

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
≤
100
1≤N≤100
S
S and
R
R are binary strings, i.e, contain only the characters
0
0 and
1
1.

--- Input ---
2
3
000
001
2
00
11
--- Output ---
0
1

**/

import java.util.Scanner;

public class NButtonsOneBulb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            String r = scanner.next();
            int toggleCount = 0;

            for(int i=0; i<n; i++){
                Character ch1 = s.charAt(i);
                Character ch2 = r.charAt(i);
                boolean isEqual = ch1.equals(ch2);
                if(!isEqual)
                    toggleCount++;
            }

            if(toggleCount%2 == 0)
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
