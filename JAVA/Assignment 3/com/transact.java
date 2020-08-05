package com;

public class transact 
{
	static int cred,deb;
	static void credit(int credt)
	{
		cred = credt;
	}
	static void debit(int debt)
	{
		deb = debt;
	}
	static int total()
	{
		int total = cred-deb;
		return total;
	}
}
