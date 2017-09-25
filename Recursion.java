package Excel;

public class Recursion {

	int i=1;
	public void hello()
	{
		System.out.println("Rishabh");
		i++;
		
		if(i<=10)
		{
			hello();
		}
	}
	
	public static void main(String args[])
	{
		Recursion obj = new Recursion();
		obj.hello();
	}
	
	}
	


