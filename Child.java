package Excel;

public class Child extends Parent{

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
