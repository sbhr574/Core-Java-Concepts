/**
 * 
 */
package String_Manipulation;

import java.util.Scanner;

/**
 * WAP to enter a sentence and replace upper case alphabets to Lower case and vice versa
 * @author Subhajit
 *
 */
public class upperCase_toLowerCase_viceVersa {
	
	 public static void main(String[] args) 
	    { 
	    	Scanner in=new Scanner(System.in);
	        String s1="",s2 = "";
	        int len;
	        int count = 0,number=0;
	        char ch1,ch2;
	        System.out.println("Enter a sentence");
	        s1=in.nextLine();
	        in.close();
	        len = s1.length();
	      for(int i= 0;i<len;i++){
	    	  ch1=s1.charAt(i);
	    	  
	    	  if(ch1!=' '){
	    		  if(Character.isUpperCase(ch1)){
	    			  s2 = String.valueOf(Character.toLowerCase(ch1));
	    			  System.out.print(s2);
	    		  }else{
	    		    s2 	= String.valueOf(Character.toUpperCase(ch1));
	    		    System.out.print(s2);
	        	  }
	    	  }else{
	    		  System.out.print(' ');
	    	  }
	    	  
	      }
	    	

	    }   
}
