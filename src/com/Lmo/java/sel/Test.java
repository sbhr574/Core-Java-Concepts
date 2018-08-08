package com.Lmo.java.sel  ;

interface de
{
	int i=10;
	int j=20;
void add();
void sub();
void mul();
void div();
}
abstract class demo implements de{
	public void add(){
		System.out.println("ami add");
	}
}
public class Test implements de{
	public void sub(){
		System.out.println("sub");
	}
	public void div(){
		System.out.println("div");
	}
	public void mul(){
		System.out.println("mul");
	}
	@Override
	public void add() {
	System.out.println("add");
	}
}
class all implements de{
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


