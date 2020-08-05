import java.util.*;

class vehicle
{
	public vehicle()
	{
		System.out.println("Inside Vehicle");
	}
}
class transport extends vehicle
{
	Scanner s = new Scanner(System.in);
	int vn,sd,pd;
	public void getdata()
	{
		System.out.println("Enter Validity No : ");		
		vn = s.nextInt();
		System.out.println("Enter Start Date : ");		
		sd = s.nextInt();
		System.out.println("Enter Period : ")	;	
		pd = s.nextInt();
	}
	void display()
	{
		System.out.println("Validity No : " + vn);		
		System.out.println("Start Date : " + sd)	;	
		System.out.println("Period : " + pd)	;			
	}
}

class privatev extends vehicle
{
	Scanner s = new Scanner(System.in);
	String on,oa;
	public void getdata()
	{
		System.out.println("Enter Owner Name : ");		
		on = s.next();
		System.out.println("Enter Owner Address : ");		
		oa = s.next();
	}
	void display()
	{
		System.out.println("Owner Name : " + on);		
		System.out.println("Owner Address : " + oa);	
	}
}


public class A1 
{
	public static void main(String args[])throws Exception
	{
		Scanner s = new Scanner(System.in);
		int n=0,l1=0,l2=0;
		System.out.println("How Many Vehicles? : ");		
		int v = s.nextInt();
		privatev p[] = new privatev[v];
		transport t[] = new transport[v];
		for(int i=0;i<v;i++)
		{
		System.out.println("Enter Choice : ");		
		System.out.println("1 : Private  : ");		
		System.out.println("2 : Transport : ");		
		n = s.nextInt();
			switch(n)
			{
				case 1 : 	p[l1] = new privatev();
						p[l1].getdata();
						l1+=1;
						break;
				case 2 : 	t[l2] = new transport();	
						t[l2].getdata();
						l2+=1;
						break;
			}
		}
		for(int i=0;i<l1;i++)
		{
				p[i].display();
		}
		for(int i=0;i<l2;i++)
		{
				t[i].display();
		}
		}
}

