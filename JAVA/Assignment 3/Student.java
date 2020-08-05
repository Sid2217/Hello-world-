import java.util.Scanner;

public class Student {
	Scanner s = new Scanner(System.in);
	static int count ;
	String name;
	int rno , cls,m1,m2,m3,m4,m5,m6,per;
	void getdata()
	{
		count++;
		System.out.println("Enter Name : ");
		name = s.next();
		System.out.println("Enter Roll no : ");
		rno = s.nextInt();
		System.out.println("Enter Class : ");
		cls = s.nextInt();
		System.out.println("Enter Marks 1 : ");
		m1 = s.nextInt();
		System.out.println("Enter Marks 2 : ");
		m2 = s.nextInt();
		System.out.println("Enter Marks 3 : ");
		m3 = s.nextInt();
		System.out.println("Enter Marks 4 : ");
		m4 = s.nextInt();
		System.out.println("Enter Marks 5 : ");
		m5 = s.nextInt();
		System.out.println("Enter Marks 6 : ");
		m6 = s.nextInt();
	}
	void setdata()
	{
		per = (m1+m2+m3+m4+m5+m6/6)*100;
	}
	void display()
	{
		System.out.println("Name is : " + name);
		System.out.println("Roll no is : " + rno);
		System.out.println("Class is : " + cls);
		System.out.println("Marks 1 is : " + m1);
		System.out.println("Marks 2 is : " + m2);
		System.out.println("Marks 3 is : " + m3);
		System.out.println("Marks 4 is : " + m4);
		System.out.println("Marks 5 is : " + m5);
		System.out.println("Marks 6 is : " + m6);
		System.out.println("Percentage is : " + per);
	}
	int pert() 
	{
		return per;
	}
	static void sort(Student st[])
	{
		for(int i=0;i<count;i++)
		{
			for(int j=0;j<count-i-1;j++)
			{
				if(st[j].pert()>st[j+1].pert())
				{
					Student t = st[j];
					st[j] = st[j+1];
					st[j+1] = t;
				}	
			}
		}
		for(int i=0;i<count;i++)
			st[i].display();
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("How many Students :");
		int n = s.nextInt();
		Student[] st = new Student[n];
		for(int i=0;i<n;i++)
		{
			st[i] = new Student();
			st[i].getdata();
			st[i].setdata();
		}
		Student.sort(st);
	}
}
