package Oops_Concepts_Examples;

public class WrapperC {

	public static void main(String[] args) {
		Integer i =  new Integer(100);
		System.out.println(i);
		Integer i1 =  new Integer("100");
		System.out.println(i1);
		Integer i2 =  new Integer("one");
			System.out.println(i2);
	
		//Object class toString()         o/p=classname@hashcode
		WrapperC t= new WrapperC();
		System.out.println(t);
		System.out.println(t.toString());
		
		Integer i3= new Integer(100);
		System.out.println(i3.toString());

	}

}
