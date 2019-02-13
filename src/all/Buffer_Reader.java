/**
 * 
 */
package all;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer_Reader {

	
	public static void main(String[] args) {
		int i=0;  
		int a;
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter The value of i and a:-");
		 try {
			 i = Integer.parseInt(br.readLine());
			 a = Integer.parseInt(br1.readLine());
			 System.out.println("Value of a is:"+a);
		} catch (IOException e) {
			e.printStackTrace();
		}
		 System.out.println("Value of i is:"+i);
		 /*Below line will give exception because a value is not assigne and out side of 
		 try block we cant print the value. */
		 //System.out.println("Value of a is:"+a);
		

	}

}
