package all;

public class Patterns {

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
		}
		
		
		
		
	}

}
