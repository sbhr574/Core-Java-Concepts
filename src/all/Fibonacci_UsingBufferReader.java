/**
 * 
 */
package all;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Subhajit
 *
 */
/**
 * Finding fibonacci odd number between two inputs
 *
 */
public class Fibonacci_UsingBufferReader {

	public static void main(String[] args) {
		int n1=0,n2=1,n3,i,count=18;  
		boolean flag = true;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter lower:");
		int lower = 0;
		try {
			lower = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.print("Enter upper:");
		int upper = 0;
		try {
			upper = Integer.parseInt(br1.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}     
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
//		  System.out.print(" "+n3); 
		  n1=n2;    
		  n2=n3; 
		  if(lower<n3 && n3<upper){
			  if(n3%2==0){
				  
			  }else{
				  System.out.println(n3);
				  flag = false;
			  }
		  }
		 }    
		 if(flag == true){
			 System.out.println("No odd Present");
		 }
	

	}

}
