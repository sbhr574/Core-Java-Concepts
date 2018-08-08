package all;
public class ConceptofConstractor {
	int a =100;
	int m1(){
		System.out.println("m1 method");
		return a;
	}
	ConceptofConstractor(){
		System.out.println("Parametarized cons");
	}
	ConceptofConstractor(int a){
		
	}

public static void main(String arg[])  {

	ConceptofConstractor in=new ConceptofConstractor();
	int t=new ConceptofConstractor().m1();
}
}
