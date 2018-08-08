package Static;

public class Static {
	void m1(){
		m2();
		System.out.println("normal method");
	}
	static void m2(){
		
		System.out.println("static method");
	}
public static void main(String[] args) {
int i=5000;
int j=3000;
int pin=4321;
if (pin==4321){
	if(i>=j){
	int k=i-j;
	System.out.println("true new value"+k);
}
else{
	System.out.println("try later");
}
}
	else {
		System.out.println("pin invalid");
	}
}
	}


