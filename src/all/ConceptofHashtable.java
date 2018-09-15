package all;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class ConceptofHashtable {

	public static void main(String[] args) {
		Hashtable ht1=new Hashtable();
		ht1.put(1, "Tom");
		ht1.put(2, "sam");
		ht1.put(3, "ram");
		ht1.put(4, "dom");
		ht1.put(5, "java");
		//No null key and value,it will give null pointer exception
//		ht1.put(null, "");
//		ht1.put(7, null);
		ht1.put(5, "java"); //Contains unique value
		System.out.println(ht1);
		//Creating clone of ht1 
		Hashtable ht2=new Hashtable();
		ht2=(Hashtable) ht1.clone();
		System.out.println(ht2);
		
		ht1.clear();
		System.out.println(ht1);
		System.out.println(ht2);
		/* O/P==
		{5=java, 4=dom, 3=ram, 2=sam, 1=Tom}
		{5=java, 4=dom, 3=ram, 2=sam, 1=Tom}
		{}
		{5=java, 4=dom, 3=ram, 2=sam, 1=Tom}*/
		//How to print the hashtable data using enumeration
		Enumeration e=ht2.elements();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
		//How to print the hashtable data using entrySet
		Set s=ht2.entrySet();
		System.out.println(s);
		Hashtable ht3=new Hashtable();
		ht3.put(1, "Tom");
		ht3.put(2, "sam");
		ht3.put(3, "ram");
		ht3.put(4, "dom");
		ht3.put(5, "java");
		
		//To check both hashtable are equal or not
		if(ht3.equals(ht2))
			System.out.println("Both are equAL");
		//To get the value using key
		System.out.println(ht3.get(2)); //sam
		//To print the hashcode value
		System.out.println(ht3.hashCode()); //3665050
		System.out.println(ht1.hashCode()); //0
		System.out.println(ht2.hashCode()); //3665050
	}

}
