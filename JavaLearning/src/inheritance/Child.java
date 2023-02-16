package inheritance;

public class Child extends Parent{
	public static void m2()
	{
		System.out.println("it is static method");
	}
	public static void main(String[]args)
	{
		m2();
		Parent ob=new Parent();
		ob.m1();
	}

}
