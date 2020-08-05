package demo;
import java.util.Scanner;
import demo.mca1;
import demo.mca2;
public class studmca {
	String name;
	int rno,m1,m2;
	Scanner s = new Scanner(System.in);
	void getdata()
	{
		System.out.println("Enter Name : ");
		name = s.next();
		System.out.println("Enter Roll no  : ");
		rno = s.nextInt();
	}
	void display()
	{
		System.out.println("Name is : " + name);
		System.out.println("Roll no is : " + rno);

	}	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("How many Students : ");
		int n = s.nextInt(); 
		studmca st[] = new studmca[n];
		mca1 m1[] = new mca1[n];
		mca2 m2[]= new mca2[n];
		for(int i=0;i<n;i++)
		{
			st[i] = new studmca();
			m1[i] = new mca1();
			m2[i] = new mca2();
			st[i].getdata();
			m1[i].data();
			m2[i].data();
		}
		for(int i=0 ;i<n;i++)
		{
			st[i].display();
			m1[i].display();
			m2[i].display();
		}
	}

}
