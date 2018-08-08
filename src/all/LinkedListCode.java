package all;

import java.util.Iterator;
import java.util.LinkedList;

//abstrac class with inner class

	
public class LinkedListCode {
	int age;
	String name;
	LinkedListCode(int age,String name){
		this.age=age;
		this.name=name;
	}
	//*** toString override because it will help to print the actual data otherwise it will print as a hashcode ***
	
	public String toString(){
		return age + " " +name;
	}
	
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(12);
		l.add(23);
		l.add(121);
		l.add(32);
		l.add(345);
		l.remove(2);
		l.add(null);
		//Below methods are for implement stack and queues in LinkedList
		l.addFirst("first");
		l.addLast("last");
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.removeFirst());
		System.out.println(l.removeLast());
		
		LinkedList l1=new LinkedList();
		l1.addAll(l);
		for(int i=0;i<l1.size();i++){
			System.out.println(l1.get(i));
		}
		LinkedListCode d=new LinkedListCode(12,"RAM");
		LinkedListCode d1=new LinkedListCode(13,"sam");
		LinkedListCode d2=new LinkedListCode(14,"jam");
		LinkedList<LinkedListCode> l2=new LinkedList<LinkedListCode>();
		l2.add(d);
		l2.add(d1);
		l2.add(d2);
		
		//To print the data there are four types of ways
		for(int i=0;i<l2.size();i++){
			System.out.println(l2.get(i).toString());
		}
//		Iterator it=l2.iterator();
//		while(it.hasNext()){
//			Integer I=(Integer)it.next();
//			System.out.println(I);
//		}
//		for(dog str : l2){
//			System.out.println(str);
//		}
//		int num=0;
//		while(l2.size()>num){
//			System.out.println(l2.get(num));
//			num++;
//		}
		
	}

}
