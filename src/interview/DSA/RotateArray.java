package interview.DSA;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of elements: ");
        int n = sc.nextInt();
        //array
        int[] array = new int[n];

        for (int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the steps: ");
        int s = sc.nextInt();

        Helper rotateHelper = new Helper();
        System.out.println(Arrays.toString(rotateHelper.rotate(array, s)));
    }
}

class Helper{
    Logger logger = Logger.getLogger(Helper.class.getName());
    public int[] rotate(int[] nums, int k) {
        if(k > nums.length)
            k=k%nums.length;
            logger.info(String.valueOf(k));
            logger.info(String.valueOf(nums.length));
        int[] result = new int[nums.length];
        for(int i=0; i < k; i++){
            result[i] = nums[nums.length-k+i];
            //logger.info(String.valueOf(result[i]));
        }
        int j=0;
        for(int i=k; i<nums.length; i++){
            result[i] = nums[j];
            j++; }
        System.arraycopy(result, 0, nums, 0, nums.length);
        return result;
    }

}
