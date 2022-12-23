package CodeChef.Bronze;

import java.util.Scanner;

public class ShoppingChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int x=0; x<T; x++){
            int price=sc.nextInt();

            int back = 100 - price;
            System.out.println(back);
        }
    }
}
