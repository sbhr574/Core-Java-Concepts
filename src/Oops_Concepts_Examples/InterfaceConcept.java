/**
 * 
 */
package Oops_Concepts_Examples;

/**
 * @author Subhajit
 *
 */

interface testab{
	void m1();
	void m2();
	String m3();
}

interface test12 extends testab{
	void m4();
}

// One Interface can extends multiple interface at a time
interface test2 extends testab,test12{
	void m5();
}

// if all methods are not implemented then that class will be abstract class
 abstract class test_ab implements testab{
	@Override
	public void m1() {
		System.out.println("From m1");
		
	}

	@Override
	public void m2() {
		System.out.println("From m2");
		
	}
}
 
 // One class can implement multiple interface
class gtest implements testab,test12{

	@Override
	public void m4() {
		
	}

	@Override
	public void m1() {
		
	}

	@Override
	public void m2() {
		
	}

	@Override
	public String m3() {
		return null;
	}
	 
 }

public class InterfaceConcept extends test_ab implements testab {

	@Override
	public void m1() {
		System.out.println("From m1");
		
	}

	@Override
	public void m2() {
		System.out.println("From m2");
		
	}
	
	@Override
	public String m3() {
		return "test";
	}
	
	public static void main(String[] args) {
		testab nd = new InterfaceConcept();
		nd.m1();
		InterfaceConcept nd2 = new InterfaceConcept();
		nd2.m1();
	}



}
