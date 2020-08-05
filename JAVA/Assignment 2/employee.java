
class date
{
	int day,month,year;
	public date(int day,int month,int year) 
	{
		this.day = day;
		this.month = month;
		this.year = year;		
	}
	int dy()
	{
		return day;
	}
	int mn()
	{
		return month;
	}
	int yr()
	{
		return year;
	}

}
public class employee {
	date dt1,dt2;
	String name;
	int sal,id ,d1,m1 ,y1,d2,m2 ,y2;
	public employee(String name,int sal,int id ,int d1,int m1 ,int y1,int d2,int m2 ,int y2) 
	{
		dt1 = new date(d1,m1,y1);
		dt2 = new date(d2,m2,y2);
		this.d1 = dt1.dy();
		this.m1 = dt1.mn();
		this.y1 = dt1.yr();
		this.d2 = dt1.dy();
		this.m2 = dt1.mn();
		this.y2 = dt1.yr();
		this.name = name;
		this.sal =  sal;
		this.id = id;
	}
	void display()
	{
		System.out.println("ID is : " + id);
		System.out.println("Name is : " + name);
		System.out.println("Salary is : " + sal);
		System.out.println("Date of Birth is : " + d1 + m1 + y1);
		System.out.println("Date of Joining is : " + d2 + m2 + y2);
	}
	public static void main(String[] args) 
	{
		String name = args[0];
		int id = Integer.parseInt(args[1]);
		int sal= Integer.parseInt(args[2]);
		int d1 = Integer.parseInt(args[3]);
		int m1 = Integer.parseInt(args[4]);
		int y1 = Integer.parseInt(args[5]);
		int d2 = Integer.parseInt(args[6]);
		int m2 = Integer.parseInt(args[7]);
		int y2 = Integer.parseInt(args[8]);
		employee e = new employee(name, sal, id, d1, m1, y1, d2, m2, y2);
		e.display();
	}
}
