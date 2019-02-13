package Oops_Concepts_Examples;

import java.util.ArrayList;
import java.util.Vector;

public class ListPractice  {
	

	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		ar.add(12);
		ar.add(1, 14);
		ar.add(16);
		
		ArrayList ar1=new ArrayList();
		ar1.addAll(ar);
		for(int i=0;i<ar1.size();i++){
			System.out.println(ar1.get(i));
		}
		
		
		Vector v=new Vector(10,6);
		v.add("ram");
		v.add("sam");
		v.add("jam");
		for(int i=0;i<v.size();i++){
			System.out.println(v.get(i));
		}
		System.out.println(v.capacity());
		
		
	}

}
