package Sorting;

class BaseForQuickSort{
    public int[] quickSort(int[] numbers, int low, int high){
        if (low<high){
            int partition_border = partition(numbers, low, high);

            //sort elements recursively
            quickSort(numbers, low, partition_border-1);
            quickSort(numbers, partition_border+1, high);
        }
        return numbers;
    }

    private int partition(int[] numbers, int low, int high){
        int pivot = numbers[high]; //element to be place at right position

        int i=low-1;

        for (int j=low; j<high; j++){
            //swap when element is smaller than pivot
            if (numbers[j]<pivot){
                i++;
                int aux=numbers[i];
                numbers[i]=numbers[j];
                numbers[j]=aux;
            }
        }
        numbers[high]=numbers[i+1];
        numbers[i+1]=pivot;
        return i+1;
    }
}

public class QuickSort {
    public static void main(String[] args) {

        int[] arr={10, 30, 20, 50, 40};

        BaseForQuickSort base = new BaseForQuickSort();
        base.quickSort(arr, 0, arr.length-1);
        for (int j : arr) {
            System.out.print(" " + j);
        }
    }
}
