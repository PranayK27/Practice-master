package Sorting;

import java.util.Scanner;

public class SelectionSort2 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the " + n + " numbers now.");

        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int small, pos, temp, j, k;

        for (j=0; j<arr.length; j++){
            small=arr[j];
            pos=j;
            for (k=j+1; k<arr.length; k++){
                if (arr[k]<small){
                    small=arr[k];
                    pos=k;
                }
            }
            temp=arr[j];
            arr[j]=arr[pos];
            arr[pos]=temp;
        }

        System.out.println("Sorted numbers are: ");
        for (int a=0; a< arr.length; a++){
            System.out.print(arr[a] + " ");
        }
    }
}
