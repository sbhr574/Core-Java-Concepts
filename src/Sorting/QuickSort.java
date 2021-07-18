/**
 * 
 */
package Sorting;

import java.util.Arrays;

/**
 * @author Subhajit
 *
 */
public class QuickSort {

	/**
	 * @param args
	 */
	
	
	public static int partition(int ar1[], int lb, int ub) {
		int pivot = ar1[lb];
		int start = lb;
		int end = ub ;
		while(start<end) {
			while(ar1[start]<=pivot) {
				if(start==ub) 
				     break;
				start++;
			}
			while(ar1[end]>pivot) {
				if(end==lb) 
				     break;
				end--;
			}
			if(start<=end) {
				int k = ar1[start];
				ar1[start] = ar1[end];
				ar1[end] = k;
				System.out.println("Arrange "+Arrays.toString(ar1));
			}
		}
//		int d = ar1[end];
//		ar1[end] = pivot;
//		ar1[lb] = d;
		
		int d = ar1[lb];
		ar1[lb] = ar1[end];
		ar1[end] = d;

		System.out.println(Arrays.toString(ar1));
		return end;
	}
	
	static void quicksort(int a[], int lb, int ub) {
		
		if (lb < ub) {
			int val = partition(a, lb, ub);
			quicksort(a, lb, val-1);
			quicksort(a, val+1, ub);
		}
	
		
		System.out.println("quick "+Arrays.toString(a));
	}
	
	
	public static void main(String[] args) {

//		int ar[] = {35,50,13,45,70,67,90,41};
		int ar[] = {7,6,10,5,9,2,1,15,7};
		quicksort(ar, 0, ar.length-1);
		System.out.println("Final result :: "+Arrays.toString(ar));
		
	}

}
