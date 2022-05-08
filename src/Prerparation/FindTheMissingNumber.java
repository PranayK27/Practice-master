package Prerparation;

// Java program to find missing Number
class FindTheMissingNumber {
    public static int
    findDisappearedNumbers(int[] nums)
    {
        int n=nums.length;
        int sum=((n+1)*(n+2))/2;
        for (int num : nums) sum -= num;
        return sum;
    }
    public static void main(String[] args)
    {
        int[] a = { 1, 2, 4, 5, 6 };
        System.out.println(findDisappearedNumbers(a));
    }
}
