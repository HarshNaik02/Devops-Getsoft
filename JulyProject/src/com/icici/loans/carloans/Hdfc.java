package com.icici.loans.carloans;

public class Hdfc implements Rbi

{
public static void main(String[] args)
	{
		Hdfc i=new Hdfc ();
		i.deposit();
		i.withdrawl();
	}

	@Override
	public void withdrawl()
	{
		System.out.println("I am withdrawing from HDFC");
		
	}

	@Override
	public void deposit() 
	{
		System.out.println("I am depositing in HDFC");
		
	}

}
