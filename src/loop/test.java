package loop;
abstract class D{
	{
		System.out.println("instance");
	}
	static{
		System.out.println("static");
	}
	D(){
		System.out.println("cons");
	}
	//abstract void m1();
}

public class test extends D {
	void m1(){
		System.out.println("ami akhane");
	}test(){
		//super();
		System.out.println("test");
	}
	public static void main(String[] args) {
//		for(int i=1;i<=3;i++){
//			for(int j=0;j<=i;j++){
//				System.out.print("#");
//			}
//			System.out.println("");
//		}
		
new test().m1();

	

}}
