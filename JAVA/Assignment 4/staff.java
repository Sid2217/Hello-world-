package inhertance;

import java.util.Scanner;

class staf
{
	Scanner s = new Scanner(System.in);
	int id,dob,jd,sal;
	String name;
	void getdata()
	{
		System.out.println("Enter ID");
		id = s.nextInt();
		System.out.println("Enter Name");
		name = s.next();
		System.out.println("Enter Date of Birth");
		dob = s.nextInt();
		System.out.println("Enter Joining date");
		jd = s.nextInt();
		System.out.println("Enter Salary");
		sal = s.nextInt();
	}
	void display()
	{
		System.out.println("ID is : " + id);
		System.out.println("Name is : " + name);
		System.out.println("Date of Birth is : " + dob);
		System.out.println("Joining Date is : " + jd);
		System.out.println("Salary is : " + sal);
	}

}
class teaching extends staf
{
	Scanner s = new Scanner(System.in);
	String sub[] = new String[3];
	int exp;
	void getdata()
	{
		System.out.println("teaching Staff : ");
		super.getdata();
		System.out.println("Enter Experience");
		exp = s.nextInt();
		System.out.println("Enter 3 Subjects");
		for(int i=0;i<3;i++)
			sub[i] = s.next();			
	}
	void display()
	{
		super.display();
		System.out.println("Experience is : "+ exp);
		for(int i=0;i<3;i++)
			System.out.println("Subject : " + sub[i]);
	}
}

class nonteach extends staf
{
	String shift,dept;
	void getdata()
	{
		System.out.println("Non teaching Staff : ");
		super.getdata();
		System.out.println("Enter Department : ");
		dept = s.next();
		System.out.println("Enter Shift : ");
		shift = s.next();
	}
	void display()
	{
		super.display();
		System.out.println("Department is : "+ dept);
		System.out.println("Shift : " + shift);
	}

}

public class staff 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Teaching Staff no :");
		int ts = s.nextInt();
		teaching th[] = new teaching[ts];
		System.out.println("Enter Non Teaching Staff no :");
		int nts = s.nextInt();
		nonteach nt[] =  new nonteach[nts];
		for(int i=0;i<ts;i++)
		{
			th[i] = new teaching();
			th[i].getdata();
			th[i].display();
		}
		for(int i=0;i<nts;i++)
		{
			nt[i] = new nonteach();
			nt[i].getdata();
			nt[i].display();
		}

	}
}
