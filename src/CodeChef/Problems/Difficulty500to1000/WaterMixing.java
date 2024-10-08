package CodeChef.Problems.Difficulty500to1000;
/*
Water Mixing
Chef is setting up a perfect bath for himself. He has
X
X litres of hot water and
Y
Y litres of cold water.
The initial temperature of water in his bathtub is
A
A degrees. On mixing water, the temperature of the bathtub changes as following:

The temperature rises by
1
1 degree on mixing
1
1 litre of hot water.
The temperature drops by
1
1 degree on mixing
1
1 litre of cold water.
Determine whether he can set the temperature to
B
B degrees for a perfect bath.

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
Each test case consists of four space-separated integers
A
,
B
,
X
,
A,B,X, and
Y
Y — the initial temperature of bathtub, the desired temperature of bathtub, the amount of hot water in litres, and the amount of cold water in litres respectively.
Output Format
For each test case, output on a new line, YES if Chef can get the desired temperature for his bath, and NO otherwise.

You may print each character of the string in uppercase or lowercase (for example, the strings YES, yEs, yes, and yeS will all be treated as identical).

Constraints
1
≤
T
≤
2000
1≤T≤2000
20
≤
A
,
B
≤
40
20≤A,B≤40
0
≤
X
,
Y
≤
20
0≤X,Y≤20
**/


import java.util.Scanner;

public class WaterMixing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(a<=b && (b-a)<=x)
            {
                System.out.println("YES");

            }
            else if(a>=b && (a-b)<=y)
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

    }
}
