package DataDriverFramework;

import Excel.Child;
import Excel.Parent;

public class Child1 extends Parent{

	//int i=1;
	//int i;
	public void test(){
		System.out.println(i);
	}

	public static void main(String args[])
	{
		Parent obj =  new Parent();
		Child obj1 = new Child();

		obj1.test();
	}

}
