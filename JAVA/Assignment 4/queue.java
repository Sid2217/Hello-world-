package inhertance;

import java.util.Scanner;

interface quop
{
	void add(int item);
	int remove();
}

class myqueue implements quop
{	
	int front,rear,size,capacity,array[];
	public myqueue(int capacity) 
	{
		this.capacity = capacity;
		front = this.size = 0 ;
		rear = capacity - 1;
		array = new int[this.capacity];
	}
	
	boolean isfull(myqueue queue)
	{
		return(queue.size == queue.capacity);
	}
	
	boolean isempty(myqueue queue)
	{
		return(queue.size == 0);
	}

	public void add(int item) 
	{
		if(isfull(this))
			return;
		this.rear = (this.rear + 1)%this.capacity;
		this.array[this.rear] = item;
		this.size = this.size + 1;
		System.out.println("Added to the Queue : " + item);
	}
	
	public int remove() 
	{
		if(isempty(this))
			return Integer.MIN_VALUE;
		int item = this.array[this.front];
		this.front = (this.front + 1)%this.capacity;
		this.size = this.size - 1;
		return item;
	}
	
}

public class queue 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x=0;
		System.out.println("Enter First Value to the Queue : ");
		int n = s.nextInt();
		myqueue queue = new myqueue(n);
		do
		{
			System.out.println("0:Exit\n1:Add \n 2:Remove\n");
			x = s.nextInt();
	
			if(x==1)
			{
				System.out.println("Enter Element to Add");
				int item = s.nextInt();
				queue.add(item);
			}
			else if(x==2)
				System.out.println("Item Removed: "+queue.remove());
			else
				System.exit(1);
		}while(x != 0);
	}
}
