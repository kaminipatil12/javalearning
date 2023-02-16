package argumentsandreturn;

public class WithoutArgAndWithReturn {
	public int m1()
	{
		return 55;
	}
	public static boolean m2()
	{
		return true;
	}
	public static void main(String[]args)
	{
		WithoutArgAndWithReturn obj=new	WithoutArgAndWithReturn();
		System.out.println(obj.m1());
		System.out.println(m2());
	}

}
