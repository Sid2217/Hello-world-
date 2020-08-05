package javaprgs;
class Mymaths
{
	/**
	*JAVA DOC
	*/
	private int num1,num2;
	public Mymaths()
	{
		num1 = 0;
		num2 = 0;			
	}
	public Mymaths(int num1 , int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	void add()
	{
		int c = num1 + num2;
		System.out.println("Addition is : " + c);
	}
	void sub()
	{
		int c = num1 - num2;
		System.out.println("Subtraction is is : " + c);
	}
	void mul()
	{
		int c = num1 * num2;
		System.out.println("Multiplication is : " + c);
	}
	void div()
	{
		int c = num1 / num2;
		System.out.println("Division is : " + c);
	}

}



public class B1
	{
		public static void main(String args[])
			{
				int num1 = Integer.parseInt(args[0]);
				int num2 = Integer.parseInt(args[1]);
				
				Mymaths mm = new Mymaths(num1,num2);
				mm.add();
				mm.sub();
				mm.mul();
				mm.div();							
			}
	}
