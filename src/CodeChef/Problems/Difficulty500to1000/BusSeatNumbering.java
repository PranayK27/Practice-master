package CodeChef.Problems.Difficulty500to1000;

/*
Bus Seat Numbering
There is a bus with 30 seats. The seats are numbered from 1 to 30, and the numbering is as depicted in this image.

----------------------busseatnum.png----------------------- in the root folder

As can be seen in the image, the bus is divided into two decks - The Lower deck, and the Upper deck, with 15 seats each. And some of the seats come as Single and some as Double. For example, Seats 1 and 2 are Double, whereas Seat 11 is a Single.

You will be given a Seat number, and your job is to classify it as one of these 4 types:

Lower Single
Lower Double
Upper Single
Upper Double
Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
Each test case consists of a single line of input which contains a single integers
N
N — the seat number.
Output Format
For each test case, output on a new line, the type of seat.

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
30
1≤N≤30
**/

import java.util.Scanner;

public class BusSeatNumbering {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes hereScanner sc=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();

            if(n<=10){
                System.out.println("Lower Double");
            } else if(n>=16 && n<=25){
                System.out.println("Upper Double");
            } else if(n>=11 && n<=15){
                System.out.println("Lower Single");
            } else if(n>=26 && n<=30){
                System.out.println("Upper Single");
            }
        }
    }
}
