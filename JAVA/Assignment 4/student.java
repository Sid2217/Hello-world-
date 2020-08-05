package inhertance;

import java.util.Scanner;

abstract class stud
{
	void disp_rno() {}
	void total() {}
}

class mca extends stud
{
		Scanner s = new Scanner(System.in);
		int m1,m2,m3,m4,m5,m6,rno,total;	
		void getdata()
		{
			System.out.println("MCA : ");
			System.out.println("Enter Rno : ");
			rno = s.nextInt();
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
		void disp_rno()
		{
			System.out.println("Roll no is :" + rno);
			System.out.println("Marks 1 : " + m1);
			System.out.println("Marks 2 : " + m2);
			System.out.println("Marks 3 : " + m3);
			System.out.println("Marks 4 : " + m4);
			System.out.println("Marks 5 : " + m5);
			System.out.println("Marks 6 : " + m6);

		}
		void total()
		{
			total = m1+m2+m3+m4+m5+m6;
			System.out.println("Total is : " + total);
		}

}

class msc extends stud
{
	Scanner s = new Scanner(System.in);
	int m1,m2,m3,m4,rno,total;
	void getdata()
	{
		System.out.println("MSC : ");
		System.out.println("Enter Rno : ");
		rno = s.nextInt();
		System.out.println("Enter Marks 1 : ");
		m1 = s.nextInt();	
		System.out.println("Enter Marks 2 : ");
		m2 = s.nextInt();	
		System.out.println("Enter Marks 3 : ");
		m3 = s.nextInt();	
		System.out.println("Enter Marks 4 : ");
		m4 = s.nextInt();	
	}
	void disp_rno()
	{
		System.out.println("Roll no is :" + rno);
		System.out.println("Marks 1 : " + m1);
		System.out.println("Marks 2 : " + m2);
		System.out.println("Marks 3 : " + m3);
		System.out.println("Marks 4 : " + m4);
	}
	void total()
	{
		total = m1+m2+m3+m4;
		System.out.println("Total is : " + total);
	}
}

class bsc extends stud
{
	int m1,m2,m3,m4,m5,m6,m7,m8,rno,total;
	void getdata()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("BSC : ");
		System.out.println("Enter Rno : ");
		rno = s.nextInt();
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
		System.out.println("Enter Marks 7 : ");
		m7 = s.nextInt();	
		System.out.println("Enter Marks 8 : ");
		m8 = s.nextInt();	
	}
	void disp_rno()
	{
		System.out.println("Roll no is :" + rno);
		System.out.println("Marks 1 : " + m1);
		System.out.println("Marks 2 : " + m2);
		System.out.println("Marks 3 : " + m3);
		System.out.println("Marks 4 : " + m4);
		System.out.println("Marks 4 : " + m5);
		System.out.println("Marks 4 : " + m6);
		System.out.println("Marks 4 : " + m7);
		System.out.println("Marks 4 : " + m8);
	}
	void total()
	{
		total = m1+m2+m3+m4+m5+m6+m7+m8;
		System.out.println("Total is : " + total);
	}

}
public class student 
{
	public static void main(String[] args) 
		{
			Scanner s = new Scanner(System.in);
			System.out.println("How many mca students : ");
			int mca = s.nextInt();
			mca mc[] = new mca[mca];
			System.out.println("How many msc students : ");
			int msc = s.nextInt();
			msc ms[] = new msc[msc];
			System.out.println("How many bsc students : ");
			int bsc = s.nextInt();
			bsc bs[] = new bsc[bsc];
			for(int i=0;i<mca;i++)
			{
				mc[i] = new mca();
				mc[i].getdata();
				mc[i].disp_rno();
				mc[i].total();
			}
			for(int i=0;i<msc;i++)
			{
				ms[i] = new msc();
				ms[i].getdata();
				ms[i].disp_rno();
				ms[i].total();
			}
			for(int i=0;i<bsc;i++)
			{
				bs[i] = new bsc();
				bs[i].getdata();
				bs[i].disp_rno();
				bs[i].total();
			}

		}	
}
