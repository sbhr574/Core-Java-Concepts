package swtich;

public class test {
	static int n1=0,n2=1,n3;    
	 static void printFibonacci(int q){    
	    if(q>0){    
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	         System.out.print(" "+n3);   
	         printFibonacci(q-1);    
	     }    
	 }    
	 public static void main(String args[]){    
	  //int r=10;    
	  System.out.print(n1+" "+n2);//printing 0 and 1    
	  printFibonacci(10);//n-2 because 2 numbers are already printed   
}
	}
