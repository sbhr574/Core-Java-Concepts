package all;

public class ProjectlevelArrays {
	int eid;
	String ename;
	int age;
	
	ProjectlevelArrays(int eid,String ename,int age){
		this.eid = eid;
		this.ename = ename;
		this.age = age;
		
	}
//	public String toString(){
//		return "eid="+eid +" ename= " +ename;
//	}
//
//	class Object{
//		public String toString(){
//			return "class-@hashcode";
//		}
//	}
//	class String extends Object{
//		public String toString(){
//			return "content of tostring";
//		}
//	}
//	class StringBuffer extends Object{
//		public String toString(){
//			return "returnValue";
//		}
//	}
	public static void main(String[] args) {
	
		ProjectlevelArrays e1 = new ProjectlevelArrays(1,"sam",21);
		ProjectlevelArrays e2 = new ProjectlevelArrays(2,"sam1",22);
		ProjectlevelArrays e3 = new ProjectlevelArrays(3,"sam2",23);
		
		System.out.println(e1);
		System.out.println(e1.toString());
	
		
	
		

	}

}
