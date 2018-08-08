package all;

class test{
	void game(){
		System.out.println("football");
	}
	void video(){
		System.out.println("game");
	}
}
class test1 extends test{
	void video(){
		System.out.println("game of test1");
	}
}
public class polymorphism extends test1{
	void game(){
		System.out.println("Volly");
	}
	void Badminton(){
		System.out.println("This is also game");
	}
	
	
	
	public static void main(String[] args) {
		test t;
		test poly;
		test t1;
		t=new test();
		t.game(); //football
		new polymorphism().game(); //Volly
		poly=new polymorphism(); //Upcasting, Polymorphism, overridding, late binding
		poly.game();//Volly
		poly.video(); //game
		new polymorphism().Badminton(); //This is also game
//		polymorphism pol=(polymorphism) new test();//downcasting
//		pol.Badminton();
//		pol.game();
		t1=new test1();
		t1.game();
		t1.video();
		 
		
		
	}

}
