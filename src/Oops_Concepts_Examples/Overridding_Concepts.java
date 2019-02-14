package Oops_Concepts_Examples;

class Parent12 { 
	// We can use Static block inside the abstract class 
	{
		System.out.println("Static block inside the abstract class");
	}
	public void m2(){
		System.out.println("m2 method from abc class");
	}
	// Static method in base class which will be hidden in subclass
	static void m3() { 
		System.out.println("From parent static m1()");
		}
}
public class Overridding_Concepts extends Parent12 {
	
	public void m1(){
		System.out.println("m1 method from add class");
	}
	void m4(){
		System.out.println("m4 method from add class");
	}
	@Override
	public void m2(){
		System.out.println("Overridding the m2 method");
	}
	   // This method hides m1() in Parent 
   static void m3() { 
   	System.out.println("From child static m1()");
   	}
	
	public static void main(String[] args) {

		Overridding_Concepts a1 = new Overridding_Concepts();
		a1.m1();
		a1.m4();
		a1.m2();
		Parent12 ab1 = new Overridding_Concepts();
		ab1.m2();
		ab1.m3();
}
}

	
