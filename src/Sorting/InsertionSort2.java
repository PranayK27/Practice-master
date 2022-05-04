package Sorting;

import java.util.Scanner;

public class InsertionSort2 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the " + n + " numbers now.");

        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int j, k, temp;

        for (j=1; j<n; j++){
            temp=arr[j];
            k=j-1;
            while (temp<arr[k]){
                arr[k+1]=arr[k];
                k--;
            }
            arr[k+1]=temp;
        }

        System.out.println("Sorted numbers are: ");
        for (int a=0; a< arr.length; a++){
            System.out.print(arr[a] + " ");
        }
    }
}
