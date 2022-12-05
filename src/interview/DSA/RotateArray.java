package interview.DSA;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

public class RotateArray {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger(RotateArray.class.getName());

        Scanner sc = new Scanner(System.in);

        logger.info("Number of elements: ");
        int n = sc.nextInt();
        //array
        int[] array = new int[n];

        for (int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }

        logger.info("Enter the steps: ");
        int s = sc.nextInt();

        Helper rotateHelper = new Helper();
        logger.info(Arrays.toString(rotateHelper.rotate(array, s)));
        logger.info(Arrays.toString(rotateHelper.rotate2(array, s)));
        logger.info(Arrays.toString(rotateHelper.rotate3(array, s)));

    }
}

class Helper{
    Logger logger = Logger.getLogger(Helper.class.getName());

    //Solution 1
    public int[] rotate(int[] nums, int k) {
        if(k > nums.length)
            k=k%nums.length;
//            logger.info(String.valueOf(k));
//            logger.info(String.valueOf(nums.length));
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

    //Solution 2
    public static int[] rotate2(int[] arr, int order) {
        if (arr == null || arr.length == 0 || order < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }
        for (int i = 0; i < order; i++) {
            for (int j = arr.length - 1; j > 0; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
        return arr;
    }

    //Solution 3
    public static int[] rotate3(int[] arr, int order) {
        if (arr == null || arr.length==0 || order < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }
        if(order > arr.length){
            order = order %arr.length;
        }
        //length of first part
        int a = arr.length - order;
        reverse(arr, 0, a-1);
        reverse(arr, a, arr.length-1);
        reverse(arr, 0, arr.length-1);
        return arr;
    }
    public static void reverse(int[] arr, int left, int right){
        if(arr == null || arr.length == 1)
            return;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

}
