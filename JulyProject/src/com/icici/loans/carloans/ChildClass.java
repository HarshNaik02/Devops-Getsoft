package com.icici.loans.carloans;

public class ChildClass extends FistAbstract 
{

	public static void main(String[] args) 
	
	{
		ChildClass c=new ChildClass ();
		c.m1();
		c.m2();
	}

	@Override
	public void m2()
	{
		System.out.println("I am overridden m2 from childClass");
		
	}
	public void m1()
	{
		System.out.println("i am overridden m1 from ChildClass");
	}
}
