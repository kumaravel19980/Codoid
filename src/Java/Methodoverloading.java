package Java;

public class Methodoverloading {

	public static void main(String[] args) {
		
		addfunction(10,20);
		addfunction (1.5,1.7);
		addfunction (1000000,200000);
		
	}
	
	public static void addfunction(int a, int b)
	{
		System.out.println(a+b);
	}
	public static void addfunction (double a, double b)
	{
		System.out.println(a+b);
	}
	public static void addfunction (long a, long b)
	{
		System.out.println(a+b);
	}
	 
}
