package all;

import java.util.Vector;

public class VectorPractice
{
	public static void main(String arg[]){
		
		//example 1: of vector contructor 
		Vector v1=new Vector();
		System.out.println(v1.capacity()); //By defualt it is allways having 10 capacity
		for(int i =0;i<10;i++){
			v1.addElement(i);
		}
		System.out.println(v1.capacity());
		v1.add(12);                               //This method is from collection
		v1.add(2, "new");                         //this is from List
		v1.addElement(23);                        //this is from vector
		System.out.println(v1.capacity());
		System.out.println(v1);
		
		//example 2: of vector contructor
		Vector v2=new Vector(25);                //Vector v2=new Vector(int initialcapacity)
		System.out.println(v2.capacity()); 
		for(int i =0;i<10;i++){
			v2.addElement(i);
		}
		System.out.println(v2.capacity());
		v2.addElement(23);
		System.out.println(v2.capacity());
		System.out.println(v2);
		
		//example 3: of vector contructor
				Vector v3=new Vector(10,5);                    //1st it will add 10 data after that it will increase till 5
				System.out.println(v3.capacity()); //10
				for(int i =0;i<10;i++){
					v3.addElement(i);
				}
				System.out.println(v3.capacity());//10
				v3.addElement("last");
				System.out.println(v3.capacity());//15
				System.out.println(v3);
				Vector v4=new Vector(10,5);
				v3.remove(v4);
				System.out.println(v4.capacity());
				
	}
}
