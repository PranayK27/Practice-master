package interview.DSA;

import java.util.Scanner;

public class SlidingWindowApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


    }
}

class Function{
    public int slidingWindowForMaxSum(int arr[], int n, int k) {
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < n - k + 1; i++) {
            int current_sum = 0;
            for (int j = 0; j < k; j++)
                current_sum = current_sum + arr[i + j];
            max_sum = Math.max(current_sum, max_sum); }
        return max_sum;
    }
}
