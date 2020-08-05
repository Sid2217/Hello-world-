
public class asert{
	public static void main(String args[]){
		
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		assert num1>0 && num2>0:"Numbers cannot be negative";
		assert num2>num1:"1st number should be smaller than 2nd";

		for(int i=num1;i<=num2;i++)
		{
			if(i%2!=0)
				System.out.println(i);
		}
	}
}

