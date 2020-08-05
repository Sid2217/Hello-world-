package demo;

import java.util.Scanner;

public class mca1 
{
	Scanner s = new Scanner(System.in);
	int sem1 , sem2,total;
	void data()
	{	
		System.out.println("Mca 1 marks : " );
		System.out.println("Enter sem 1 marks : ");
		sem1 = s.nextInt();
		System.out.println("Enter sem 2 marks : ");
		sem2 = s.nextInt();
	}
	void display()
	{
		System.out.println("Mca 1 marks : " );
		System.out.println("Sem 1 marks : " + sem1);
		System.out.println("Sem 2 marks : " + sem2);
		System.out.println("Grade for Mca 1 is : ");
		total = sem1+sem2;
		if(total >= 70)
			System.out.println("A Class");
		else if(total>=60 & total<70)
			System.out.println("B Class");
		else if(total >= 50 & total<40)
			System.out.println("C Class");
		else
			System.out.println("fail");
	
	}
}
