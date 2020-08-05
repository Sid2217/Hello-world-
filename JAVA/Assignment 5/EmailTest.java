import java.util.regex.Matcher;
import java.util.regex.Pattern;

class InvalidUsername extends Exception
{
	public InvalidUsername(String s){//EmailNotValidException
		super(s);
	}
}
class InvalidPassword extends Exception
{
	public InvalidPassword(String s){//EmailNotValidException
		super(s);
	}
}
class ValidDate{
	public static boolean isValidDate(String date)
	{
		String regex="^(1[0-2]|0[1-9])/(3[01]"+"|[12][0-9]|0[1-9])/[0-9]{4}$";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher((CharSequence)date);
		return matcher.matches();
	}
}
public class EmailTest{
	public static void main(String args[]){
		String username="sid@gm.com";
		String password="sid";
		int domainId=123;

		String uname=args[0];
		String pass=args[1];
		String date=args[2];
		ValidDate vd=new ValidDate();
		try{
			if(uname.equals(username))
			{
				System.out.println("User Name is Correct ");
			}
			else 
			{
			InvalidUsername iu=new InvalidUsername("Invalid Username");
				throw iu;
			}			
			if(pass.equals(password))
			{
				System.out.println("Password is Correct ");
			}
			else 
			{
				InvalidPassword ip=new InvalidPassword("Invalid Password");
				throw ip;
			}
			if(vd.isValidDate(date)==true){
				System.out.println("Valid Input");
			}
			else
			{
				System.out.println("Invalid Date");
			}
		}catch(InvalidUsername iu)
		{
			iu.printStackTrace();
		}
		catch(InvalidPassword ip)
		{
			ip.printStackTrace();
		}
	}
}
