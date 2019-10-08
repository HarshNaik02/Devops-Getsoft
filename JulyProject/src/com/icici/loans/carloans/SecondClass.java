package com.icici.loans.carloans;

public class SecondClass

{
	//Data  -- Properties (variables)
		// Operations --Behaviours--methods
		
		int a=10,b=20,c;
		public void add ()
		{
			c=a+b;
			System.out.println("adition of a&b is : " +c);
		}
		public void sub ()
		{
			c=a-b;
			System.out.println("subtraction of a&b :" +c);
	}
		public static void main(String[] args)
		{
			SecondClass obj=new SecondClass();
			obj.add();
			obj.sub();
			System.out.println(obj.c);
		}
}
