package Java;

public class fibonacciseries {

	public static void main(String[] args) {
		int x=0;
		int y=1;
	
		for (int a=1; a<=10; a++)
		{
			int z=x+y;
			System.out.println(x);
			x=y;
			y=z;
			
		}

	}

}
