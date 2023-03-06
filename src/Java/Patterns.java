package Java;

public class Patterns {
	// To print a given value
/*	1  
	1  2  
	1  2  3  
	1  2  3  4  
	1  2  3  4  5  
	1  2  3  4  5  6  
	1  2  3  4  5  6  7  */


	public static void main(String[] args) {

		for(int a=1; a<=7;a++)
		{
			for(int b=1; b<=a; b++)
			{
				System.out.print(b+"  ");
			}
			System.out.println();
		}

	}

}
