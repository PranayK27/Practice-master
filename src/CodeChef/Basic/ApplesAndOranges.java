package CodeChef.Basic;

import java.util.Scanner;

/*
* Problem
Bob has X rupees and goes to a market. The cost of apples is Rs. A per kg and the cost of oranges is Rs. B per kg.

Determine whether he can buy at least 11 kg each of apples and oranges.

Input Format
The first line of input will contain an integer X, the amount of money Bob has.
The second line of input contains two space-separated integers A and B, the cost per kg of apples and oranges respectively.
Output Format
Print a single line containing Yes if Bob can buy the fruits and No otherwise.

You may print each character of the string in uppercase or lowercase (for example, the strings yes, Yes, yEs, and YES will all be treated as identical).

Constraints
1 \leq X,A,B \leq 10^51≤X,A,B≤10
5

Subtasks
Subtask 1 (100 points):
Original constraints.
Sample 1:
Input
14
2 2
Output
Yes
Explanation:
The cost of buying 1 kg each of apple and orange is 2+2=4. Since Bob has more than 4 rupees, the answer will be Yes.

Sample 2:
Input
1
1 1
Output
No
Explanation:
Bob can only buy either 1 kg of apples or 1 kg of oranges with 1 rupee, hence the answer is No.

Sample 3:
Input
5
3 2
Output
Yes
Explanation:
The cost of buying 1 kg each of apple and orange is 3+2=5. Since Bob has exactly 5 rupees, the answer will be Yes.

Sample 4:
Input
Output
10000
5000 6000
Output
No
Explanation:
The cost of buying 1 kg each of apple and orange is 5000+6000=11000. Since Bob has only 10000 rupees, the answer will be No.
* */

public class ApplesAndOranges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rs=sc.nextInt();
        int AperKg=sc.nextInt();
        int OperKg=sc.nextInt();

        if(rs>=(AperKg+OperKg)){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}
