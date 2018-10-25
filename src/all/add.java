package all;
interface aaa{
	void m1();
	void m2();
	int a=100;
}
abstract class abc implements aaa{
	public void m2(){
		System.out.println("naja");
	}
	
//	{
//		System.out.println("jsjsj");
//	}
}
public class add extends abc {
	
	public void m1(){
		System.out.println("from add");
	}
	void m3(){
		System.out.println("ami from add");
	}
	public void m2(){
		System.out.println("yeyeyeyeyey");
	}
	
	
	public static void main(String[] args) {

		add a1=new add();
		a1.m1();
		a1.m3();
		a1.m2();
		abc ab1=new add();
		ab1.m1();
		ab1.m2();
}
}
