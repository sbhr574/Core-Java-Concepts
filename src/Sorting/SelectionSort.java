/**
 * 
 */
package Sorting;

import java.util.Arrays;

/**
 * @author Subhajit
 *
 */
public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int ar[] = { 14, 7, 10, 2, 5, 68 };
		
		// Example1
		int val = 0;
		int min = 0;
		for (int i = 0; i < ar.length - 1; i++) { //Outer Loop
			min = i;
			for (int j = i + 1; j < ar.length; j++) { //Inner Loop
				if (ar[j] < ar[min]) { //searching for lowest number 
					min = j;
				}
			}
			val = ar[min]; //Swaping 
			ar[min] = ar[i];
			ar[i] = val;
		}
		System.out.println(Arrays.toString(ar));
		
		
	}

}
