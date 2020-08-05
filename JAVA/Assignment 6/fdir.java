import java.io.*;
import java.util.*;

public class fdir {
	public static void main(final String args[]) throws Exception {
		String n = args[0];
		File file = new File(n);
		if (file.isFile()) {
			final Scanner s = new Scanner(file);
			while (s.hasNextLine())
				System.out.println(s.nextLine());
			System.out.println("Name is : " + file.getName());
			System.out.println("Path is : " + file.getAbsolutePath());
			System.out.println("Length is : " + file.length());
			System.out.println("Can Write  : " + file.canWrite());
			System.out.println("Can read : " + file.canRead());
		}

		else if (file.isDirectory()) {
			Scanner s = new Scanner(System.in);
			String[] pathname = file.list();
			for (String pathnames : pathname)
				System.out.println(pathnames);
			System.out.println("Count is : " + file.list().length);
			File[] fl = file.listFiles();
			for (File dir : fl) {
				String nam = dir.toString();
				if (nam.endsWith(".txt")) {
					System.out.println("Do You Want to delete : " + dir.getName());
					System.out.println("\n 1:Yes");
					int n1 = s.nextInt();
					if (n1 == 1 && dir.delete())
						System.out.println("File Deleted");
					else
						System.out.println("File Not deleted");

				}

			}

		}

	}

}