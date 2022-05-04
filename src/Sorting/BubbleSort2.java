package Sorting;


import java.util.Scanner;

public class BubbleSort2 {
    public static void main(String[] args) {
        // Scanner class object to read input
        Scanner scan = new Scanner(System.in);
        //allow user  input;
        System.out.println("How many numbers do you want to enter?");
        int num = scan.nextInt();

        int array[] = new int[num];

        System.out.println("Enter the " + num + " numbers now.");

        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        int j, k, t;

        for( j=0; j<array.length-1; j++){
            for (k=0; k< array.length-1-j; k++){
                if (array[k]>array[k+1]){
                    t=array[k];
                    array[k]=array[k+1];
                    array[k+1]=t;
                }
            }
        }

        System.out.println("Sorted numbers are: ");
        for (int a=0; a< array.length; a++){
            System.out.print(array[a] + " ");
        }
    }
}
