package Oops_Concepts_Examples;


interface BBB{
	void m1();
	void m2();
}
 abstract class AAA implements BBB{
	public void m1(){
		System.out.println("m1");
	}
	public abstract void m2();
//	{
//		System.out.println("m2");
//	}
}

public class test123 extends AAA {

//	public void m1(){
//	System.out.println("m1");
//}
public void m2(){
	System.out.println("m2");
}

	public static void main(String[] args) {

		test123 n1=new test123();
		Character character=Character.valueOf('c');
		System.out.println(character);
		
		
		
}
	}
