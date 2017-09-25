package Excel;

import org.seleniumhq.jetty9.util.Scanner;


public class Reverse {

	public static void main(String args[])
	{
		String str = "Rishabh";
//		String name;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the String");
//		name = sc.next();
		String rev = "";
		
		for(int i = str.length()-1; i>=0; i--)
		{
			rev = rev+str.charAt(i);
			
		}
		
		System.out.println(rev);
		
	}
}
