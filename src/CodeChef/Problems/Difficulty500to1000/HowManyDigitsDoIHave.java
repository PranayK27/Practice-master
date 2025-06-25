package CodeChef.Problems.Difficulty500to1000;
/*
HOW MANY DIGITS DO I HAVE
Write a program to obtain a number
(
N
)
(N) from the user and display whether the number is a one digit number, 2 digit number, 3 digit number or more than 3 digit number

Input Format
First line will contain the number
N
N,

Output Format
Print "1" if N is a 1 digit number.

Print "2" if N is a 2 digit number.

Print "3" if N is a 3 digit number.

Print "More than 3 digits" if N has more than 3 digits.

Constraints
0
≤
N
≤
1000000
0≤N≤1000000

---Input---
9
---Output---
1
**/


import java.util.Scanner;

public class HowManyDigitsDoIHave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        if (n.length() == 1) {
            System.out.println("1");
        } else if (n.length() == 2) {
            System.out.println("2");
        } else if(n.length() == 3){
            System.out.println("3");
        } else if(n.length() > 3) {
            System.out.println("More than 3 digits");
        }
    }
}
