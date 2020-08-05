import java.lang.*;

class IllegalNumberOfArguments extends Exception
{
	public IllegalNumberOfArguments(String s){
		super(s);
	}
}
class InvalidOperatorException extends Exception
{
	public InvalidOperatorException(String s){
		super(s);
	}
}
class NegativeResultException extends Exception
{
	public NegativeResultException(String s){
		super(s);
	}
}

public class Arithmetic{
	public static void main(String args[]){
		int num1=Integer.parseInt(args[0]);
		Character op= new Character(args[1].charAt(0));
		int num2=Integer.parseInt(args[2]);
		int result=0;
		switch(op){
			case'+':
				result=num1+num2;
				System.out.println("Addition of"+num1+"and"+num2+"is"+result);
				break;
			case'-':
				result=num1-num2;
				System.out.println("Subtraction of"+num1+"and"+num2+"is"+result);
				break;
			case'*':
				result=num1*num2;
				System.out.println("Multilication of"+num1+"and"+num2+"is"+result);
				break;
			case'/':
				result=num1/num2;
				System.out.println("Division of"+num1+"and"+num2+"is"+result);
				break;
			case'%':
				result=num1%num2;
				System.out.println("Addition of"+num1+"and"+num2+"is"+result);
				break;

		
		}
		try{
			if(args.length==0){
				IllegalNumberOfArguments ia=new IllegalNumberOfArguments("No input Entered");
				throw ia;
			}
			if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%'){
			}
			else
			{
				InvalidOperatorException io=new InvalidOperatorException("Invalid Operator");
				throw io;
			}
			if(result<0){
				NegativeResultException nr=new NegativeResultException("Result cannot be negative");
				throw nr;
			}
		}catch(IllegalNumberOfArguments ia){
			ia.printStackTrace();
		}
		catch(InvalidOperatorException io){
			io.printStackTrace();
		}
		catch(NegativeResultException nr){
			nr.printStackTrace();
		}
	}
}


