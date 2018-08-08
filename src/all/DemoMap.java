package all;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoMap {
	int age;
	String name;
	int dept;
	DemoMap(int age,String name,int dept){
		this.age=age;
		this.name=name;
		this.dept=dept;
	}
	
	public static void main(String[] args) {
		HashMap<String,String> m=new HashMap<String,String>();
		m.put("Name", "sam");
		m.put("Name1", "roy");
		m.put("Name2", "ram");
		m.put("Name3", "rai");
		m.put("Name4", "rick2");
		m.put("Name4", "rick1");//duplicate key not allowing
		System.out.println("Value of m: "+m);
		System.out.println(m.get("Name"));
		System.out.println(m.get("name"));//null because its not saving the value based on index and no array bound exception will appear.
		//How to iterate the all data in hashmap
		for(Entry hm:m.entrySet()){  //m.entrySet()=this is having all the data
			System.out.println(hm.getKey()+" "+hm.getValue());
		}
		
		Set s=m.entrySet();
		System.out.println(s);
		
		m.remove("Name1");
		System.out.println(m);//Its not maintain the order O/P={Name3=rai, Name4=rick, Name=sam, Name2=ram}
		
		HashMap<Integer,DemoMap> emp=new HashMap<Integer,DemoMap>();
		DemoMap D1=new DemoMap(23,"joy",7484748);
		DemoMap D2=new DemoMap(26,"jbl",83839);
		DemoMap D3=new DemoMap(25,"jack",7575);
		emp.put(1, D1);
		emp.put(2, D2);
		emp.put(2, D3);
		//traverse the hashmap
		for(Entry<Integer,DemoMap> empDetails:emp.entrySet()){//for(Entry<Integer,DemoMap> empDetails:emp.entrySet())
			int key=empDetails.getKey();
			DemoMap D=empDetails.getValue();
			System.out.println("Emp Details: "+key);
			System.out.println(D.age+" "+D.age+" "+D.dept);
		}
		
		
	}

}
