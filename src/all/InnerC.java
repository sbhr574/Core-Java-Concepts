package all;


 class InnerC{
		 ToString t=new ToString(){
				public  void m1(){
					System.out.println("i am not interface object");
					System.out.println(t.getClass().getName());
				}
			};
public static void main(String arg[]){
	InnerC b=new InnerC();
	b.t.m1();
	
}
}