package Array_Collections;

import java.util.HashSet;
import java.util.Set;


public class Element_Appears_olnyOnce {

	public static long startTime = System.nanoTime();
	   static int singleNumber(int a[]) 
	    { 
		   //HashSet will not allow duplicate value
	        Set<Integer> s = new HashSet<Integer>(); 
	        for (int i : a) 
	        { 
	            s.add(i); 
	        } 
	  
	        int arr_sum = 0;//sum of array 
	        for (int i : a)  
	        { 
	            arr_sum += i; 
	        } 
	  
	        int set_sum = 0;//sum of set 
	        for (int i : s)  
	        { 
	            set_sum += i; 
	        } 
	  
	        //This formula will help to findout the actual value from an array 
	        return (3 * set_sum - arr_sum) / 2; 
	  
	    } 
	   public static void main(String[] args) {
			int a[] = {12, 12,12,3,7,7,7,9,9,9};  
	        System.out.println("The element with single " +  
	                        "occurrence is " + singleNumber(a)); 
	        long startTime = System.nanoTime();
	        long endTime   = System.nanoTime();
	        long totalTime = endTime - startTime;
	        System.out.println(totalTime);
		}
}
