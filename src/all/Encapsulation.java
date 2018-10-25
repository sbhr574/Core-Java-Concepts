package all;
class A{
	private int a;
	private String b;
	public void seta(int a){
		this.a=a;
	}
	public void seta(String b){
		this.b=b;
	}
	public int geta(){
		return a;
	}
	public String getb(){
		return b;
	}
}
public class Encapsulation extends A{
	

	public static void main(String[] args) {
	A a1=new A();
	a1.seta(100);
	int as=a1.geta();
	System.out.println(as);
	a1.seta(12);
	System.out.println(a1.geta());

	
	
	
	}

}
