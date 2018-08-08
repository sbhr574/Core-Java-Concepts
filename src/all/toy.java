package all;

import java.util.ArrayList;
	
public class toy {

	public static void main(String[] args) throws ClassNotFoundException  {
		ArrayList ar=new ArrayList();
		ArrayList ar1=new ArrayList();
		ar1.add(2455);
		ar.add("are");
		ar.add('r');
		ar.add(2);
		ar.add( 1,3);
		ar.addAll(1, ar1);
		ar1.addAll(ar);
		ar1.remove(2);
		System.out.println(ar.add(34.09));
		for(int i=0;i<ar1.size();i++){
			System.out.println(ar1.get(i));
		}
		toy t=new toy();
		Object[] obj=new Object[1000];
		obj[0]=new toy();
		
	}

}
