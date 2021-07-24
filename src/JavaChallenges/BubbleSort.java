package JavaChallenges;



import java.util.Scanner;

class Sorting{
    public int[] bubbleSort(int[] numbers){
        if (numbers == null)
            return numbers;

        boolean numberSwapped;

        do {
            numberSwapped = false;
            for (int i=0; i < numbers.length; i++){
                if (numbers[i] > numbers[i+1]){
                    int aux = numbers[i+1];
                    numbers[i+1] = numbers[i];
                    numbers[i] = aux;
                    numberSwapped = true;
                }
            }
        } while (numberSwapped);
        return numbers;
    }
}
public class BubbleSort {
    public static void main(String args[]){

        Sorting sorting = new Sorting();

//        int count;
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter number of elements you want in the array: ");
//        count = scan.nextInt();
//
//        int num[] = new int[count];
//        System.out.println("Enter array elements:");
//
//        for (int i = 0; i < count; i++)
//        {
//            num[i] = scan.nextInt();
//        }
//        scan.close();
//
//        int[] array = {10, 30, 40, 20};

       // System.out.println(sorting.bubbleSort(num));
    }
}
