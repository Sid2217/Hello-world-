
import java.util.Scanner;

interface credit
{
	void ViewAmount();
	void ViewPin();
	void ChangePin();
	void UseCard();
	void PayBalance();
}


class regular implements credit
{
	Scanner s = new Scanner(System.in);
	String name;	
	int card,pin,cred=0,maxamt=5000;
	public void getdata()
	{
		System.out.println("Enter Name : ");
		name = s.next();
		System.out.println("Enter Card : ");
		card = s.nextInt();
		System.out.println("Enter Pin : ");
		pin = s.nextInt();
		System.out.println("Enter credit : ");
		cred = s.nextInt();		
		if(cred > maxamt)
		{
			System.out.println("Credit amount exceeds the max amount for your account ");
			System.exit(0);
		}
	}
	public void ViewAmount() {}
	public void ViewPin() {}
	public void ChangePin() 
	{
		System.out.println("Enter Pin : ");
		pin = s.nextInt();
		System.out.println("Pin Changed");
	}
	public void UseCard() 
	{
		System.out.println("Card Used");
	}
	public void PayBalance()
	{
		System.out.println("Balance is : " + cred);
	}
}

class gold implements credit
{
	Scanner s = new Scanner(System.in);
	String name,SpecialPr;	
	int card,pin,cred=0;
	public void getdata()
	{
		System.out.println("Enter Name : ");
		name = s.next();
		System.out.println("Enter Card : ");
		card = s.nextInt();
		System.out.println("Enter Pin : ");
		pin = s.nextInt();
		System.out.println("Enter credit : ");
		cred = s.nextInt();		
	}
	public void ViewAmount() {}
	public void ViewPin() {}
	public void ChangePin() 
	{
		System.out.println("Enter Pin : ");
		pin = s.nextInt();
	}
	public void UseCard() 
	{
		System.out.println("Card Used");
	}
	public void PayBalance()
	{
		System.out.println("Balance is : " + cred);
	}
}
public class Customer implements credit
	{
	Scanner s = new Scanner(System.in);
	String name;	
	int card,pin,cred=0,n1,n2,n;
	regular r[];
	gold g[];
		public static void main(String[] args) 
		{
			Customer ct = new Customer();
			ct.getdata();
			ct.setdata();
		}
		public void getdata()
		{
			System.out.println("Enter Choice : ");
			System.out.println("How many regular card holders : ");
			n1 = s.nextInt();
			System.out.println("How many gold card holders : ");
			n2 = s.nextInt();
			r = new regular[n1];
			g = new gold[n2];
		}
		public void setdata()
		{
			for(int i=0;i<n1;i++)
			{
				r[i] = new regular();
				r[i].getdata();
				do
				{	
					System.out.println("Enter Your Choice");
					System.out.println("1 : Use Card ");
					System.out.println("2 : Pay Balance");
					System.out.println("3 : Change Pin");
					System.out.println("4 : Exit");
					n = s.nextInt();
					switch(n)
					{
						case 1 : r[i].UseCard();
									break;
						case 2 : r[i].PayBalance();
									break;
						case 3 : r[i].ChangePin();
									break;
						
					}
				}while(n!=4);
			}
			for(int i=0;i<n2;i++)
			{
				g[i] = new gold();
				g[i].getdata();
				do
				{	
					System.out.println("Enter Your Choice");
					System.out.println("1 : Use Card ");
					System.out.println("2 : Pay Balance");
					System.out.println("3 : Change Pin");
					System.out.println("4 : Exit");
					n = s.nextInt();
					switch(n)
					{
						case 1 : g[i].UseCard();
									break;
						case 2 : g[i].PayBalance();
									break;
						case 3 : g[i].ChangePin();
									break;
						
					}
				}while(n!=4);
			}
		}
		public void ViewAmount() {}
		public void ViewPin() {}
		public void ChangePin() {}
		public void UseCard() {}
		public void PayBalance() {}
}
