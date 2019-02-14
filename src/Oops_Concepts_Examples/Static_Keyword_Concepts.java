package Oops_Concepts_Examples;
/*
 * 	Static keyword concept with overridding concepts
 */
 class Parent11{
	static int a=12;
	static void run(){
		System.out.println("run() from Parent11 ");
	}
	}
	class Child extends Parent11{
		static int a=20;
		int b=100;
		static void run(){
			System.out.println("run() from Parent11 Child");
		}
	
	public static void main(String[] args) {
		Parent11 p1=new Child();
		// As per overriding rules this should call to class Child static  
        // overridden method. Since static method can not be overridden, it  
        // calls Parent's m1() 
		System.out.println(p1.a);//12
		p1.run();//run() from Parent11
		Child c2 = new Child();
		System.out.println(c2.a);//20
		c2.run();//run() from Parent11 Child
		
		
}
	}
