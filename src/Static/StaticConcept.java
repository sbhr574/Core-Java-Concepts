/**
 * 
 */
package Static;

/**
 * @author Subhajit
 *
 */
class run{
	int a = 10;
	static int b = 20;
	void v1(){
		System.out.println("no static");
	}
	static void v2(){
		System.out.println("static method");
	}
}
public class StaticConcept extends run{
	int a = 30;
	static int b = 40;
	void v1(){
		System.out.println("no static from static");
	}
	static void v2(){
		System.out.println("static method from static");
	}
	public static void main(String[] args) {
		
		run rr=new run();
		rr.v1();
		rr.v2();
		System.out.println(rr.a);
		System.out.println(rr.b);
		StaticConcept s2=new StaticConcept();
		s2.v1();
		s2.v2();
		System.out.println(s2.a);
		System.out.println(s2.b);
		run r3=new StaticConcept();
		r3.v1();
		r3.v2();
		System.out.println(r3.a);
		System.out.println(r3.b);
		
	}

}
