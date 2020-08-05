package com;
// import com.transact;
public class loan {
	int cred,deb,total;
	void dotransac(int cred,int deb)
	{
		transact.credit(cred);
		transact.debit(deb);
		System.out.println("Your Balance is : " + transact.total());
	}
	public static void main(String[] args) 
	{
		loan l = new loan();
		int cred = Integer.parseInt(args[0]);
		int deb = Integer.parseInt(args[1]);		
		l.dotransac(cred,deb);
	}

}
