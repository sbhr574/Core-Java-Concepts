package all;

import java.util.LinkedList;
import java.util.ListIterator;

public class test123 {


	public static void main(String[] args) {
	int i,j,k;
	LinkedList l=new LinkedList();
	l.add(12);
	l.add(23);
	l.add(121);
	l.add(32);
	l.add(345);
	l.remove(2);
	l.add(null);
	ListIterator<Integer> it=l.listIterator();
	while(it.hasNext()){
		Integer i1=(Integer)it.next();
		System.out.println(i1);
	}
	while(it.hasPrevious()){
		System.out.println(it.previous());
	}

}
}
