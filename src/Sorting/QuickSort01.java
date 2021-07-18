/**
 * 
 */
package Sorting;

import java.util.Arrays;

/**
 * @author Subhajit
 *
 */
public class QuickSort01 {

	/**
	 * @param args
	 */
	
	public static int partition(int[] array, int left, int right) {
        int pivot = array[left]; // taking first element as pivot

        while (left <= right) {
            //searching number which is greater than pivot, bottom up
            while (array[left] < pivot) {
                left++;
            }
            //searching number which is less than pivot, top down
            while (array[right] > pivot) {
                right--;
            }

            // swap the values
            if (left <= right) {
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;

                //increment left index and decrement right index
                left++;
                right--;
            }
        }
        return left;
    }
	
	public static void recursiveQuickSort(int[] array, int startIdx, int endIdx) {

		int idx = partition(array, startIdx, endIdx);

		// Recursively call quicksort with left part of the partitioned array
		if (startIdx < idx - 1) {
			recursiveQuickSort(array, startIdx, idx - 1);
		}

		// Recursively call quick sort with right part of the partitioned array
		if (endIdx > idx) {
			recursiveQuickSort(array, idx, endIdx);
		}
	}
	
	public static void main(String[] args) {
//		int ar[] = {35,50,13,45,70,67,90,41};
		int ar[] = { 11, 14, 16, 12, 11, 15};
		recursiveQuickSort(ar, 0, ar.length-1);
		System.out.println("Final result :: "+Arrays.toString(ar));

	}

}
