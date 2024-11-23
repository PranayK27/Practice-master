package CodeChef.Problems.Strings.Difficulty1000Plus;

/*
Password
Read problems statements in Hindi, Mandarin Chinese, Russian, Vietnamese, and Bengali as well.
Chef is planning to setup a secure password for his Codechef account. For a password to be secure the following conditions should be satisfied:

Password must contain at least one lower case letter
[
a
−
z
]
[a−z];

Password must contain at least one upper case letter [A−Z] strictly inside (first or the last character won’t be considered)

Password must contain at least one digit
[
0
−
9
]
[0−9] strictly inside;

Password must contain at least one special character from the set
{
{ '@', '#', '%', '&', '?'
}
} strictly inside;

Password must be at least
10
10 characters in length, but it can be longer.

Chef has generated several strings and now wants you to check whether the passwords are secure based on the above criteria. Please help Chef in doing so.

Input
First line will contain
T
T, number of testcases. Then the testcases follow.
Each testcase contains of a single line of input, string
S
S.
Output
For each testcase, output in a single line "YES" if the password is secure and "NO" if it is not.

Constraints
1
≤
∣
S
∣
≤
20
1≤∣S∣≤20
All the characters in
S
S are one of the following: lower case letters
[
a
−
z
]
[a−z], upper case letters
[
A
−
Z
]
[A−Z], digits
[
0
−
9
]
[0−9], special characters from the set
{
{ '@', '#', '%', '&', '?'
}
}
Sum of length of strings over all tests is atmost
1
0
6
10
6


---Input---
3
#cookOff#P1
U@code4CHEFINA
gR3@tPWD
---Output---
NO
YES
NO
**/

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // Number of test cases
        while (T-- > 0) {
            String S = sc.next();
            if (isSecurePassword(S)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }

    private static boolean isSecurePassword(String S) {
        int n = S.length();

        // Condition 1: Length must be at least 10
        if (n < 10) {
            return false;
        }

        // Flags for each condition
        boolean hasLowercase = false;
        boolean hasUppercaseInside = false;
        boolean hasDigitInside = false;
        boolean hasSpecialCharInside = false;

        // Define the set of special characters
        String specialChars = "@#%&?";

        // Iterate through the string
        for (int i = 0; i < n; i++) {
            char ch = S.charAt(i);

            // Check for lowercase letter (any position)
            if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            }

            // Check strictly inside for other conditions
            if (i > 0 && i < n - 1) {
                if (Character.isUpperCase(ch)) {
                    hasUppercaseInside = true;
                }
                if (Character.isDigit(ch)) {
                    hasDigitInside = true;
                }
                if (specialChars.indexOf(ch) != -1) {  // Check if ch is in the specialChars string
                    hasSpecialCharInside = true;
                }
            }
        }

        // Return true if all conditions are met
        return hasLowercase && hasUppercaseInside && hasDigitInside && hasSpecialCharInside;
    }
}
