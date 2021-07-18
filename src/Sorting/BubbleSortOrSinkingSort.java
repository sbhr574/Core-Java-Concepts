/**
 * 
 */
package Sorting;

import java.util.Arrays;

/**
 * @author Subhajit
 *
 */
public class BubbleSortOrSinkingSort {
	
	
	
	public static void main(String args[]) {
		
		int ar[] = {12,7,3,19,2};
		System.out.println(ar.length);
		int temp=0;
		int count =0;
		for(int i=0;i<ar.length-1;i++) {
//			if(ar[2]==7) {
//				System.out.println(Arrays.toString(ar));
//				break;
//			}else {
//				count++;
//			}
			count++;
			int flag = 0;
			for(int j=0;j<ar.length-i-1;j++) {
				if(ar[j]>ar[j+1]) {
					temp = ar[j+1];  
                    ar[j+1] = ar[j];  
                    ar[j] = temp;
                    flag = 1;
				}
			}
			// If array is already sorted below logic will break the outer loop
			if(flag==0) {
				break;
			}
		}
		System.out.println(count);
		System.out.println(Arrays.toString(ar));
		
	}

}
