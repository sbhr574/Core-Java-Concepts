/**
 * 
 */
package String_Manipulation;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Subhajit
 *
 */
public class RevovingDuplicates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		String string = "aabbccdefatafaz";

    	char[] chars = string.toCharArray();
    	Set<Character> charSet = new LinkedHashSet<Character>();
    	for (char c : chars) {
    	    charSet.add(c);
    	}

    	StringBuilder sb = new StringBuilder();
    	for (Character character : charSet) {
    	    sb.append(character);
    	}
    	System.out.println(sb.toString());
    	
    	// OR
    	
    	Set<Character> set=new LinkedHashSet<Character>();
    	for(char c:string.toCharArray())
    	{
        set.add(Character.valueOf(c));
    	}
		
	}

}
