import java.io.*;
import java.util.*;
public class fdir
{
	public static void main(String args[])throws Exception
	{
		String n = args[0];
		File file = new File(n);
		Scanner s = new Scanner(file);
		String[] pathnames;
		if(file.exists())
		{	
		while(s.hasNextLine())
			System.out.println(s.nextLine());
		System.out.println("Name is : "+file.getName());
		System.out.println("Path is : "+file.getAbsolutePath());
		System.out.println("Length is : "+file.length());
		System.out.println("Can Write  : "+file.canWrite());
		System.out.println("Can read : "+file.canRead());
		}
		else if(file.isDirectory())
		{
			File f = new File("C:\Users\NOTEBOOK\Desktop\Java");
			pathnames = f.list();
			for(String pathname : pathnames)
				System.out.println(pathname);
		}
		
	}

}