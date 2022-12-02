package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Generator generator = new Generator();
//        generator.generate(n);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        System.out.print("Generated Triangle: ");
        System.out.print(generator.generate(n));
    }
}

class Generator{

    public static List<List<Integer>> generate(int numRows){

        List<List<Integer>> result = new ArrayList<>();

        List<Integer> list, pre = null;

        for (int i = 0; i < numRows; i++) {
            list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 | j == i) {
                    list.add(1);
                } else {
                    list.add(pre.get(j - 1) + pre.get(j));
                }
            }
            pre = list;
            result.add(list);
        }
        return result;

    }
}
