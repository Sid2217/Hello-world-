import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class linkedlist {
	void simplell(String n1,String n2,String n3, String n4, String n5)
	{
		LinkedList<String> lt = new LinkedList<String>();
		lt.add(n1);
		lt.add(n2);
		lt.add(n3);
		lt.add(n4);
		lt.add(n5);
		System.out.println("Simple Linked List is : " +lt);
	}
	void doublell(String n1,String n2,String n3, String n4, String n5)
	{
		LinkedList<String> lt = new LinkedList<String>();
		lt.add(n1);
		lt.add(n2);
		lt.add(n3);
		lt.add(n4);
		lt.add(n5);
		ListIterator<String> front = lt.listIterator();
		ListIterator<String> back = lt.listIterator(5);
		System.out.println("Doubly Linked List from start is : ");		
		while(front.hasNext())
			System.out.print("=>"+front.next());
		System.out.println("Doubly Linked List from backward is : ");		
		while(back.hasPrevious())
			System.out.print("=>"+back.previous());
	}
	void circularll(String n1,String n2,String n3, String n4, String n5)
	{
		LinkedList<String> lt = new LinkedList<String>();
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		linkedlist l = new linkedlist();
		String n1,n2,n3,n4,n5;
		int n;
		n1 = args[0];
		n2 = args[1];
		n3 = args[2];
		n4 = args[3];
		n5 = args[4];
		System.out.println("Enter Your Preference : ");
		System.out.println("1 : Simple Linked List");
		System.out.println("2 : Double Linked List");
		System.out.println("3 : Circular Linked List");
		n = s.nextInt();
		switch(n)
		{
		case 1 :l.simplell(n1,n2,n3,n4,n5);	
					break;
		case 2 :l.doublell(n1,n2,n3,n4,n5);
					break;
		case 3 :l.circularll(n1,n2,n3,n4,n5);
					break;
		}
		s.close();
	}
}