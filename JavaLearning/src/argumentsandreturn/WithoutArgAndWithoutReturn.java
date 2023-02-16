package argumentsandreturn;

public class WithoutArgAndWithoutReturn {
	public void m1()
	{
		System.out.println("without argument and without return type");
	}
	public static void m2()
	{
		System.out.println("without argument and without return type");
	}
	public static void main(String[]args)
	{
		WithoutArgAndWithoutReturn obj=new WithoutArgAndWithoutReturn();
		obj.m1();
		m2();
	}

}
