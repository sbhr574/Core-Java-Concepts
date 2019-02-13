package Oops_Concepts_Examples;

import java.util.Scanner;

public class Patterns {
	int num,i,j,k;
	Scanner user_input;
	Patterns(){
		user_input=new Scanner(System.in);
		System.out.println("Enter number of layer:");
		num=user_input.nextInt();
		m1();
		
	}
	public void m1(){
		for(i=num;i>=1;i--){
			for(k=num;k>i;k--)
				System.out.print(" ");
				for(j=1;j<(i*2);j++)
					System.out.print("*");
				System.out.println();
			
		}
	}
	public static void main(String[] args) {
		int i,j,k;
		/*
		  ****
		  ****
		  ****
		  ****
		 */
		for( i=0;i<4;i++){
			for( j=0;j<4;j++){
				System.out.print("*");
			}System.out.println();
		}System.out.println("---");
		/*
		 *
		 **
		 ***
		 ****
		 *****
		 */
		for(i=0;i<5;i++){
			for(j=0;j<=i;j++){
				System.out.print("*");
			}System.out.println();
		}System.out.println("---");
		/*
		 *****
		 ****
		 ***
		 **
		 *
		 */
		for(i=0;i<5;i++){
			for(j=0;j<5-i;j++){
				System.out.print("*");
			}System.out.println();
		}System.out.println("---");
		/*
		 1234
		 1234
		 1234
		 1234
		 */
	
		/*
		 1234
		 2341
		 3241 
		 4321
		 */
		
		/*
		 1
		 12
		 123
		 1234
		 */
		for(i=1;i<5;i++){
			for(j=1;j<=i;j++){
				System.out.print(j);
			}System.out.println();
		}System.out.println("---");
		/*
		 1234
		 123
		 12
		 1
		 */
		for(i=1;i<5;i++){
			for(j=1;j<=5-i;j++){
				System.out.print(j);
			}System.out.println();
		}System.out.println("---");
		/*
		  ***1
		  **12
		  *123
		  1234
		 */
		for(i=1;i<5;i++){
			for(k=4;k>i;k--){
				System.out.print("*");
			}
			for(j=1;j<=i;j++){
				System.out.print(j);
			}System.out.println();
		}System.out.println("---");
		/*
	     *
	    **
	   ***
	  ****
	 *****
	 */
		for(i=1;i<=5;i++){
			for(j=1;j<=5-i;j++){
				System.out.print(" ");
			}for(k=1;k<=i;k++){
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		 ****
		 ***1
		 **12
		 *123
		 1234
		 */
		for(i=1;i<=5;i++){			
			for(j=1;j<=5-i;j++){
				System.out.print("*");
			}
			for(k=1;k<i;k++){
				System.out.print(k);
			}System.out.println();
		}System.out.println("---");
		/*
		****
		1***
		12**
		123*
		1234 
		 */
		for(i=1;i<=5;i++){
			for(k=1;k<i;k++){
				System.out.print(k);
			}
			for(j=1;j<=5-i;j++){
				System.out.print("*");
			}
			System.out.println();
		}System.out.println("---");
		/*
		 1 
		 2 1 
		 3 2 1 
		 4 3 2 1 
		 5 4 3 2 1
		 */
		for( i=1;i<=5;i++)
		  {
		   for( j=i;j>=1;j--)
		   {
		    System.out.print(j+" ");
		   }
		   System.out.println();
		  }System.out.println("---");
		  /*
		  0 
		  1 2 
		  2 3 4 
		  3 4 5 6 
		  4 5 6 7 8 
		  */
		for(i=0;i<=4;i++){
			 System.out.println();
		     for(j=0;j<=i;j++){
		     System.out.print(i+j+" "); 
		 }
		}System.out.println("\n---");
		 /*
			* 
		   * * 
		  * * * 
		 * * * * 
		* * * * * 
		  */
		for(i=1;i<=5;i++){
			System.out.println();
			for(k=1;k<=5-i;k++){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				System.out.print(" *");
			}
		}System.out.println("\n ---");
		/*
			    *
		      * * *
		    * * * * *
		  * * * * * * *
		* * * * * * * * *
	  */
		for(i=1;i<=5;i++){
			System.out.println();
			for(k=1;k<=5-i;k++){
				System.out.print(" ");
			}
			for(j=1;j<(i*2);j++){
				System.out.print("*");
			}
		}System.out.println("\n ---");
		/*
	         1 
	       2 3 2 
	     3 4 5 4 3 
	   4 5 6 7 6 5 4 
	 5 6 7 8 9 8 7 6 5 
	 */
		
		   int rows = 5, x = 0, count = 0, count1 = 0;

	        for( i = 1; i <= rows; ++i) {
	            for(int space = 1; space <= rows - i; ++space) {
	                System.out.print("  ");
	                ++count;
	            }

	            while(x != 2 * i - 1) {
	                if (count <= rows - 1) {
	                    System.out.print((i + x) + " ");
	                    ++count;
	                }
	                else {
	                    ++count1;
	                    System.out.print((i + x - 2 * count1) + " ");
	                }

	                ++x;
	            }
	            count1 = count = x = 0;

	            System.out.println();
	        }
		/*
		  * * * * *
		   * * * *
		    * * *
		     * *
		      *
		 */
	        //code is written above by inside the method.
		new Patterns().m1();
		
		
		
		
		
	}

}
