/**
 * 
 */
package String_Manipulation;

/**
 * @author Subhajit
 *
 */
public class BasicString {

	// static method
	public static int mul(){
		return 3*2;
		} 
	
	public static void main(String[] args) {

		// Static method that can be accessed without instantiation 
        System.out.println("Your abstract no is : " + BasicString.mul());
        String str3="My name is Roy";
		String str4[]=str3.split(" ");
			for(int i=0;i<str4.length;i++)
			{
				System.out.print(str4[i]);
				String date = "28/02/2019";
				String year = date.substring(6);
				String month = date.substring(3, 5);
				String day = date.substring(0, 2);
				System.out.println(year);
				System.out.println(month);
				System.out.println(day);
				String st = "February 2019";
				System.out.println(st.substring(9));
		
			}

 }
}