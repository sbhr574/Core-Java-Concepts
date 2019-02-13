package Oops_Concepts_Examples;
public class ConceptofConstractor {
	int a =100;
	int b;
	int m1(){
		System.out.println("m1 method");
		return b;
	}
	ConceptofConstractor(){
		this.m1();          //This is the use of "this" keyword.During object creation it will call the method
		System.out.println("Parametarized cons");
	}
	ConceptofConstractor(int c){ //Non Parametarized
//		this.a=a;
		System.out.println(a);
		System.out.println("ndjdj");
	}

public static void main(String arg[])  {

	ConceptofConstractor in=new ConceptofConstractor();
	int t=new ConceptofConstractor().m1();
}
}
