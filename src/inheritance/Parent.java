package inheritance;

class child{
	void m1(){
		this.m2();
	System.out.println("child m1");}
	static void m2(){
	System.out.println("static child m2");
	}
}

	public class Parent  extends child{
		int a=10;
		String g="Roy";
		int b=20;
		static int c=30;
		static int d=40;
		{		
		System.out.println("nonstatic block");}
		static{System.out.println("static block");
		}
		void disp(){
			int a=100;
			int b=200;
			System.out.println(a+b);
			System.out.println(this.a+this.b);
		 	}
			void m1(){
				this.m2();
			}
	public static void main(String[] args){
		new Parent().m1();
	}

}
