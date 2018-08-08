package all;

/* Below concept is using super key word for method
class parent{
	void m1(){
		System.out.println("Parent of m1");
	}
}
public class superConcept extends parent{
	void m1(){
		System.out.println("superConcept of m1");
	}
	void m2(){
		m1();
		this.m1();
		super.m1();
	}
	public static void main(String[] args) {
		new superConcept().m2();
	}*/

// Below concept is using super key word for contructor

class parent{
parent(){
	System.out.println("cons of parent");
}
}
public class superConcept extends parent{
	superConcept(){
		this(10);
		System.out.println("non parametarized cons");
	}
	superConcept(int a){
		super(); //By default it will call the super class constructor
		System.out.println("parametarized cons");
	}

public static void main(String[] args) {
	new superConcept();
}

}
