package ConceptsOfAbstract  ;

		interface demo1
		{
			int i=10;
			int j=20;
				void add();
				void sub();
				void mul();
				void div();
		}
		abstract class demo implements demo1{
			public void add(){
				System.out.println("From add method");
			}
		}
		public class Test implements demo1{
			public void sub(){
				System.out.println("From sub method");
			}
			public void div(){
				System.out.println("div");
			}
			public void mul(){
				System.out.println("mul");
			}
			@Override
			public void add() {
			System.out.println("From add method");
			}
		}
		class all implements demo1{
			public void add(){}
			public void sub(){}
			public void mul(){}
			public void div(){}
		}
		//public class Test extends all{
		//	int i=200;
		//	int j=300;
		//	public void add(){
		//		int k=i+j;
		//		System.out.println("add\n"+k);}
		//	}
		
		
