package CodeChef.Problems.Strings.Difficulty1000Plus;

/*
Efficient PAN Linking
There are
20
20 officers in Chefland who can link the PAN to Aadhar.
N
N applications were received for linking PAN. However, due to an internal conflict, each officer intends to process exactly the same number of applications.

Determine the minimum number of applications that would remain unprocessed.

Note that
N
N can be huge and might not fit in an integer.

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
Each test case consists of a single integer
N
N, denoting the number of applications.
Output Format
For each test case, output the minimum number of applications that will remain unprocessed.

Constraints
1
≤
T
≤
1000
1≤T≤1000
1
≤
N
<
1
0
100
1≤N<10
100

---Input---
4
1
35
127
7463749812302340912745859
---Output---
1
15
7
19
**/

import java.math.BigInteger;
import java.util.Scanner;

public class EfficientPANLinking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String s = scanner.next();
            BigInteger n = new BigInteger(s);

            if (n == BigInteger.ONE){
                System.out.println("1");
            } else {
                System.out.println(n.subtract(BigInteger.valueOf(20).multiply(n.divide(BigInteger.valueOf(20)))));
            }
        }
    }
}
