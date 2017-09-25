package Excel;

public class Array {



	public static void main(String args[])
	{
		int i = 0;
		int [] number = new int[10];


		while(i<10)
		{
			number[i] = i+100;
			i = i+1;

		}

		i = 0;
		while(i<10)
		{
			System.out.println("number"+"["+i+"]"+ "=" + number[i] );
			i=i+1;
		}
	}
}
