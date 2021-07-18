/**
 * 
 */
package Sorting;

import java.util.Arrays;

/**
 * @author Subhajit
 *
 */
public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int ar[] = {40,20,60,10,50,70};
		for(int i=1;i<ar.length;i++) {
			int key = ar[i];
			int j = i-1;
			while(j>=0 && ar[j]>key) {
				ar[j+1]=ar[j];
				j = j-1; // OR j--
			}
			ar[j+1]=key;
			System.out.println(Arrays.toString(ar));
		}
		System.out.println(Arrays.toString(ar));
	}

}
