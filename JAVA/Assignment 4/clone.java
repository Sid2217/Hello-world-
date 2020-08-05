package inhertance;

import java.util.Scanner;

class studt
{
	Scanner s = new Scanner(System.in);
	int rno,dob;
	String name;
	void getdata()
	{
		System.out.println("Enter Roll no : ");
		rno = s.nextInt();
		System.out.println("Enter Date Of Birth: ");
		dob = s.nextInt();
		System.out.println("Enter Name : ");
		name = s.next();

	}
	void display()
	{
		System.out.println("Roll no is : " + rno);
		System.out.println("name is : " + name);
		System.out.println("Date of Birth is : " + dob);
	}
}
class cr extends studt implements Cloneable
{
	Scanner s = new Scanner(System.in);
	int dos;
	String clsname;
	void getdata()
	{
		super.getdata();
		System.out.println("Enter Date Of Selection : ");
		dos = s.nextInt();
		System.out.println("Enter Class Name : ");
		clsname = s.next();
	}
	void display()
	{
		super.display();
		System.out.println("Date of Selection is : " + dos);
		System.out.println("Class name is : " + clsname);
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
public class clone {

	public static void main(String[] args) throws CloneNotSupportedException
	{
		Scanner s = new Scanner(System.in);		
		System.out.println("How many Students : ");
		int n = s.nextInt();
		cr c[] = new cr[n];
		cr cm[] = new cr[n];
		for(int i=0;i<n;i++)
		{
			c[i] = new cr();
			c[i].getdata();
			c[i].display();
			cm[i] = (cr)c[i].clone();
		}
		System.out.println("For Clone ");
		for(int i=0;i<n;i++)
		{
			cm[i].display();
		}		
	}
}
