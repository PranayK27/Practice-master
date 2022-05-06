package Prerparation;

/**
 * Here we have a stream instead of whole array and we are allowed to store only k elements.
 *
 * A Simple Solution is to keep an array of size k. The idea is to keep the array sorted so that the k’th largest element can be found in O(1) time (we just need to return first element of array if array is sorted in increasing order)
 * How to process a new element of stream?
 * For every new element in stream, check if the new element is smaller than current k’th largest element. If yes, then ignore it. If no, then remove the smallest element from array and insert new element in sorted order. Time complexity of processing a new element is O(k).
 *
 * A Better Solution is to use a Self Balancing Binary Search Tree of size k. The k’th largest element can be found in O(Logk) time.
 * How to process a new element of stream?
 * For every new element in stream, check if the new element is smaller than current k’th largest element. If yes, then ignore it. If no, then remove the smallest element from the tree and insert new element. Time complexity of processing a new element is O(Logk).
 *
 * An Efficient Solution is to use Min Heap of size k to store k largest elements of stream. The k’th largest element is always at root and can be found in O(1) time.
 * How to process a new element of stream?
 * Compare the new element with root of heap. If new element is smaller, then ignore it. Otherwise replace root with new element and call heapify for the root of modified heap. Time complexity of finding the k’th largest element is O(Logk).
 */

// Java program for the above approach
import java.util.*;

class KthElementInNumberStream {

    /*
    using min heap DS

    how data are stored in min Heap DS
            1
        2 3
    if k==3 , then top element of heap
    itself the kth largest largest element

    */
    static PriorityQueue<Integer> min;
    static int k;

    static List<Integer> getAllKthNumber(int[] arr)
    {

        // list to store kth largest number
        List<Integer> list = new ArrayList<>();

        // one by one adding values to the min heap
        for (int val : arr) {

            // if the heap size is less than k , we add to
            // the heap
            if (min.size() < k)
                min.add(val);

	/*
	otherwise ,
	first we compare the current value with the
	min heap TOP value

	if TOP val > current element , no need to
	remove TOP , bocause it will be the largest kth
	element anyhow

	else we need to update the kth largest element
	by removing the top lowest element
	*/

            else {
                if (val > min.peek()) {
                    min.poll();
                    min.add(val);
                }
            }

            // if heap size >=k we add
            // kth largest element
            // otherwise -1

            if (min.size() >= k)
                list.add(min.peek());
            else
                list.add(-1);
        }
        return list;
    }

    // Driver Code
    public static void main(String[] args)
    {
        min = new PriorityQueue<>();

        k = 4;

        int[] arr = { 1, 2, 3, 4, 5, 6 };

        List<Integer> res = getAllKthNumber(arr);

        for (int x : res)
           System.out.print(x + " ");
    }
}

