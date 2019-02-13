package Oops_Concepts_Examples;

public class Final_Finally_Finalize {

	 static void B() 
	    { 
	        try { 
	            System.out.println("inside B"); 
	            return; 
	        } 
	        finally
	        { 
	            System.out.println("B's finally"); 
	        } 
	    } 
	 
	public static void main(String[] args) {
		
		//Example of Finally(Its a block)
		
		new Final_Finally_Finalize().B();
		   int k = 55; 
	       try { 
	           System.out.println("In try block"); 
	           int z = k / 55; 
	       } 
	 
	       catch (ArithmeticException e) { 
	           System.out.println("In catch block"); 
	           System.out.println("Dividing by zero but caught"); 
	       } 
	 
	       finally
	       { 
	           System.out.println("Executes whether exception occurs or not"); 
	       }
	       
	     //Example of Finalize(Its a Method)   
/*It is a method that the Garbage Collector always calls just before 
	       the deletion/destroying the object which is eligible for Garbage Collection, so as to perform clean-up activity
	       or
	       Finalize is used to perform clean up processing just before object is garbage collected.*/
	       

	        String s = new String("RR"); 
	        s = null; 
	  
	        // Requesting JVM to call Garbage Collector method 
	        System.gc(); 
	        System.out.println("Main Completes"); 
	    } 
	  
	    // Here overriding finalize method 
	    public void finalize() 
	    { 
	        System.out.println("finalize method overriden"); 
	    }

	}


